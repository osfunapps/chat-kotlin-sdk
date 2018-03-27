package chat.rocket.core.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u001aC\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u001a5\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u001a$\u0010\u000e\u001a\u00020\b*\u00020\u00042\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0010\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u0013"}, d2 = {"history", "Lchat/rocket/core/model/PagedResult;", "", "Lchat/rocket/core/model/Message;", "Lchat/rocket/core/model/ChatRoom;", "count", "", "oldest", "", "latest", "(Lchat/rocket/core/model/ChatRoom;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "messages", "offset", "(Lchat/rocket/core/model/ChatRoom;JJLkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "subscribeMessages", "callback", "Lkotlin/Function2;", "", "", "core"})
public final class ChatRoomKt {
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object messages(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.model.ChatRoom $receiver, long offset, long count, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.model.PagedResult<? extends java.util.List<chat.rocket.core.model.Message>>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object history(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.model.ChatRoom $receiver, long count, @org.jetbrains.annotations.Nullable()
    java.lang.String oldest, @org.jetbrains.annotations.Nullable()
    java.lang.String latest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.model.PagedResult<? extends java.util.List<chat.rocket.core.model.Message>>> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String subscribeMessages(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.model.ChatRoom $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback) {
        return null;
    }
}