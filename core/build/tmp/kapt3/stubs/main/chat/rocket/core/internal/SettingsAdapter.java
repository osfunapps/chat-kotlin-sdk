package chat.rocket.core.internal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J$\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\"\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J,\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0002H\u0016J,\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0002H\u0002R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u000e\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lchat/rocket/core/internal/SettingsAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "", "", "Lchat/rocket/core/model/Value;", "", "()V", "ASSET_NAMES", "", "[Ljava/lang/String;", "ASSET_OPTIONS", "Lcom/squareup/moshi/JsonReader$Options;", "kotlin.jvm.PlatformType", "NAMES", "OPTIONS", "assertNextName", "", "reader", "Lcom/squareup/moshi/JsonReader;", "expected", "fromJson", "readAsset", "readSetting", "Lkotlin/Pair;", "toJson", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "writeSettingsObject", "core"})
public final class SettingsAdapter extends com.squareup.moshi.JsonAdapter<java.util.Map<java.lang.String, ? extends chat.rocket.core.model.Value<? extends java.lang.Object>>> {
    private final java.lang.String[] NAMES = null;
    private final com.squareup.moshi.JsonReader.Options OPTIONS = null;
    private final java.lang.String[] ASSET_NAMES = null;
    private final com.squareup.moshi.JsonReader.Options ASSET_OPTIONS = null;
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends chat.rocket.core.model.Value<? extends java.lang.Object>> value) {
    }
    
    private final void writeSettingsObject(com.squareup.moshi.JsonWriter writer, java.util.Map<java.lang.String, ? extends chat.rocket.core.model.Value<? extends java.lang.Object>> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    @com.squareup.moshi.FromJson()
    public java.util.Map<java.lang.String, chat.rocket.core.model.Value<java.lang.Object>> fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    private final kotlin.Pair<java.lang.String, chat.rocket.core.model.Value<java.lang.Object>> readSetting(com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    private final java.lang.String readAsset(com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    private final void assertNextName(com.squareup.moshi.JsonReader reader, java.lang.String expected) {
    }
    
    public SettingsAdapter() {
        super();
    }
}