package chat.rocket.core.model;

import java.lang.System;

@se.ansman.kotshi.JsonSerializable()
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00e5\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0015\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0012\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0002\u0010\u001fJ\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\t\u0010?\u001a\u00020\u0012H\u00c6\u0003J\t\u0010@\u001a\u00020\u0012H\u00c6\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u00c6\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015H\u00c6\u0003J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015H\u00c6\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0015H\u00c6\u0003J\t\u0010E\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010L\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u000b\u0010M\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00fc\u0001\u0010O\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00152\b\b\u0003\u0010\u001c\u001a\u00020\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00c6\u0001\u00a2\u0006\u0002\u0010PJ\u0013\u0010Q\u001a\u00020\u00122\b\u0010R\u001a\u0004\u0018\u00010SH\u00d6\u0003J\t\u0010T\u001a\u00020UH\u00d6\u0001J\t\u0010V\u001a\u00020\u0003H\u00d6\u0001R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b%\u0010&R\u0016\u0010\f\u001a\u0004\u0018\u00010\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0011\u0010\u001c\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b:\u0010&R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010!\u00a8\u0006W"}, d2 = {"Lchat/rocket/core/model/Message;", "Lchat/rocket/common/model/BaseMessage;", "id", "", "roomId", "message", "timestamp", "", "sender", "Lchat/rocket/common/model/SimpleUser;", "updatedAt", "editedAt", "editedBy", "senderAlias", "avatar", "type", "Lchat/rocket/core/model/MessageType;", "groupable", "", "parseUrls", "urls", "", "Lchat/rocket/core/model/url/Url;", "mentions", "channels", "Lchat/rocket/common/model/SimpleRoom;", "attachments", "Lchat/rocket/core/model/attachment/Attachment;", "pinned", "reactions", "Lchat/rocket/core/model/Reactions;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLchat/rocket/common/model/SimpleUser;Ljava/lang/Long;Ljava/lang/Long;Lchat/rocket/common/model/SimpleUser;Ljava/lang/String;Ljava/lang/String;Lchat/rocket/core/model/MessageType;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLchat/rocket/core/model/Reactions;)V", "getAttachments", "()Ljava/util/List;", "getAvatar", "()Ljava/lang/String;", "getChannels", "getEditedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEditedBy", "()Lchat/rocket/common/model/SimpleUser;", "getGroupable", "()Z", "getId", "getMentions", "getMessage", "getParseUrls", "getPinned", "getReactions", "()Lchat/rocket/core/model/Reactions;", "getRoomId", "getSender", "getSenderAlias", "getTimestamp", "()J", "getType", "()Lchat/rocket/core/model/MessageType;", "getUpdatedAt", "getUrls", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLchat/rocket/common/model/SimpleUser;Ljava/lang/Long;Ljava/lang/Long;Lchat/rocket/common/model/SimpleUser;Ljava/lang/String;Ljava/lang/String;Lchat/rocket/core/model/MessageType;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLchat/rocket/core/model/Reactions;)Lchat/rocket/core/model/Message;", "equals", "other", "", "hashCode", "", "toString", "core"})
public final class Message implements chat.rocket.common.model.BaseMessage {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String roomId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    private final long timestamp = 0L;
    @org.jetbrains.annotations.Nullable()
    private final chat.rocket.common.model.SimpleUser sender = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long updatedAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long editedAt = null;
    @org.jetbrains.annotations.Nullable()
    private final chat.rocket.common.model.SimpleUser editedBy = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String senderAlias = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String avatar = null;
    @org.jetbrains.annotations.Nullable()
    private final chat.rocket.core.model.MessageType type = null;
    private final boolean groupable = false;
    private final boolean parseUrls = false;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<chat.rocket.core.model.url.Url> urls = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<chat.rocket.common.model.SimpleUser> mentions = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<chat.rocket.common.model.SimpleRoom> channels = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<chat.rocket.core.model.attachment.Attachment> attachments = null;
    private final boolean pinned = false;
    @org.jetbrains.annotations.Nullable()
    private final chat.rocket.core.model.Reactions reactions = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getRoomId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getMessage() {
        return null;
    }
    
    @java.lang.Override()
    public long getTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public chat.rocket.common.model.SimpleUser getSender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getEditedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public chat.rocket.common.model.SimpleUser getEditedBy() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getSenderAlias() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.core.model.MessageType getType() {
        return null;
    }
    
    public final boolean getGroupable() {
        return false;
    }
    
    public final boolean getParseUrls() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<chat.rocket.core.model.url.Url> getUrls() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<chat.rocket.common.model.SimpleUser> getMentions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<chat.rocket.common.model.SimpleRoom> getChannels() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<chat.rocket.core.model.attachment.Attachment> getAttachments() {
        return null;
    }
    
    public final boolean getPinned() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.core.model.Reactions getReactions() {
        return null;
    }
    
    public Message(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "_id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "rid")
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    @se.ansman.kotshi.JsonDefaultValueString(value = "")
    @com.squareup.moshi.Json(name = "msg")
    java.lang.String message, @chat.rocket.common.internal.ISO8601Date()
    @com.squareup.moshi.Json(name = "ts")
    long timestamp, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "u")
    chat.rocket.common.model.SimpleUser sender, @org.jetbrains.annotations.Nullable()
    @chat.rocket.common.internal.ISO8601Date()
    @com.squareup.moshi.Json(name = "_updatedAt")
    java.lang.Long updatedAt, @org.jetbrains.annotations.Nullable()
    @chat.rocket.common.internal.ISO8601Date()
    java.lang.Long editedAt, @org.jetbrains.annotations.Nullable()
    chat.rocket.common.model.SimpleUser editedBy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "alias")
    java.lang.String senderAlias, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "t")
    chat.rocket.core.model.MessageType type, @se.ansman.kotshi.JsonDefaultValueBoolean(value = false)
    boolean groupable, @se.ansman.kotshi.JsonDefaultValueBoolean(value = false)
    boolean parseUrls, @org.jetbrains.annotations.Nullable()
    java.util.List<chat.rocket.core.model.url.Url> urls, @org.jetbrains.annotations.Nullable()
    java.util.List<chat.rocket.common.model.SimpleUser> mentions, @org.jetbrains.annotations.Nullable()
    java.util.List<chat.rocket.common.model.SimpleRoom> channels, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends chat.rocket.core.model.attachment.Attachment> attachments, @se.ansman.kotshi.JsonDefaultValueBoolean(value = false)
    boolean pinned, @org.jetbrains.annotations.Nullable()
    chat.rocket.core.model.Reactions reactions) {
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
    public final java.lang.String component3() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.common.model.SimpleUser component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.common.model.SimpleUser component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.core.model.MessageType component11() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean component13() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<chat.rocket.core.model.url.Url> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<chat.rocket.common.model.SimpleUser> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<chat.rocket.common.model.SimpleRoom> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<chat.rocket.core.model.attachment.Attachment> component17() {
        return null;
    }
    
    public final boolean component18() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final chat.rocket.core.model.Reactions component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.core.model.Message copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "_id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "rid")
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    @se.ansman.kotshi.JsonDefaultValueString(value = "")
    @com.squareup.moshi.Json(name = "msg")
    java.lang.String message, @chat.rocket.common.internal.ISO8601Date()
    @com.squareup.moshi.Json(name = "ts")
    long timestamp, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "u")
    chat.rocket.common.model.SimpleUser sender, @org.jetbrains.annotations.Nullable()
    @chat.rocket.common.internal.ISO8601Date()
    @com.squareup.moshi.Json(name = "_updatedAt")
    java.lang.Long updatedAt, @org.jetbrains.annotations.Nullable()
    @chat.rocket.common.internal.ISO8601Date()
    java.lang.Long editedAt, @org.jetbrains.annotations.Nullable()
    chat.rocket.common.model.SimpleUser editedBy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "alias")
    java.lang.String senderAlias, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "t")
    chat.rocket.core.model.MessageType type, @se.ansman.kotshi.JsonDefaultValueBoolean(value = false)
    boolean groupable, @se.ansman.kotshi.JsonDefaultValueBoolean(value = false)
    boolean parseUrls, @org.jetbrains.annotations.Nullable()
    java.util.List<chat.rocket.core.model.url.Url> urls, @org.jetbrains.annotations.Nullable()
    java.util.List<chat.rocket.common.model.SimpleUser> mentions, @org.jetbrains.annotations.Nullable()
    java.util.List<chat.rocket.common.model.SimpleRoom> channels, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends chat.rocket.core.model.attachment.Attachment> attachments, @se.ansman.kotshi.JsonDefaultValueBoolean(value = false)
    boolean pinned, @org.jetbrains.annotations.Nullable()
    chat.rocket.core.model.Reactions reactions) {
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