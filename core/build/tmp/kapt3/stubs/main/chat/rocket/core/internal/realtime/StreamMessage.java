package chat.rocket.core.internal.realtime;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004H\u00c6\u0003J\u000e\u0010\r\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0013\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lchat/rocket/core/internal/realtime/StreamMessage;", "T", "", "type", "Lchat/rocket/core/internal/realtime/Type;", "data", "(Lchat/rocket/core/internal/realtime/Type;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getType", "()Lchat/rocket/core/internal/realtime/Type;", "component1", "component2", "copy", "(Lchat/rocket/core/internal/realtime/Type;Ljava/lang/Object;)Lchat/rocket/core/internal/realtime/StreamMessage;", "equals", "", "other", "hashCode", "", "toString", "", "core"})
public final class StreamMessage<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final chat.rocket.core.internal.realtime.Type type = null;
    private final T data = null;
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.core.internal.realtime.Type getType() {
        return null;
    }
    
    public final T getData() {
        return null;
    }
    
    public StreamMessage(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.Type type, T data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.core.internal.realtime.Type component1() {
        return null;
    }
    
    public final T component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.core.internal.realtime.StreamMessage<T> copy(@org.jetbrains.annotations.NotNull()
    chat.rocket.core.internal.realtime.Type type, T data) {
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