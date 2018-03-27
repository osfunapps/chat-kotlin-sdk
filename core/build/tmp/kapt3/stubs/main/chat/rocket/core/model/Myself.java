package chat.rocket.core.model;

import java.lang.System;

@se.ansman.kotshi.JsonSerializable()
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\t\u0010%\u001a\u00020\fH\u00c6\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u00c6\u0003Jp\u0010\'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010+H\u00d6\u0003J\t\u0010,\u001a\u00020-H\u00d6\u0001J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006/"}, d2 = {"Lchat/rocket/core/model/Myself;", "Lchat/rocket/common/model/BaseUser;", "id", "", "username", "name", "status", "Lchat/rocket/common/model/UserStatus;", "statusConnection", "utcOffset", "", "active", "", "emails", "", "Lchat/rocket/core/model/Email;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lchat/rocket/common/model/UserStatus;Lchat/rocket/common/model/UserStatus;Ljava/lang/Float;ZLjava/util/List;)V", "getActive", "()Z", "getEmails", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getName", "getStatus", "()Lchat/rocket/common/model/UserStatus;", "getStatusConnection", "getUsername", "getUtcOffset", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lchat/rocket/common/model/UserStatus;Lchat/rocket/common/model/UserStatus;Ljava/lang/Float;ZLjava/util/List;)Lchat/rocket/core/model/Myself;", "equals", "other", "", "hashCode", "", "toString", "core"})
public final class Myself implements chat.rocket.common.model.BaseUser {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String username = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final chat.rocket.common.model.UserStatus status = null;
    @org.jetbrains.annotations.Nullable()
    private final chat.rocket.common.model.UserStatus statusConnection = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Float utcOffset = null;
    private final boolean active = false;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<chat.rocket.core.model.Email> emails = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.common.model.UserStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.common.model.UserStatus getStatusConnection() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getUtcOffset() {
        return null;
    }
    
    public final boolean getActive() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<chat.rocket.core.model.Email> getEmails() {
        return null;
    }
    
    public Myself(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "_id")
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    chat.rocket.common.model.UserStatus status, @org.jetbrains.annotations.Nullable()
    chat.rocket.common.model.UserStatus statusConnection, @org.jetbrains.annotations.Nullable()
    java.lang.Float utcOffset, boolean active, @org.jetbrains.annotations.Nullable()
    java.util.List<chat.rocket.core.model.Email> emails) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.common.model.UserStatus component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.common.model.UserStatus component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<chat.rocket.core.model.Email> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.core.model.Myself copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "_id")
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    chat.rocket.common.model.UserStatus status, @org.jetbrains.annotations.Nullable()
    chat.rocket.common.model.UserStatus statusConnection, @org.jetbrains.annotations.Nullable()
    java.lang.Float utcOffset, boolean active, @org.jetbrains.annotations.Nullable()
    java.util.List<chat.rocket.core.model.Email> emails) {
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