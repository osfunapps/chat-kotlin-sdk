package chat.rocket.core.internal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\nH\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000RJ\u0010\u000f\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u000e*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00100\u0010 \u000e*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u000e*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00100\u0010\u0018\u00010\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R2\u0010\u0011\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00120\u0012 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00120\u0012\u0018\u00010\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\u00140\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lchat/rocket/core/internal/AttachmentAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lchat/rocket/core/model/attachment/Attachment;", "moshi", "Lcom/squareup/moshi/Moshi;", "logger", "Lchat/rocket/common/util/Logger;", "(Lcom/squareup/moshi/Moshi;Lchat/rocket/common/util/Logger;)V", "NAMES", "", "", "[Ljava/lang/String;", "OPTIONS", "Lcom/squareup/moshi/JsonReader$Options;", "kotlin.jvm.PlatformType", "attachmentsAdapter", "", "tsAdapter", "", "type", "Ljava/lang/reflect/ParameterizedType;", "checkNonNull", "", "field", "", "fieldName", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "core"})
public final class AttachmentAdapter extends com.squareup.moshi.JsonAdapter<chat.rocket.core.model.attachment.Attachment> {
    private final java.lang.reflect.ParameterizedType type = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<chat.rocket.core.model.attachment.Attachment>> attachmentsAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.Long> tsAdapter = null;
    private final java.lang.String[] NAMES = null;
    private final com.squareup.moshi.JsonReader.Options OPTIONS = null;
    private final chat.rocket.common.util.Logger logger = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public chat.rocket.core.model.attachment.Attachment fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    chat.rocket.core.model.attachment.Attachment value) {
    }
    
    private final void checkNonNull(java.lang.Object field, java.lang.String fieldName) {
    }
    
    public AttachmentAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi, @org.jetbrains.annotations.NotNull()
    chat.rocket.common.util.Logger logger) {
        super();
    }
}