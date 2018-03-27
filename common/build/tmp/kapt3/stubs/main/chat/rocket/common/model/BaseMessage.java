package chat.rocket.common.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0012\u0010\u0015\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005R\u0012\u0010\u0017\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0005R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0005R\u0012\u0010\u001d\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u0004\u0018\u00010\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u000e\u00a8\u0006\""}, d2 = {"Lchat/rocket/common/model/BaseMessage;", "", "avatar", "", "getAvatar", "()Ljava/lang/String;", "channels", "", "Lchat/rocket/common/model/SimpleRoom;", "getChannels", "()Ljava/util/List;", "editedAt", "", "getEditedAt", "()Ljava/lang/Long;", "editedBy", "Lchat/rocket/common/model/SimpleUser;", "getEditedBy", "()Lchat/rocket/common/model/SimpleUser;", "mentions", "getMentions", "message", "getMessage", "roomId", "getRoomId", "sender", "getSender", "senderAlias", "getSenderAlias", "timestamp", "getTimestamp", "()J", "updatedAt", "getUpdatedAt", "common"})
public abstract interface BaseMessage {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getRoomId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getMessage();
    
    public abstract long getTimestamp();
    
    @org.jetbrains.annotations.Nullable()
    public abstract chat.rocket.common.model.SimpleUser getSender();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long getUpdatedAt();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long getEditedAt();
    
    @org.jetbrains.annotations.Nullable()
    public abstract chat.rocket.common.model.SimpleUser getEditedBy();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getSenderAlias();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getAvatar();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<chat.rocket.common.model.SimpleUser> getMentions();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<chat.rocket.common.model.SimpleRoom> getChannels();
}