package chat.rocket.core.internal.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u001a\u001d\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u001a1\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u001a%\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u001a5\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u0015"}, d2 = {"login", "Lchat/rocket/common/model/Token;", "Lchat/rocket/core/RocketChatClient;", "username", "", "password", "pin", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "loginWithCas", "casCredential", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "loginWithEmail", "email", "loginWithLdap", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "loginWithSaml", "samlCredential", "signup", "Lchat/rocket/common/model/User;", "name", "(Lchat/rocket/core/RocketChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "core"})
public final class LoginKt {
    
    /**
     * * Login with username and password.
     * * On success this will also call [chat.rocket.core.TokenRepository].save(token).
     * *
     * * @param username Username of the user.
     * * @param password Password of the user.
     * *
     * * @return [Token]
     * * @throws [RocketChatException] on errors.
     * * @see [Token]
     * * @see [chat.rocket.core.TokenRepository]
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object login(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String pin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.common.model.Token> p4) {
        return null;
    }
    
    /**
     * * Login with email and password.
     * * On success this will also call [chat.rocket.core.TokenRepository].save(token)
     * *
     * * @param email Email of the user.
     * * @param password Password of the user.
     * *
     * * @return [Token]
     * * @throws [RocketChatException] on errors.
     * * @see [Token]
     * * @see [chat.rocket.core.TokenRepository]
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object loginWithEmail(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String pin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.common.model.Token> p4) {
        return null;
    }
    
    /**
     * * Login with username and password through LDAP.
     * * On success this will also call [chat.rocket.core.TokenRepository].save(token)
     * *
     * * @param username Username of the user.
     * * @param password Password of the user.
     * *
     * * @return [Token]
     * * @throws [RocketChatException] on errors.
     * * @see [Token]
     * * @see [chat.rocket.core.TokenRepository]
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object loginWithLdap(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.common.model.Token> p3) {
        return null;
    }
    
    /**
     * * Login through CAS protocol.
     * * On success this will also call [chat.rocket.core.TokenRepository].save(token)
     * *
     * * @param casCredential The CAS credential to authenticate with.
     * *
     * * @return [Token]
     * * @throws [RocketChatException] on errors.
     * * @see [Token]
     * * @see [chat.rocket.core.TokenRepository]
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object loginWithCas(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String casCredential, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.common.model.Token> p2) {
        return null;
    }
    
    /**
     * * Login through SAML.
     * * On success this will also call [chat.rocket.core.TokenRepository].save(token)
     * *
     * * @param samlCredential The SAML credential to authenticate with.
     * *
     * * @return [Token]
     * * @throws [RocketChatException] on errors.
     * * @see [Token]
     * * @see [chat.rocket.core.TokenRepository]
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object loginWithSaml(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String samlCredential, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.common.model.Token> p2) {
        return null;
    }
    
    /**
     * * Registers a new user within the server.
     * * Note, this doesn't authenticate the user.
     * * After a successful registration you still need to call [login].
     * *
     * * @param email Email of the user.
     * * @param name Name of the user.
     * * @param username Username of the user.
     * * @param password Password of the user.
     * *
     * * @return [Token]
     * * @throws [RocketChatException] on errors.
     * * @see [User]
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object signup(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super chat.rocket.common.model.User> p5) {
        return null;
    }
}