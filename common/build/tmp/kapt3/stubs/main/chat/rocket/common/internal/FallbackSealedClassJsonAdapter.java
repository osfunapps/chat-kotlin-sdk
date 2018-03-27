package chat.rocket.common.internal;

import java.lang.System;

/**
 * * [JsonAdapter] that fallbacks to a default class type declared in the sealed class annotated
 * * with [FallbackSealedClass].
 * *
 * *
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u001eB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001a\u00020\u0015H\u0017\u00a2\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00018\u0000H\u0017\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0006H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0011X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lchat/rocket/common/internal/FallbackSealedClassJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "classType", "Ljava/lang/Class;", "fallback", "", "fieldName", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V", "fallbackConstant", "fallbackConstructor", "Ljava/lang/reflect/Constructor;", "fallbackConstructorField", "Ljava/lang/reflect/Field;", "nameConstantMap", "", "nameStrings", "", "[Ljava/lang/String;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V", "toString", "Companion", "common"})
public final class FallbackSealedClassJsonAdapter<T extends java.lang.Object> extends com.squareup.moshi.JsonAdapter<T> {
    private final java.lang.Class<? extends T> fallbackConstant = null;
    private final java.lang.reflect.Constructor<? extends T> fallbackConstructor = null;
    private final java.util.Map<java.lang.String, java.lang.Class<? extends T>> nameConstantMap = null;
    private final java.lang.String[] nameStrings = null;
    private final java.lang.reflect.Field fallbackConstructorField = null;
    private final java.lang.Class<T> classType = null;
    private final java.lang.String fieldName = null;
    
    /**
     * * Builds an adapter that can process sealed classes annotated with [FallbackSealedClass].
     */
    @org.jetbrains.annotations.NotNull()
    private static final com.squareup.moshi.JsonAdapter.Factory ADAPTER_FACTORY = null;
    public static final chat.rocket.common.internal.FallbackSealedClassJsonAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public T fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    T value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FallbackSealedClassJsonAdapter(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> classType, @org.jetbrains.annotations.NotNull()
    java.lang.String fallback, @org.jetbrains.annotations.NotNull()
    java.lang.String fieldName) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lchat/rocket/common/internal/FallbackSealedClassJsonAdapter$Companion;", "", "()V", "ADAPTER_FACTORY", "Lcom/squareup/moshi/JsonAdapter$Factory;", "getADAPTER_FACTORY", "()Lcom/squareup/moshi/JsonAdapter$Factory;", "common"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.squareup.moshi.JsonAdapter.Factory getADAPTER_FACTORY() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}