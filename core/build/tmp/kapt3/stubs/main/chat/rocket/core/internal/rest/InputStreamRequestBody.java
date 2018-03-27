package chat.rocket.core.internal.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0017J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lchat/rocket/core/internal/rest/InputStreamRequestBody;", "Lokhttp3/RequestBody;", "contentType", "Lokhttp3/MediaType;", "inputStreamProvider", "Lkotlin/Function0;", "Ljava/io/InputStream;", "(Lokhttp3/MediaType;Lkotlin/jvm/functions/Function0;)V", "contentLength", "", "writeTo", "", "sink", "Lokio/BufferedSink;", "core"})
public final class InputStreamRequestBody extends okhttp3.RequestBody {
    private final okhttp3.MediaType contentType = null;
    private final kotlin.jvm.functions.Function0<java.io.InputStream> inputStreamProvider = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public okhttp3.MediaType contentType() {
        return null;
    }
    
    @java.lang.Override()
    public long contentLength() throws java.io.IOException {
        return 0L;
    }
    
    @java.lang.Override()
    public void writeTo(@org.jetbrains.annotations.NotNull()
    okio.BufferedSink sink) throws java.io.IOException {
    }
    
    public InputStreamRequestBody(@org.jetbrains.annotations.Nullable()
    okhttp3.MediaType contentType, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.io.InputStream> inputStreamProvider) {
        super();
    }
}