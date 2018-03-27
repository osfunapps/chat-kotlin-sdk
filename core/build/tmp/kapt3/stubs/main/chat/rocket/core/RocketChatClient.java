package chat.rocket.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 ;2\u00020\u0001:\u0002:;B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\'\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0014\u00105\u001a\u0002062\f\u00107\u001a\b\u0012\u0004\u0012\u00020*0\u0013J\u0014\u00108\u001a\u0002062\f\u00107\u001a\b\u0012\u0004\u0012\u00020*0\u0013J\u0010\u00109\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0014\u0010%\u001a\u00020&X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010)\u001a\u00020*8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010,R\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\"0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0016R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104\u00a8\u0006<"}, d2 = {"Lchat/rocket/core/RocketChatClient;", "", "builder", "Lchat/rocket/core/RocketChatClient$Builder;", "(Lchat/rocket/core/RocketChatClient$Builder;)V", "httpClient", "Lokhttp3/OkHttpClient;", "baseUrl", "", "tokenRepository", "Lchat/rocket/core/TokenRepository;", "logger", "Lchat/rocket/common/util/Logger;", "(Lokhttp3/OkHttpClient;Ljava/lang/String;Lchat/rocket/core/TokenRepository;Lchat/rocket/common/util/Logger;)V", "getHttpClient$core", "()Lokhttp3/OkHttpClient;", "getLogger$core", "()Lchat/rocket/common/util/Logger;", "messagesChannel", "Lkotlinx/coroutines/experimental/channels/Channel;", "Lchat/rocket/core/model/Message;", "getMessagesChannel", "()Lkotlinx/coroutines/experimental/channels/Channel;", "moshi", "Lcom/squareup/moshi/Moshi;", "getMoshi$core", "()Lcom/squareup/moshi/Moshi;", "restUrl", "Lokhttp3/HttpUrl;", "getRestUrl$core", "()Lokhttp3/HttpUrl;", "setRestUrl$core", "(Lokhttp3/HttpUrl;)V", "roomsChannel", "Lchat/rocket/core/internal/realtime/StreamMessage;", "Lchat/rocket/core/model/Room;", "getRoomsChannel", "socket", "Lchat/rocket/core/internal/realtime/Socket;", "getSocket$core", "()Lchat/rocket/core/internal/realtime/Socket;", "state", "Lchat/rocket/core/internal/realtime/State;", "getState", "()Lchat/rocket/core/internal/realtime/State;", "subscriptionsChannel", "Lchat/rocket/core/internal/model/Subscription;", "getSubscriptionsChannel", "getTokenRepository$core", "()Lchat/rocket/core/TokenRepository;", "url", "getUrl", "()Ljava/lang/String;", "addStateChannel", "", "channel", "removeStateChannel", "sanitizeUrl", "Builder", "Companion", "core"})
public final class RocketChatClient {
    @org.jetbrains.annotations.NotNull()
    private final com.squareup.moshi.Moshi moshi = null;
    @org.jetbrains.annotations.NotNull()
    public okhttp3.HttpUrl restUrl;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.experimental.channels.Channel<chat.rocket.core.internal.realtime.StreamMessage<chat.rocket.core.model.Room>> roomsChannel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.experimental.channels.Channel<chat.rocket.core.internal.realtime.StreamMessage<chat.rocket.core.internal.model.Subscription>> subscriptionsChannel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.experimental.channels.Channel<chat.rocket.core.model.Message> messagesChannel = null;
    @org.jetbrains.annotations.NotNull()
    private final chat.rocket.core.internal.realtime.Socket socket = null;
    @org.jetbrains.annotations.NotNull()
    private final okhttp3.OkHttpClient httpClient = null;
    @org.jetbrains.annotations.NotNull()
    private final chat.rocket.core.TokenRepository tokenRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final chat.rocket.common.util.Logger logger = null;
    @org.jetbrains.annotations.Nullable()
    private static final okhttp3.MediaType CONTENT_TYPE_JSON = null;
    public static final chat.rocket.core.RocketChatClient.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.squareup.moshi.Moshi getMoshi$core() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.HttpUrl getRestUrl$core() {
        return null;
    }
    
    public final void setRestUrl$core(@org.jetbrains.annotations.NotNull()
    okhttp3.HttpUrl p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.experimental.channels.Channel<chat.rocket.core.internal.realtime.StreamMessage<chat.rocket.core.model.Room>> getRoomsChannel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.experimental.channels.Channel<chat.rocket.core.internal.realtime.StreamMessage<chat.rocket.core.internal.model.Subscription>> getSubscriptionsChannel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.experimental.channels.Channel<chat.rocket.core.model.Message> getMessagesChannel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.core.internal.realtime.Socket getSocket$core() {
        return null;
    }
    
    private final java.lang.String sanitizeUrl(java.lang.String baseUrl) {
        return null;
    }
    
    public final void addStateChannel(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.experimental.channels.Channel<chat.rocket.core.internal.realtime.State> channel) {
    }
    
    public final void removeStateChannel(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.experimental.channels.Channel<chat.rocket.core.internal.realtime.State> channel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.core.internal.realtime.State getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient getHttpClient$core() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.core.TokenRepository getTokenRepository$core() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.common.util.Logger getLogger$core() {
        return null;
    }
    
    private RocketChatClient(okhttp3.OkHttpClient httpClient, java.lang.String baseUrl, chat.rocket.core.TokenRepository tokenRepository, chat.rocket.common.util.Logger logger) {
        super();
    }
    
    private RocketChatClient(chat.rocket.core.RocketChatClient.Builder builder) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B \b\u0016\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\b\u0005\u00a2\u0006\u0002\u0010\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010 \u001a\u00020!J\u001f\u0010\b\u001a\u00020\u00002\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\u0003\u00a2\u0006\u0002\b\u0005J\u001f\u0010\u000e\u001a\u00020\u00002\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f0\u0003\u00a2\u0006\u0002\b\u0005J\u001f\u0010\u0014\u001a\u00020\u00002\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00150\u0003\u00a2\u0006\u0002\b\u0005J\u001f\u0010\u001a\u001a\u00020\u00002\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001b0\u0003\u00a2\u0006\u0002\b\u0005R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006\""}, d2 = {"Lchat/rocket/core/RocketChatClient$Builder;", "", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "()V", "httpClient", "Lokhttp3/OkHttpClient;", "getHttpClient", "()Lokhttp3/OkHttpClient;", "setHttpClient", "(Lokhttp3/OkHttpClient;)V", "platformLogger", "Lchat/rocket/common/util/PlatformLogger;", "getPlatformLogger", "()Lchat/rocket/common/util/PlatformLogger;", "setPlatformLogger", "(Lchat/rocket/common/util/PlatformLogger;)V", "restUrl", "", "getRestUrl", "()Ljava/lang/String;", "setRestUrl", "(Ljava/lang/String;)V", "tokenRepository", "Lchat/rocket/core/TokenRepository;", "getTokenRepository", "()Lchat/rocket/core/TokenRepository;", "setTokenRepository", "(Lchat/rocket/core/TokenRepository;)V", "build", "Lchat/rocket/core/RocketChatClient;", "core"})
    public static final class Builder {
        @org.jetbrains.annotations.NotNull()
        public okhttp3.OkHttpClient httpClient;
        @org.jetbrains.annotations.NotNull()
        public java.lang.String restUrl;
        @org.jetbrains.annotations.NotNull()
        public chat.rocket.core.TokenRepository tokenRepository;
        @org.jetbrains.annotations.NotNull()
        public chat.rocket.common.util.PlatformLogger platformLogger;
        
        @org.jetbrains.annotations.NotNull()
        public final okhttp3.OkHttpClient getHttpClient() {
            return null;
        }
        
        public final void setHttpClient(@org.jetbrains.annotations.NotNull()
        okhttp3.OkHttpClient p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRestUrl() {
            return null;
        }
        
        public final void setRestUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final chat.rocket.core.TokenRepository getTokenRepository() {
            return null;
        }
        
        public final void setTokenRepository(@org.jetbrains.annotations.NotNull()
        chat.rocket.core.TokenRepository p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final chat.rocket.common.util.PlatformLogger getPlatformLogger() {
            return null;
        }
        
        public final void setPlatformLogger(@org.jetbrains.annotations.NotNull()
        chat.rocket.common.util.PlatformLogger p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final chat.rocket.core.RocketChatClient.Builder httpClient(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super chat.rocket.core.RocketChatClient.Builder, ? extends okhttp3.OkHttpClient> init) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final chat.rocket.core.RocketChatClient.Builder restUrl(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super chat.rocket.core.RocketChatClient.Builder, java.lang.String> init) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final chat.rocket.core.RocketChatClient.Builder tokenRepository(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super chat.rocket.core.RocketChatClient.Builder, ? extends chat.rocket.core.TokenRepository> init) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final chat.rocket.core.RocketChatClient.Builder platformLogger(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super chat.rocket.core.RocketChatClient.Builder, ? extends chat.rocket.common.util.PlatformLogger> init) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final chat.rocket.core.RocketChatClient build() {
            return null;
        }
        
        private Builder() {
            super();
        }
        
        public Builder(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super chat.rocket.core.RocketChatClient.Builder, kotlin.Unit> init) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0007\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\b\rR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lchat/rocket/core/RocketChatClient$Companion;", "", "()V", "CONTENT_TYPE_JSON", "Lokhttp3/MediaType;", "getCONTENT_TYPE_JSON", "()Lokhttp3/MediaType;", "create", "Lchat/rocket/core/RocketChatClient;", "init", "Lkotlin/Function1;", "Lchat/rocket/core/RocketChatClient$Builder;", "", "Lkotlin/ExtensionFunctionType;", "core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final okhttp3.MediaType getCONTENT_TYPE_JSON() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final chat.rocket.core.RocketChatClient create(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super chat.rocket.core.RocketChatClient.Builder, kotlin.Unit> init) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}