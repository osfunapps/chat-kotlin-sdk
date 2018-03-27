package chat.rocket.core.internal.model;

import java.lang.System;

@se.ansman.kotshi.JsonSerializable()
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b7\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00b3\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\f\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u0017J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\t\u00104\u001a\u00020\fH\u00c6\u0003J\t\u00105\u001a\u00020\fH\u00c6\u0003J\t\u00106\u001a\u00020\fH\u00c6\u0003J\t\u00107\u001a\u00020\u000eH\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u00109\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010@\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010A\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u00be\u0001\u0010B\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010\u0011\u001a\u00020\f2\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0003\u0010\u0013\u001a\u00020\f2\b\b\u0003\u0010\u0014\u001a\u00020\u000e2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\f2\b\u0010E\u001a\u0004\u0018\u00010FH\u00d6\u0003J\t\u0010G\u001a\u00020HH\u00d6\u0001J\t\u0010I\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0013\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0019R\u0013\u0010 \u001a\u0004\u0018\u00010\u000e8F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b%\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b)\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0014\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b.\u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b1\u0010\u001d\u00a8\u0006J"}, d2 = {"Lchat/rocket/core/internal/model/Subscription;", "Lchat/rocket/common/model/BaseRoom;", "roomId", "", "id", "type", "Lchat/rocket/common/model/RoomType;", "user", "Lchat/rocket/common/model/SimpleUser;", "name", "fullName", "readonly", "", "timestamp", "", "lastSeen", "updatedAt", "isDefault", "open", "alert", "unread", "userMentions", "groupMentions", "(Ljava/lang/String;Ljava/lang/String;Lchat/rocket/common/model/RoomType;Lchat/rocket/common/model/SimpleUser;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ZZZJLjava/lang/Long;Ljava/lang/Long;)V", "getAlert", "()Z", "getFullName", "()Ljava/lang/String;", "getGroupMentions", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "lastModified", "getLastModified", "getLastSeen", "getName", "getOpen", "getReadonly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRoomId", "getTimestamp", "getType", "()Lchat/rocket/common/model/RoomType;", "getUnread", "()J", "getUpdatedAt", "getUser", "()Lchat/rocket/common/model/SimpleUser;", "getUserMentions", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lchat/rocket/common/model/RoomType;Lchat/rocket/common/model/SimpleUser;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ZZZJLjava/lang/Long;Ljava/lang/Long;)Lchat/rocket/core/internal/model/Subscription;", "equals", "other", "", "hashCode", "", "toString", "core"})
public final class Subscription implements chat.rocket.common.model.BaseRoom {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String roomId = null;
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
    private final java.lang.Long timestamp = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long lastSeen = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long updatedAt = null;
    private final boolean isDefault = false;
    private final boolean open = false;
    private final boolean alert = false;
    private final long unread = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long userMentions = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long groupMentions = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLastModified() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoomId() {
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
    public final java.lang.Long getTimestamp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLastSeen() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getUpdatedAt() {
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
    public final java.lang.Long getUserMentions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getGroupMentions() {
        return null;
    }
    
    public Subscription(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "rid")
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "_id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "t")
    chat.rocket.common.model.RoomType type, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "u")
    chat.rocket.common.model.SimpleUser user, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "fname")
    java.lang.String fullName, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "ro")
    java.lang.Boolean readonly, @org.jetbrains.annotations.Nullable()
    @chat.rocket.common.internal.ISO8601Date()
    @com.squareup.moshi.Json(name = "ts")
    java.lang.Long timestamp, @org.jetbrains.annotations.Nullable()
    @chat.rocket.common.internal.ISO8601Date()
    @com.squareup.moshi.Json(name = "ls")
    java.lang.Long lastSeen, @org.jetbrains.annotations.Nullable()
    @chat.rocket.common.internal.ISO8601Date()
    @com.squareup.moshi.Json(name = "_updatedAt")
    java.lang.Long updatedAt, @se.ansman.kotshi.JsonDefaultValueBoolean(value = false)
    @com.squareup.moshi.Json(name = "default")
    boolean isDefault, @se.ansman.kotshi.JsonDefaultValueBoolean(value = false)
    boolean open, @se.ansman.kotshi.JsonDefaultValueBoolean(value = false)
    boolean alert, @se.ansman.kotshi.JsonDefaultValueLong(value = 0L)
    long unread, @org.jetbrains.annotations.Nullable()
    @se.ansman.kotshi.JsonDefaultValueLong(value = 0L)
    java.lang.Long userMentions, @org.jetbrains.annotations.Nullable()
    @se.ansman.kotshi.JsonDefaultValueLong(value = 0L)
    java.lang.Long groupMentions) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.common.model.RoomType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.common.model.SimpleUser component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component7() {
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
    public final java.lang.Long component10() {
        return null;
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final long component14() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.core.internal.model.Subscription copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "rid")
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "_id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "t")
    chat.rocket.common.model.RoomType type, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "u")
    chat.rocket.common.model.SimpleUser user, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "fname")
    java.lang.String fullName, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "ro")
    java.lang.Boolean readonly, @org.jetbrains.annotations.Nullable()
    @chat.rocket.common.internal.ISO8601Date()
    @com.squareup.moshi.Json(name = "ts")
    java.lang.Long timestamp, @org.jetbrains.annotations.Nullable()
    @chat.rocket.common.internal.ISO8601Date()
    @com.squareup.moshi.Json(name = "ls")
    java.lang.Long lastSeen, @org.jetbrains.annotations.Nullable()
    @chat.rocket.common.internal.ISO8601Date()
    @com.squareup.moshi.Json(name = "_updatedAt")
    java.lang.Long updatedAt, @se.ansman.kotshi.JsonDefaultValueBoolean(value = false)
    @com.squareup.moshi.Json(name = "default")
    boolean isDefault, @se.ansman.kotshi.JsonDefaultValueBoolean(value = false)
    boolean open, @se.ansman.kotshi.JsonDefaultValueBoolean(value = false)
    boolean alert, @se.ansman.kotshi.JsonDefaultValueLong(value = 0L)
    long unread, @org.jetbrains.annotations.Nullable()
    @se.ansman.kotshi.JsonDefaultValueLong(value = 0L)
    java.lang.Long userMentions, @org.jetbrains.annotations.Nullable()
    @se.ansman.kotshi.JsonDefaultValueLong(value = 0L)
    java.lang.Long groupMentions) {
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