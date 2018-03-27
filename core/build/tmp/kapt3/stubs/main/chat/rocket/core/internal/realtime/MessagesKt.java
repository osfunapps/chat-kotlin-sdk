package chat.rocket.core.internal.realtime;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0018\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a \u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\b\u0010\u000e\u001a\u00020\u0001H\u0000\u001a\b\u0010\u000f\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"CONNECT_MESSAGE", "", "connectionStatusMessage", "id", "status", "Lchat/rocket/core/internal/realtime/UserStatus;", "defaultStatusMessage", "loginMethod", "token", "newMessage", "method", "params", "newSubscriptionMessage", "name", "pingMessage", "pongMessage", "roomsStreamMessage", "userId", "streamRoomMessages", "roomId", "subscriptionsStreamMessage", "unsubscribeMessage", "core"})
public final class MessagesKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONNECT_MESSAGE = "{\"msg\":\"connect\",\"version\":\"1\",\"support\":[\"1\",\"pre2\",\"pre1\"]}";
    
    private static final java.lang.String newMessage(java.lang.String method, java.lang.String id, java.lang.String params) {
        return null;
    }
    
    private static final java.lang.String newSubscriptionMessage(java.lang.String name, java.lang.String id, java.lang.String params) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String loginMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String pongMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String pingMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String subscriptionsStreamMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String roomsStreamMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String streamRoomMessages(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String unsubscribeMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String defaultStatusMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.UserStatus status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String connectionStatusMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.UserStatus status) {
        return null;
    }
}