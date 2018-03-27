package chat.rocket.common.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0017\u00a2\u0006\u0002\u0010\fJ#\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lchat/rocket/common/model/TimestampAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "", "dateConverter", "Lchat/rocket/common/util/ISO8601Converter;", "(Lchat/rocket/common/util/ISO8601Converter;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "kotlin.jvm.PlatformType", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Long;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Long;)V", "common"})
public final class TimestampAdapter extends com.squareup.moshi.JsonAdapter<java.lang.Long> {
    private final com.squareup.moshi.JsonReader.Options options = null;
    private final chat.rocket.common.util.ISO8601Converter dateConverter = null;
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.Nullable()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    @chat.rocket.common.internal.ISO8601Date()
    java.lang.Long value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    @chat.rocket.common.internal.ISO8601Date()
    public java.lang.Long fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    public TimestampAdapter(@org.jetbrains.annotations.NotNull()
    chat.rocket.common.util.ISO8601Converter dateConverter) {
        super();
    }
}