package chat.rocket.core.internal.realtime;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\n\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0014\u0010\r\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u000f\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u001a\u0010\u0010\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0003\u001a\u0014\u0010\u0012\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0002\u001a,\u0010\u0013\u001a\u00020\u0003*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0017\u001a.\u0010\u0013\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00032\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0017H\u0000\u001a$\u0010\u0019\u001a\u00020\u0003*\u00020\u00142\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0017\u001a&\u0010\u0019\u001a\u00020\u0003*\u00020\b2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0017H\u0000\u001a$\u0010\u001a\u001a\u00020\u0003*\u00020\u00142\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0017\u001a&\u0010\u001a\u001a\u00020\u0003*\u00020\b2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0017H\u0000\u001a\u0012\u0010\u001b\u001a\u00020\u0007*\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0003\u001a\u0014\u0010\u001b\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0000\u00a8\u0006\u001d"}, d2 = {"getMessageType", "Lchat/rocket/core/internal/realtime/Type;", "state", "", "getStreamType", "eventName", "processRoomMessage", "", "Lchat/rocket/core/internal/realtime/Socket;", "text", "processRoomStream", "data", "Lorg/json/JSONObject;", "processSubscriptionResult", "message", "processSubscriptionStream", "processSubscriptionsChanged", "Lchat/rocket/core/internal/model/SocketMessage;", "processUserStream", "subscribeRoomMessages", "Lchat/rocket/core/RocketChatClient;", "roomId", "callback", "Lkotlin/Function2;", "", "subscribeRooms", "subscribeSubscriptions", "unsubscribe", "subId", "core"})
public final class SubscriptionsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String subscribeSubscriptions(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String subscribeRooms(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String subscribeRoomMessages(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback) {
        return null;
    }
    
    public static final void unsubscribe(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String subId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String subscribeSubscriptions(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.Socket $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String subscribeRooms(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.Socket $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String subscribeRoomMessages(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.Socket $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback) {
        return null;
    }
    
    public static final void unsubscribe(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.Socket $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String subId) {
    }
    
    public static final void processSubscriptionsChanged(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.Socket $receiver, @org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.model.SocketMessage message, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public static final void processSubscriptionResult(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.Socket $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private static final void processUserStream(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.Socket $receiver, java.lang.String text) {
    }
    
    private static final void processRoomMessage(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.Socket $receiver, java.lang.String text) {
    }
    
    private static final void processRoomStream(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.Socket $receiver, java.lang.String state, org.json.JSONObject data) {
    }
    
    private static final void processSubscriptionStream(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.Socket $receiver, java.lang.String state, org.json.JSONObject data) {
    }
    
    private static final chat.rocket.core.internal.realtime.Type getMessageType(java.lang.String state) {
        return null;
    }
    
    private static final java.lang.String getStreamType(java.lang.String eventName) {
        return null;
    }
}