package chat.rocket.core.model;

import chat.rocket.common.internal.ISO8601Date;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.lang.Long;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiPushTokenJsonAdapter extends JsonAdapter<PushToken> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "_id",
      "appName",
      "userId",
      "enabled",
      "createdAt",
      "updatedAt");

  private final JsonAdapter<Long> adapter0;

  public KotshiPushTokenJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(Long.class, ISO8601Date.class);
  }

  @Override
  public void toJson(JsonWriter writer, PushToken value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("_id");
    writer.value(value.getId());
    writer.name("appName");
    writer.value(value.getAppName());
    writer.name("userId");
    writer.value(value.getUserId());
    writer.name("enabled");
    writer.value(value.getEnabled());
    writer.name("createdAt");
    adapter0.toJson(writer, value.getCreatedAt());
    writer.name("updatedAt");
    adapter0.toJson(writer, value.getUpdatedAt());

    writer.endObject();
  }

  @Override
  public PushToken fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String id = null;
    String appName = null;
    String userId = null;
    boolean enabledIsSet = false;
    boolean enabled = false;
    Long createdAt = null;
    Long updatedAt = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            id = reader.nextString();
          }
          continue;
        }
        case 1: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            appName = reader.nextString();
          }
          continue;
        }
        case 2: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            userId = reader.nextString();
          }
          continue;
        }
        case 3: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            enabled = reader.nextBoolean();
            enabledIsSet = true;
          }
          continue;
        }
        case 4: {
          createdAt = adapter0.fromJson(reader);
          continue;
        }
        case 5: {
          updatedAt = adapter0.fromJson(reader);
          continue;
        }
        case -1: {
          reader.nextName();
          reader.skipValue();
          continue;
        }
      }
    }

    reader.endObject();
    StringBuilder stringBuilder = null;
    if (id == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "id");
    }
    if (appName == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "appName");
    }
    if (userId == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "userId");
    }
    if (!enabledIsSet) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "enabled");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new PushToken(
        id,
        appName,
        userId,
        enabled,
        createdAt,
        updatedAt);
  }
}
