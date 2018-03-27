package chat.rocket.core.model;

import java.lang.System;

@se.ansman.kotshi.JsonSerializable()
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u000bH\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0080\u0001\u0010.\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u000102H\u00d6\u0003J\t\u00103\u001a\u000204H\u00d6\u0001J\t\u00105\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\u00a8\u00066"}, d2 = {"Lchat/rocket/core/model/Room;", "Lchat/rocket/common/model/BaseRoom;", "id", "", "type", "Lchat/rocket/common/model/RoomType;", "user", "Lchat/rocket/common/model/SimpleUser;", "name", "fullName", "readonly", "", "updatedAt", "", "topic", "announcement", "lastMessage", "Lchat/rocket/core/model/Message;", "(Ljava/lang/String;Lchat/rocket/common/model/RoomType;Lchat/rocket/common/model/SimpleUser;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lchat/rocket/core/model/Message;)V", "getAnnouncement", "()Ljava/lang/String;", "getFullName", "getId", "getLastMessage", "()Lchat/rocket/core/model/Message;", "getName", "getReadonly", "()Ljava/lang/Boolean;", "getTopic", "getType", "()Lchat/rocket/common/model/RoomType;", "getUpdatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUser", "()Lchat/rocket/common/model/SimpleUser;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lchat/rocket/common/model/RoomType;Lchat/rocket/common/model/SimpleUser;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lchat/rocket/core/model/Message;)Lchat/rocket/core/model/Room;", "equals", "other", "", "hashCode", "", "toString", "core"})
public final class Room implements chat.rocket.common.model.BaseRoom {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final chat.rocket.common.model.RoomType type = null;
    @org.jetbrains.annotations.Nullable()
    private final chat.rocket.common.model.SimpleUser user = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String fullName = null;
    private final boolean readonly = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long updatedAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String topic = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String announcement = null;
    @org.jetbrains.annotations.Nullable()
    private final chat.rocket.core.model.Message lastMessage = null;
    
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getFullName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getTopic() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAnnouncement() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.core.model.Message getLastMessage() {
        return null;
    }
    
    public Room(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "_id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "t")
    chat.rocket.common.model.RoomType type, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "u")
    chat.rocket.common.model.SimpleUser user, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "fname")
    java.lang.String fullName, @se.ansman.kotshi.JsonDefaultValueBoolean(value = false)
    @com.squareup.moshi.Json(name = "ro")
    boolean readonly, @org.jetbrains.annotations.Nullable()
    @chat.rocket.common.internal.ISO8601Date()
    @com.squareup.moshi.Json(name = "_updatedAt")
    java.lang.Long updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String topic, @org.jetbrains.annotations.Nullable()
    java.lang.String announcement, @org.jetbrains.annotations.Nullable()
    chat.rocket.core.model.Message lastMessage) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.core.model.Message component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.core.model.Room copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "_id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "t")
    chat.rocket.common.model.RoomType type, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "u")
    chat.rocket.common.model.SimpleUser user, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "fname")
    java.lang.String fullName, @se.ansman.kotshi.JsonDefaultValueBoolean(value = false)
    @com.squareup.moshi.Json(name = "ro")
    boolean readonly, @org.jetbrains.annotations.Nullable()
    @chat.rocket.common.internal.ISO8601Date()
    @com.squareup.moshi.Json(name = "_updatedAt")
    java.lang.Long updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String topic, @org.jetbrains.annotations.Nullable()
    java.lang.String announcement, @org.jetbrains.annotations.Nullable()
    chat.rocket.core.model.Message lastMessage) {
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
}