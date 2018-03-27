package chat.rocket.core.internal.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001aA\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\u0011*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u0012"}, d2 = {"getMembers", "Lchat/rocket/core/model/PagedResult;", "", "Lchat/rocket/common/model/User;", "Lchat/rocket/core/RocketChatClient;", "roomId", "", "roomType", "Lchat/rocket/common/model/RoomType;", "offset", "", "count", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Lchat/rocket/common/model/RoomType;JJLkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "joinChat", "", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "markAsRead", "", "core"})
public final class ChatRoomKt {
    
    /**
     * * Marks a room as read.
     * *
     * * @param roomId The ID of the room.
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object markAsRead(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    /**
     * * Returns the list of members of a ChatRoom.
     * *
     * * @param roomId The ID of the room.
     * * @param roomType The type of the room.
     * * @param offset The offset to paging which specifies the first entry to return from a collection.
     * * @param count The amount of item to return from a collection.
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object getMembers(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    chat.rocket.common.model.RoomType roomType, long offset, long count, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.model.PagedResult<? extends java.util.List<chat.rocket.common.model.User>>> p5) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object joinChat(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super java.lang.Boolean> p2) {
        return null;
    }
}