package rocket.chat.kotlin.sample

import chat.rocket.common.RocketChatException
import chat.rocket.common.model.BaseRoom
import chat.rocket.common.model.RoomType
import chat.rocket.common.model.ServerInfo
import chat.rocket.common.model.Token
import chat.rocket.common.util.PlatformLogger
import chat.rocket.common.util.ifNull
import chat.rocket.core.RocketChatClient
import chat.rocket.core.TokenRepository
import chat.rocket.core.compat.Callback
import chat.rocket.core.compat.serverInfo
import chat.rocket.core.internal.realtime.*
import chat.rocket.core.internal.rest.chatRooms
import chat.rocket.core.internal.rest.configurations
import chat.rocket.core.internal.rest.getRoomFavoriteMessages
import chat.rocket.core.internal.rest.login
import chat.rocket.core.internal.rest.sendMessage
import chat.rocket.core.internal.rest.settings
import chat.rocket.core.internal.rest.signup
import chat.rocket.core.model.Myself
import chat.rocket.core.model.history
import chat.rocket.core.model.messages
import chat.rocket.core.rxjava.me
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.channels.Channel
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit
import kotlin.math.log
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val logger = object : PlatformLogger {
        override fun debug(s: String) {
            println(s)
        }

        override fun info(s: String) {
            println(s)
        }

        override fun warn(s: String) {
            println(s)
        }
    }

    val interceptor = HttpLoggingInterceptor()
    interceptor.level = HttpLoggingInterceptor.Level.BODY
    val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .build()

    val client = RocketChatClient.create {
        httpClient = okHttpClient
        restUrl = "https://unstable.rocket.chat"
        tokenRepository = SimpleTokenRepository()
        platformLogger = logger
    }

    // using coroutines
    val job = launch(CommonPool) {

        val token = client.login("luciofm-testing", "vpnfe5lnv!")
        logger.debug("Login: ${token.userId} - ${token.authToken}")

        launch {
            val statusChannel = Channel<State>()
            client.addStateChannel(statusChannel)
            for (status in statusChannel) {
                logger.debug("Changing status to: $status")
                when (status) {
                    is State.Authenticating -> logger.debug("Authenticating")
                    is State.Connected -> {
                        logger.debug("Connected")
                        client.subscribeSubscriptions { _, _ -> }
                        client.subscribeRooms { _, _ -> }
                    }
                }
            }
            logger.debug("Done on statusChannel")
        }

        launch {
            for (room in client.roomsChannel) {
                logger.debug("Room: $room")
            }
        }

        launch {
            for (subscription in client.subscriptionsChannel) {
                logger.debug("Subscription: $subscription")
            }
        }

        launch {
            delay(10000)
            client.setConnectionStatus(UserStatus.Online)
            delay(2000)
            client.setDefaultStatus(UserStatus.Away)
        }

        client.connect()

/*        client.sendMessage(roomId = "GENERAL",
                text = "Sending message from SDK to #general and @here with url https://github.com/RocketChat/Rocket.Chat.Kotlin.SDK/",
                alias = "TestingAlias",
                emoji = ":smirk:",
                avatar = "https://avatars2.githubusercontent.com/u/224255?s=88&v=4")

        pinMessage(client)*/

        //getMeInfoByRx(client)

        val rooms = client.chatRooms()
        logger.debug("ChatRooms: $rooms")
        val room = rooms.update.lastOrNull { room -> room.id.contentEquals("GENERAL") }
        logger.debug("Room: $room")
        val messages = room?.messages()
        messages?.let {
            logger.debug("Messages: $messages")
        }

        val messages2 = room?.history()
        messages2?.let {
            logger.debug("Messages2: $messages2")
        }
    }

    // simple old callbacks
    client.serverInfo(object : Callback<ServerInfo> {
        override fun onSuccess(data: ServerInfo) {
            logger.debug("Server: $data")
        }

        override fun onError(error: RocketChatException) {
            error.printStackTrace()
        }
    })

    runBlocking {
        //delay(10000)
        //client.disconnect()
        job.join()
        //delay(2000)
        //  exitProcess(-1)
    }
}

fun getMeInfoByRx(client: RocketChatClient) {
    // using RxJava2
    val myself: Single<Myself> = client.me()
    myself
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.newThread())
            .subscribe { self ->
                println("Self: $self")
            }
}

suspend fun pinMessage(client: RocketChatClient) {
        val result = client.getRoomFavoriteMessages("GENERAL", RoomType.CHANNEL, 0)
        println("favoriteMessages: $result")
}

class SimpleTokenRepository : TokenRepository {
    private var savedToken: Token? = null
    override fun save(token: Token) {
        savedToken = token
    }

    override fun get(): Token? {
        return savedToken
    }
}
