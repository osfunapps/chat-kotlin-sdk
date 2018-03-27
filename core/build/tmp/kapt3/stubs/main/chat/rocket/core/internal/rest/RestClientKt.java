package chat.rocket.core.internal.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a5\u0010\u001a\u001a\u0002H\u001b\"\u0004\b\u0000\u0010\u001b*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#\u001a\u0014\u0010$\u001a\u00020%*\u00020\u001c2\u0006\u0010&\u001a\u00020\u0014H\u0000\u001a+\u0010\'\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0(2\u0010\u0010)\u001a\f\u0012\b\u0012\u00060+j\u0002`,0*H\u0082\b\u001a\'\u0010-\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0(2\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u001b0*H\u0082\b\"\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006."}, d2 = {"MEDIA_TYPE_JSON", "Lokhttp3/MediaType;", "getMEDIA_TYPE_JSON", "()Lokhttp3/MediaType;", "getRestApiMethodNameByRoomType", "", "roomType", "Lchat/rocket/common/model/RoomType;", "method", "processCallbackError", "Lchat/rocket/common/RocketChatException;", "moshi", "Lcom/squareup/moshi/Moshi;", "response", "Lokhttp3/Response;", "logger", "Lchat/rocket/common/util/Logger;", "requestUrl", "Lokhttp3/HttpUrl$Builder;", "baseUrl", "Lokhttp3/HttpUrl;", "cancel", "", "Lokhttp3/OkHttpClient;", "tag", "", "handleRestCall", "T", "Lchat/rocket/core/RocketChatClient;", "request", "Lokhttp3/Request;", "type", "Ljava/lang/reflect/Type;", "largeFile", "", "(Lchat/rocket/core/RocketChatClient;Lokhttp3/Request;Ljava/lang/reflect/Type;ZLkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "requestBuilder", "Lokhttp3/Request$Builder;", "httpUrl", "tryResumeWithException", "Lkotlinx/coroutines/experimental/CancellableContinuation;", "getter", "Lkotlin/Function0;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "tryToResume", "core"})
public final class RestClientKt {
    @org.jetbrains.annotations.Nullable()
    private static final okhttp3.MediaType MEDIA_TYPE_JSON = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getRestApiMethodNameByRoomType(@org.jetbrains.annotations.NotNull()
    chat.rocket.common.model.RoomType roomType, @org.jetbrains.annotations.NotNull()
    java.lang.String method) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.HttpUrl.Builder requestUrl(@org.jetbrains.annotations.NotNull()
    okhttp3.HttpUrl baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String method) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.Request.Builder requestBuilder(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    okhttp3.HttpUrl httpUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object handleRestCall(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.RocketChatClient $receiver, @org.jetbrains.annotations.NotNull()
    okhttp3.Request request, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type type, boolean largeFile, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super T> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final chat.rocket.common.RocketChatException processCallbackError(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi, @org.jetbrains.annotations.NotNull()
    okhttp3.Response response, @org.jetbrains.annotations.NotNull()
    chat.rocket.common.util.Logger logger) {
        return null;
    }
    
    private static final <T extends java.lang.Object>void tryToResume(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.experimental.CancellableContinuation<? super T> $receiver, kotlin.jvm.functions.Function0<? extends T> getter) {
    }
    
    private static final <T extends java.lang.Object>void tryResumeWithException(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.experimental.CancellableContinuation<? super T> $receiver, kotlin.jvm.functions.Function0<? extends java.lang.Exception> getter) {
    }
    
    private static final void cancel(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient $receiver, java.lang.Object tag) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final okhttp3.MediaType getMEDIA_TYPE_JSON() {
        return null;
    }
}