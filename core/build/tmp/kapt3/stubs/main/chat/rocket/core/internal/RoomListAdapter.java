package chat.rocket.core.internal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016R2\u0010\t\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00030\u0003 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lchat/rocket/core/internal/RoomListAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "", "Lchat/rocket/core/model/Room;", "moshi", "Lcom/squareup/moshi/Moshi;", "logger", "Lchat/rocket/common/util/Logger;", "(Lcom/squareup/moshi/Moshi;Lchat/rocket/common/util/Logger;)V", "adapter", "kotlin.jvm.PlatformType", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "core"})
public final class RoomListAdapter extends com.squareup.moshi.JsonAdapter<java.util.List<? extends chat.rocket.core.model.Room>> {
    private final com.squareup.moshi.JsonAdapter<chat.rocket.core.model.Room> adapter = null;
    private final chat.rocket.common.util.Logger logger = null;
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    java.util.List<chat.rocket.core.model.Room> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<chat.rocket.core.model.Room> fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    public RoomListAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi, @org.jetbrains.annotations.NotNull()
    chat.rocket.common.util.Logger logger) {
        super();
    }
}