package chat.rocket.core.internal.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u001aH\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a+\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\u0001*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u001a+\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u0001*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u001a\u0015\u0010\u0012\u001a\u00020\u0013*\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u001a%\u0010\u001b\u001a\u00020\b*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001f\u001a\u001d\u0010\u001b\u001a\u00020\b*\u00020\u00042\u0006\u0010 \u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018\u001aM\u0010!\u001a\u00020\"*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006("}, d2 = {"chatRooms", "Lchat/rocket/core/internal/RestMultiResult;", "", "Lchat/rocket/core/model/ChatRoom;", "Lchat/rocket/core/RocketChatClient;", "timestamp", "", "filterCustom", "", "(Lchat/rocket/core/RocketChatClient;JZLkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "combine", "rooms", "Lchat/rocket/core/model/Room;", "subscriptions", "Lchat/rocket/core/internal/model/Subscription;", "listRooms", "(Lchat/rocket/core/RocketChatClient;JLkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "listSubscriptions", "me", "Lchat/rocket/core/model/Myself;", "(Lchat/rocket/core/RocketChatClient;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "resetAvatar", "userId", "", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "roles", "Lchat/rocket/core/model/UserRole;", "setAvatar", "file", "Ljava/io/File;", "mimeType", "(Lchat/rocket/core/RocketChatClient;Ljava/io/File;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "avatarUrl", "updateProfile", "Lchat/rocket/common/model/User;", "email", "name", "password", "username", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "core"})
public final class UserKt {
    
    /**
     * * Returns the current logged user information, useful to check if the Token from TokenProvider
     * * is still valid.
     * *
     * * @see Myself
     * * @see RocketChatException
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object me(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.model.Myself> p1) {
        return null;
    }
    
    /**
     * * Updates the profile for the user.
     * *
     * * @param userId The ID of the user to update.
     * * @param email The email address for the user.
     * * @param name The display name of the user.
     * * @param password The password for the user.
     * * @param username The username for the user.
     * * @return An [User] with an updated profile.
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object updateProfile(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.common.model.User> p6) {
        return null;
    }
    
    /**
     * * Resets the user's avatar.
     * *
     * * @param userId The ID of the user to reset the avatar.
     * *
     * * @return True if the avatar was reset, false otherwise.
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object resetAvatar(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super java.lang.Boolean> p2) {
        return null;
    }
    
    /**
     * * Sets the user's avatar.
     * *
     * * @param file The file to set the avatar.
     * * @param mimeType The MIME type of the file. Allowed MIME types are: *image/gif*, *image/png*, *image/jpeg*, *image/bmp* and *image/webp*.
     * *
     * * @return True if the avatar was setted up, false otherwise.
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object setAvatar(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super java.lang.Boolean> p3) {
        return null;
    }
    
    /**
     * * Sets the user's avatar.
     * *
     * * @param avatarUrl Url of the avatar for the user
     * *
     * * @return True if the avatar was setted up, false otherwise.
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object setAvatar(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String avatarUrl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super java.lang.Boolean> p2) {
        return null;
    }
    
    /**
     * * Return the users ChatRooms (Room + Subscription)
     * *
     * * @param timestamp Timestamp of the last call to get only updates and removes, defaults to 0 which loads all rooms
     * * @param filterCustom Filter custom rooms from the response, default true
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object chatRooms(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, long timestamp, boolean filterCustom, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.internal.RestMultiResult<java.util.List<chat.rocket.core.model.ChatRoom>>> p3) {
        return null;
    }
    
    /**
     * * Return all the roles specific to the current user.
     * *
     * * @return UserRole object specifying current user roles.
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object roles(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.model.UserRole> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final chat.rocket.core.internal.RestMultiResult<java.util.List<chat.rocket.core.model.ChatRoom>> combine(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.RestMultiResult<java.util.List<chat.rocket.core.model.Room>> rooms, @org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.RestMultiResult<java.util.List<chat.rocket.core.internal.model.Subscription>> subscriptions, boolean filterCustom) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<chat.rocket.core.model.ChatRoom> combine(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.util.List<chat.rocket.core.model.Room> rooms, @org.jetbrains.annotations.NotNull()
    java.util.List<chat.rocket.core.internal.model.Subscription> subscriptions, boolean filterCustom) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object listSubscriptions(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, long timestamp, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.internal.RestMultiResult<java.util.List<chat.rocket.core.internal.model.Subscription>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object listRooms(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, long timestamp, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.core.internal.RestMultiResult<java.util.List<chat.rocket.core.model.Room>>> p2) {
        return null;
    }
}