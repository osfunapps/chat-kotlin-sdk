package chat.rocket.core.internal.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u001a9\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u001a=\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013\u001aS\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019\u001aA\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001e\u001a_\u0010\u001f\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&\u001a%\u0010\'\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(\u001a\u001d\u0010)\u001a\u00020**\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001e\u001a-\u0010+\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,\u001aA\u0010-\u001a\u00020**\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103\u001aQ\u0010-\u001a\u00020**\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\u000e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010706H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108\u001a%\u0010-\u001a\u00020**\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u00109\u001a\u00020:H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006<"}, d2 = {"deleteMessage", "Lchat/rocket/core/model/DeleteResult;", "Lchat/rocket/core/RocketChatClient;", "roomId", "", "msgId", "asUser", "", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "getRoomFavoriteMessages", "Lchat/rocket/core/model/PagedResult;", "", "Lchat/rocket/core/model/Message;", "roomType", "Lchat/rocket/common/model/RoomType;", "offset", "", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Lchat/rocket/common/model/RoomType;ILkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "getRoomPinnedMessages", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Lchat/rocket/common/model/RoomType;Ljava/lang/Integer;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "history", "count", "", "oldest", "latest", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Lchat/rocket/common/model/RoomType;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "messages", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Lchat/rocket/common/model/RoomType;JJLkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "pinMessage", "messageId", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "sendMessage", "text", "alias", "emoji", "avatar", "attachments", "Lchat/rocket/core/model/attachment/Attachment;", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "toggleReaction", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "unpinMessage", "", "updateMessage", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "uploadFile", "file", "Ljava/io/File;", "mimeType", "msg", "description", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "fileName", "inputStreamProvider", "Lkotlin/Function0;", "Ljava/io/InputStream;", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "body", "Lokhttp3/RequestBody;", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "core"})
public final class MessagesKt {
    
    /**
     * * Updates a message.
     * *
     * * @param roomId The room id of where the message is.
     * * @param messageId The message id to update.
     * * @param text Updated text for the message.
     * * @return The updated Message object.
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object updateMessage(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    java.lang.String messageId, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.model.Message> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object pinMessage(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String messageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.model.Message> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object unpinMessage(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String messageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object getRoomFavoriteMessages(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    chat.rocket.common.model.RoomType roomType, int offset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.model.PagedResult<? extends java.util.List<chat.rocket.core.model.Message>>> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object getRoomPinnedMessages(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    chat.rocket.common.model.RoomType roomType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer offset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.model.PagedResult<? extends java.util.List<chat.rocket.core.model.Message>>> p4) {
        return null;
    }
    
    /**
     * * Sends a new message
     * *
     * * @param roomId the room where to send the message (works with all types)
     * * @param text Optional text message to send
     * * @param alias Optianal alias to be used as the sender of the message
     * * @param emoji Optional emoji to be used as the sender's avatar
     * * @param avatar Optional avatar url to be used as the sender's avatar
     * * @param attachments Optional List of [Attachment]
     * * @return
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String alias, @org.jetbrains.annotations.Nullable()
    java.lang.String emoji, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends chat.rocket.core.model.attachment.Attachment> attachments, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.model.Message> p7) {
        return null;
    }
    
    /**
     * * Uploads a file.
     * *
     * * @param roomId The room where to upload the file.
     * * @param file The file to upload.
     * * @param mimeType The MIME type of the file.
     * * @param msg The message to send with the file.
     * * @param description The file description.
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object uploadFile(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType, @org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p6) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object uploadFile(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType, @org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.io.InputStream> inputStreamProvider, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p7) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    static final java.lang.Object uploadFile(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object messages(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    chat.rocket.common.model.RoomType roomType, long offset, long count, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.model.PagedResult<? extends java.util.List<chat.rocket.core.model.Message>>> p5) {
        return null;
    }
    
    /**
     * * Deletes a message
     * *
     * * @param roomId the room id of where the message is to delete.
     * * @param msgId The message id to delete.
     * * @param asUser Whether the message should be deleted as the user who sent it. Defaults to false.
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object deleteMessage(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    java.lang.String msgId, boolean asUser, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.model.DeleteResult> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object history(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String roomId, @org.jetbrains.annotations.NotNull()
    chat.rocket.common.model.RoomType roomType, long count, @org.jetbrains.annotations.Nullable()
    java.lang.String oldest, @org.jetbrains.annotations.Nullable()
    java.lang.String latest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.model.PagedResult<? extends java.util.List<chat.rocket.core.model.Message>>> p6) {
        return null;
    }
    
    /**
     * * Toggle a reaction to an associated message. If the message already has an associated :vulcan: reaction it will
     * * clear it or else it will request server to add one.
     * *
     * * @param messageId The message id to reaction refers.
     * * @param emoji The emoji to react with or clear.
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object toggleReaction(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String messageId, @org.jetbrains.annotations.NotNull()
    java.lang.String emoji, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super java.lang.Boolean> p3) {
        return null;
    }
}