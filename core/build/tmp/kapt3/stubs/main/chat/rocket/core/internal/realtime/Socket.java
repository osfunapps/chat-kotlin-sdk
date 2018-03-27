package chat.rocket.core.internal.realtime;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00d2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\u0002\u0010\fJ\b\u0010M\u001a\u00020HH\u0002J\r\u0010N\u001a\u00020HH\u0000\u00a2\u0006\u0002\bOJ\u0019\u0010P\u001a\u00020H2\u0006\u0010Q\u001a\u00020RH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010SJ\r\u0010T\u001a\u00020HH\u0000\u00a2\u0006\u0002\bUJ\r\u0010V\u001a\u00020/H\u0000\u00a2\u0006\u0002\bWJ\"\u0010X\u001a\u00020H2\u0006\u0010Y\u001a\u00020:2\u0006\u0010Z\u001a\u00020R2\b\u0010[\u001a\u0004\u0018\u00010/H\u0016J\"\u0010\\\u001a\u00020H2\u0006\u0010Y\u001a\u00020:2\u0006\u0010Z\u001a\u00020R2\b\u0010[\u001a\u0004\u0018\u00010/H\u0016J$\u0010]\u001a\u00020H2\u0006\u0010Y\u001a\u00020:2\b\u0010^\u001a\u0004\u0018\u00010_2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\u001a\u0010b\u001a\u00020H2\u0006\u0010Y\u001a\u00020:2\b\u0010c\u001a\u0004\u0018\u00010/H\u0016J\u001a\u0010b\u001a\u00020H2\u0006\u0010Y\u001a\u00020:2\b\u0010d\u001a\u0004\u0018\u00010eH\u0016J\u001a\u0010f\u001a\u00020H2\u0006\u0010Y\u001a\u00020:2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\u0018\u0010g\u001a\u00020H2\u0006\u0010h\u001a\u00020\u001f2\u0006\u0010c\u001a\u00020/H\u0002J\u0010\u0010i\u001a\u00020H2\u0006\u0010h\u001a\u00020\u001fH\u0002J\u0010\u0010j\u001a\u00020H2\u0006\u0010c\u001a\u00020/H\u0002J\u0018\u0010k\u001a\u00020H2\u0006\u0010h\u001a\u00020\u001f2\u0006\u0010c\u001a\u00020/H\u0002J\u0010\u0010l\u001a\u00020H2\u0006\u0010m\u001a\u00020nH\u0002J\u0011\u0010o\u001a\u00020HH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010pJ\u0015\u0010q\u001a\u00020H2\u0006\u0010h\u001a\u00020/H\u0000\u00a2\u0006\u0002\brJ\u0010\u0010s\u001a\u00020H2\u0006\u0010t\u001a\u00020\u0012H\u0002J\u0015\u0010u\u001a\u00020H2\u0006\u0010v\u001a\u00020\u0012H\u0000\u00a2\u0006\u0002\bwJ\b\u0010x\u001a\u00020HH\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u000e\u00107\u001a\u000208X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R0\u0010?\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120.0@j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120.`AX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010!RT\u0010E\u001aB\u0012\u0004\u0012\u00020/\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020H0G0Fj \u0012\u0004\u0012\u00020/\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020H0G`IX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0010\u0010L\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006y"}, d2 = {"Lchat/rocket/core/internal/realtime/Socket;", "Lokhttp3/WebSocketListener;", "client", "Lchat/rocket/core/RocketChatClient;", "roomsChannel", "Lkotlinx/coroutines/experimental/channels/SendChannel;", "Lchat/rocket/core/internal/realtime/StreamMessage;", "Lchat/rocket/core/model/Room;", "subscriptionsChannel", "Lchat/rocket/core/internal/model/Subscription;", "messagesChannel", "Lchat/rocket/core/model/Message;", "(Lchat/rocket/core/RocketChatClient;Lkotlinx/coroutines/experimental/channels/SendChannel;Lkotlinx/coroutines/experimental/channels/SendChannel;Lkotlinx/coroutines/experimental/channels/SendChannel;)V", "getClient$core", "()Lchat/rocket/core/RocketChatClient;", "currentId", "Ljava/util/concurrent/atomic/AtomicInteger;", "currentState", "Lchat/rocket/core/internal/realtime/State;", "getCurrentState$core", "()Lchat/rocket/core/internal/realtime/State;", "setCurrentState$core", "(Lchat/rocket/core/internal/realtime/State;)V", "httpClient", "Lokhttp3/OkHttpClient;", "logger", "Lchat/rocket/common/util/Logger;", "getLogger$core", "()Lchat/rocket/common/util/Logger;", "messageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lchat/rocket/core/internal/model/SocketMessage;", "getMessagesChannel$core", "()Lkotlinx/coroutines/experimental/channels/SendChannel;", "moshi", "Lcom/squareup/moshi/Moshi;", "getMoshi$core", "()Lcom/squareup/moshi/Moshi;", "parentJob", "Lkotlinx/coroutines/experimental/Job;", "getParentJob$core", "()Lkotlinx/coroutines/experimental/Job;", "setParentJob$core", "(Lkotlinx/coroutines/experimental/Job;)V", "pingJob", "processingChannel", "Lkotlinx/coroutines/experimental/channels/Channel;", "", "readJob", "reconnectJob", "reconnectionStrategy", "Lchat/rocket/core/internal/realtime/ReconnectionStrategy;", "request", "Lokhttp3/Request;", "getRoomsChannel$core", "selfDisconnect", "", "socket", "Lokhttp3/WebSocket;", "getSocket$core", "()Lokhttp3/WebSocket;", "setSocket$core", "(Lokhttp3/WebSocket;)V", "statusChannelList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getStatusChannelList$core", "()Ljava/util/ArrayList;", "getSubscriptionsChannel$core", "subscriptionsMap", "Ljava/util/HashMap;", "Lkotlin/Function2;", "", "Lkotlin/collections/HashMap;", "getSubscriptionsMap$core", "()Ljava/util/HashMap;", "timeoutJob", "close", "connect", "connect$core", "delayReconnection", "reconnectInterval", "", "(ILkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "disconnect", "disconnect$core", "generateId", "generateId$core", "onClosed", "webSocket", "code", "reason", "onClosing", "onFailure", "throwable", "", "response", "Lokhttp3/Response;", "onMessage", "text", "bytes", "Lokio/ByteString;", "onOpen", "processAuthenticationResponse", "message", "processConnectionMessage", "processIncomingMessage", "processMessage", "reschedulePing", "type", "Lchat/rocket/core/internal/model/MessageType;", "schedulePingTimeout", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "send", "send$core", "sendState", "state", "setState", "newState", "setState$core", "startReconnection", "core"})
public final class Socket extends okhttp3.WebSocketListener {
    private final okhttp3.Request request = null;
    private final okhttp3.OkHttpClient httpClient = null;
    @org.jetbrains.annotations.NotNull()
    private final chat.rocket.common.util.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    private final com.squareup.moshi.Moshi moshi = null;
    private final com.squareup.moshi.JsonAdapter<chat.rocket.core.internal.model.SocketMessage> messageAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private chat.rocket.core.internal.realtime.State currentState;
    @org.jetbrains.annotations.Nullable()
    private okhttp3.WebSocket socket;
    private kotlinx.coroutines.experimental.channels.Channel<java.lang.String> processingChannel;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<kotlinx.coroutines.experimental.channels.Channel<chat.rocket.core.internal.realtime.State>> statusChannelList = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.experimental.Job parentJob;
    private kotlinx.coroutines.experimental.Job readJob;
    private kotlinx.coroutines.experimental.Job pingJob;
    private kotlinx.coroutines.experimental.Job reconnectJob;
    private kotlinx.coroutines.experimental.Job timeoutJob;
    private final java.util.concurrent.atomic.AtomicInteger currentId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<java.lang.String, kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.String, kotlin.Unit>> subscriptionsMap = null;
    private final chat.rocket.core.internal.realtime.ReconnectionStrategy reconnectionStrategy = null;
    private boolean selfDisconnect;
    @org.jetbrains.annotations.NotNull()
    private final chat.rocket.core.RocketChatClient client = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.experimental.channels.SendChannel<chat.rocket.core.internal.realtime.StreamMessage<chat.rocket.core.model.Room>> roomsChannel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.experimental.channels.SendChannel<chat.rocket.core.internal.realtime.StreamMessage<chat.rocket.core.internal.model.Subscription>> subscriptionsChannel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.experimental.channels.SendChannel<chat.rocket.core.model.Message> messagesChannel = null;
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.common.util.Logger getLogger$core() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.squareup.moshi.Moshi getMoshi$core() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.core.internal.realtime.State getCurrentState$core() {
        return null;
    }
    
    public final void setCurrentState$core(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.State p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.WebSocket getSocket$core() {
        return null;
    }
    
    public final void setSocket$core(@org.jetbrains.annotations.Nullable()
    okhttp3.WebSocket p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<kotlinx.coroutines.experimental.channels.Channel<chat.rocket.core.internal.realtime.State>> getStatusChannelList$core() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.experimental.Job getParentJob$core() {
        return null;
    }
    
    public final void setParentJob$core(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.experimental.Job p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.String, kotlin.Unit>> getSubscriptionsMap$core() {
        return null;
    }
    
    public final void connect$core() {
    }
    
    public final void disconnect$core() {
    }
    
    private final void startReconnection() {
    }
    
    @org.jetbrains.annotations.Nullable()
    final java.lang.Object delayReconnection(int reconnectInterval, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    private final void processIncomingMessage(java.lang.String text) {
    }
    
    private final void processConnectionMessage(chat.rocket.core.internal.model.SocketMessage message) {
    }
    
    private final void processAuthenticationResponse(chat.rocket.core.internal.model.SocketMessage message, java.lang.String text) {
    }
    
    private final void processMessage(chat.rocket.core.internal.model.SocketMessage message, java.lang.String text) {
    }
    
    public final void send$core(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final void reschedulePing(chat.rocket.core.internal.model.MessageType type) {
    }
    
    @org.jetbrains.annotations.Nullable()
    final java.lang.Object schedulePingTimeout(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    public final void setState$core(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.State newState) {
    }
    
    private final void sendState(chat.rocket.core.internal.realtime.State state) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String generateId$core() {
        return null;
    }
    
    private final void close() {
    }
    
    @java.lang.Override()
    public void onOpen(@org.jetbrains.annotations.NotNull()
    okhttp3.WebSocket webSocket, @org.jetbrains.annotations.Nullable()
    okhttp3.Response response) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    okhttp3.WebSocket webSocket, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable, @org.jetbrains.annotations.Nullable()
    okhttp3.Response response) {
    }
    
    @java.lang.Override()
    public void onClosing(@org.jetbrains.annotations.NotNull()
    okhttp3.WebSocket webSocket, int code, @org.jetbrains.annotations.Nullable()
    java.lang.String reason) {
    }
    
    @java.lang.Override()
    public void onMessage(@org.jetbrains.annotations.NotNull()
    okhttp3.WebSocket webSocket, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    public void onMessage(@org.jetbrains.annotations.NotNull()
    okhttp3.WebSocket webSocket, @org.jetbrains.annotations.Nullable()
    okio.ByteString bytes) {
    }
    
    @java.lang.Override()
    public void onClosed(@org.jetbrains.annotations.NotNull()
    okhttp3.WebSocket webSocket, int code, @org.jetbrains.annotations.Nullable()
    java.lang.String reason) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.core.RocketChatClient getClient$core() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.experimental.channels.SendChannel<chat.rocket.core.internal.realtime.StreamMessage<chat.rocket.core.model.Room>> getRoomsChannel$core() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.experimental.channels.SendChannel<chat.rocket.core.internal.realtime.StreamMessage<chat.rocket.core.internal.model.Subscription>> getSubscriptionsChannel$core() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.experimental.channels.SendChannel<chat.rocket.core.model.Message> getMessagesChannel$core() {
        return null;
    }
    
    public Socket(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient client, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.experimental.channels.SendChannel<? super chat.rocket.core.internal.realtime.StreamMessage<chat.rocket.core.model.Room>> roomsChannel, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.experimental.channels.SendChannel<? super chat.rocket.core.internal.realtime.StreamMessage<chat.rocket.core.internal.model.Subscription>> subscriptionsChannel, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.experimental.channels.SendChannel<? super chat.rocket.core.model.Message> messagesChannel) {
        super();
    }
}