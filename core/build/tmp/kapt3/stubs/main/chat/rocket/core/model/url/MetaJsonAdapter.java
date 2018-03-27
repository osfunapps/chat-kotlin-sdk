package chat.rocket.core.model.url;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u001e\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u001e\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lchat/rocket/core/model/url/MetaJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lchat/rocket/core/model/url/Meta;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "adapter", "", "", "type", "Ljava/lang/reflect/ParameterizedType;", "kotlin.jvm.PlatformType", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "getDescription", "rawMeta", "getImageUrl", "getTitle", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "Companion", "core"})
public final class MetaJsonAdapter extends com.squareup.moshi.JsonAdapter<chat.rocket.core.model.url.Meta> {
    private final java.lang.reflect.ParameterizedType type = null;
    private final com.squareup.moshi.JsonAdapter<java.util.Map<java.lang.String, java.lang.String>> adapter = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.squareup.moshi.JsonAdapter.Factory ADAPTER_FACTORY = null;
    public static final chat.rocket.core.model.url.MetaJsonAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public chat.rocket.core.model.url.Meta fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    private final java.lang.String getTitle(java.util.Map<java.lang.String, java.lang.String> rawMeta) {
        return null;
    }
    
    private final java.lang.String getDescription(java.util.Map<java.lang.String, java.lang.String> rawMeta) {
        return null;
    }
    
    private final java.lang.String getImageUrl(java.util.Map<java.lang.String, java.lang.String> rawMeta) {
        return null;
    }
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    chat.rocket.core.model.url.Meta value) {
    }
    
    public MetaJsonAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lchat/rocket/core/model/url/MetaJsonAdapter$Companion;", "", "()V", "ADAPTER_FACTORY", "Lcom/squareup/moshi/JsonAdapter$Factory;", "getADAPTER_FACTORY", "()Lcom/squareup/moshi/JsonAdapter$Factory;", "core"})
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