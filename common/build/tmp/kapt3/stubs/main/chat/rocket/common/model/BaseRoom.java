package chat.rocket.common.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lchat/rocket/common/model/BaseRoom;", "", "fullName", "", "getFullName", "()Ljava/lang/String;", "id", "getId", "readonly", "", "getReadonly", "()Ljava/lang/Boolean;", "type", "Lchat/rocket/common/model/RoomType;", "getType", "()Lchat/rocket/common/model/RoomType;", "updatedAt", "", "getUpdatedAt", "()Ljava/lang/Long;", "user", "Lchat/rocket/common/model/SimpleUser;", "getUser", "()Lchat/rocket/common/model/SimpleUser;", "common"})
public abstract interface BaseRoom {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract chat.rocket.common.model.RoomType getType();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getFullName();
    
    @org.jetbrains.annotations.Nullable()
    public abstract chat.rocket.common.model.SimpleUser getUser();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Boolean getReadonly();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long getUpdatedAt();
}