package chat.rocket.core.internal.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiPushRegistrationPayloadJsonAdapter extends JsonAdapter<PushRegistrationPayload> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "type",
      "value",
      "appName");

  @Override
  public void toJson(JsonWriter writer, PushRegistrationPayload value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("type");
    writer.value(value.getType());
    writer.name("value");
    writer.value(value.getValue());
    writer.name("appName");
    writer.value(value.getAppName());

    writer.endObject();
  }

  @Override
  public PushRegistrationPayload fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String type = null;
    String value_ = null;
    String appName = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            type = reader.nextString();
          }
          continue;
        }
        case 1: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            value_ = reader.nextString();
          }
          continue;
        }
        case 2: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            appName = reader.nextString();
          }
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
    if (type == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "type");
    }
    if (value_ == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "value");
    }
    if (appName == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "appName");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new PushRegistrationPayload(
        type,
        value_,
        appName);
  }
}
