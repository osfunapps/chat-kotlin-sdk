package chat.rocket.core.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 X2\u00020\u0001:\u0001XB\u00b7\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0002\u0010\u001cJ\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u000bH\u00c6\u0003J\t\u0010A\u001a\u00020\u000bH\u00c6\u0003J\t\u0010B\u001a\u00020\u000bH\u00c6\u0003J\t\u0010C\u001a\u00020\rH\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010E\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u000b\u0010F\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\t\u0010G\u001a\u00020\u001bH\u00c6\u0003J\t\u0010H\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0010\u0010M\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010N\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010O\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u00e2\u0001\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u00c6\u0001\u00a2\u0006\u0002\u0010QJ\u0013\u0010R\u001a\u00020\u000b2\b\u0010S\u001a\u0004\u0018\u00010TH\u00d6\u0003J\t\u0010U\u001a\u00020VH\u00d6\u0001J\t\u0010W\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0014\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0012\u001a\u00020\u000b8\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b%\u0010&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010\r8F\u00a2\u0006\u0006\u001a\u0004\b,\u0010&R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b-\u0010&R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u0013\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b3\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0015\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b9\u0010&R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b<\u0010&\u00a8\u0006Y"}, d2 = {"Lchat/rocket/core/model/ChatRoom;", "Lchat/rocket/common/model/BaseRoom;", "id", "", "type", "Lchat/rocket/common/model/RoomType;", "user", "Lchat/rocket/common/model/SimpleUser;", "name", "fullName", "readonly", "", "updatedAt", "", "timestamp", "lastSeen", "topic", "announcement", "default", "open", "alert", "unread", "userMenstions", "groupMentions", "lastMessage", "Lchat/rocket/core/model/Message;", "client", "Lchat/rocket/core/RocketChatClient;", "(Ljava/lang/String;Lchat/rocket/common/model/RoomType;Lchat/rocket/common/model/SimpleUser;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZZJLjava/lang/Long;Ljava/lang/Long;Lchat/rocket/core/model/Message;Lchat/rocket/core/RocketChatClient;)V", "getAlert", "()Z", "getAnnouncement", "()Ljava/lang/String;", "getClient", "()Lchat/rocket/core/RocketChatClient;", "isDefault", "getFullName", "getGroupMentions", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "getLastMessage", "()Lchat/rocket/core/model/Message;", "lastModified", "getLastModified", "getLastSeen", "getName", "getOpen", "getReadonly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTimestamp", "getTopic", "getType", "()Lchat/rocket/common/model/RoomType;", "getUnread", "()J", "getUpdatedAt", "getUser", "()Lchat/rocket/common/model/SimpleUser;", "getUserMenstions", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lchat/rocket/common/model/RoomType;Lchat/rocket/common/model/SimpleUser;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZZJLjava/lang/Long;Ljava/lang/Long;Lchat/rocket/core/model/Message;Lchat/rocket/core/RocketChatClient;)Lchat/rocket/core/model/ChatRoom;", "equals", "other", "", "hashCode", "", "toString", "Companion", "core"})
public final class ChatRoom implements chat.rocket.common.model.BaseRoom {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final chat.rocket.common.model.RoomType type = null;
    @org.jetbrains.annotations.Nullable()
    private final chat.rocket.common.model.SimpleUser user = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String fullName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean readonly = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long updatedAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long timestamp = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long lastSeen = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String topic = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String announcement = null;
    private final boolean open = false;
    private final boolean alert = false;
    private final long unread = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long userMenstions = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long groupMentions = null;
    @org.jetbrains.annotations.Nullable()
    private final chat.rocket.core.model.Message lastMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final chat.rocket.core.RocketChatClient client = null;
    public static final chat.rocket.core.model.ChatRoom.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLastModified() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public chat.rocket.common.model.RoomType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public chat.rocket.common.model.SimpleUser getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getFullName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Boolean getReadonly() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getTimestamp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLastSeen() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTopic() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAnnouncement() {
        return null;
    }
    
    public final boolean isDefault() {
        return false;
    }
    
    public final boolean getOpen() {
        return false;
    }
    
    public final boolean getAlert() {
        return false;
    }
    
    public final long getUnread() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getUserMenstions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getGroupMentions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.core.model.Message getLastMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.core.RocketChatClient getClient() {
        return null;
    }
    
    public ChatRoom(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    chat.rocket.common.model.RoomType type, @org.jetbrains.annotations.Nullable()
    chat.rocket.common.model.SimpleUser user, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String fullName, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean readonly, @org.jetbrains.annotations.Nullable()
    java.lang.Long updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long timestamp, @org.jetbrains.annotations.Nullable()
    java.lang.Long lastSeen, @org.jetbrains.annotations.Nullable()
    java.lang.String topic, @org.jetbrains.annotations.Nullable()
    java.lang.String announcement, boolean p11_772401952, boolean open, boolean alert, long unread, @org.jetbrains.annotations.Nullable()
    java.lang.Long userMenstions, @org.jetbrains.annotations.Nullable()
    java.lang.Long groupMentions, @org.jetbrains.annotations.Nullable()
    chat.rocket.core.model.Message lastMessage, @org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient client) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.common.model.RoomType component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.common.model.SimpleUser component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final long component15() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.core.model.Message component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.core.RocketChatClient component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.core.model.ChatRoom copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    chat.rocket.common.model.RoomType type, @org.jetbrains.annotations.Nullable()
    chat.rocket.common.model.SimpleUser user, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String fullName, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean readonly, @org.jetbrains.annotations.Nullable()
    java.lang.Long updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long timestamp, @org.jetbrains.annotations.Nullable()
    java.lang.Long lastSeen, @org.jetbrains.annotations.Nullable()
    java.lang.String topic, @org.jetbrains.annotations.Nullable()
    java.lang.String announcement, boolean p11_772401952, boolean open, boolean alert, long unread, @org.jetbrains.annotations.Nullable()
    java.lang.Long userMenstions, @org.jetbrains.annotations.Nullable()
    java.lang.Long groupMentions, @org.jetbrains.annotations.Nullable()
    chat.rocket.core.model.Message lastMessage, @org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient client) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lchat/rocket/core/model/ChatRoom$Companion;", "", "()V", "create", "Lchat/rocket/core/model/ChatRoom;", "room", "Lchat/rocket/core/model/Room;", "subscription", "Lchat/rocket/core/internal/model/Subscription;", "client", "Lchat/rocket/core/RocketChatClient;", "core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final chat.rocket.core.model.ChatRoom create(@org.jetbrains.annotations.NotNull()
        chat.rocket.core.model.Room room, @org.jetbrains.annotations.NotNull()
        chat.rocket.core.internal.model.Subscription subscription, @org.jetbrains.annotations.NotNull()
        chat.rocket.core.RocketChatClient client) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}