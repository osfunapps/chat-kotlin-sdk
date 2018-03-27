package chat.rocket.common.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiServerInfoJsonAdapter extends JsonAdapter<ServerInfo> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "version");

  @Override
  public void toJson(JsonWriter writer, ServerInfo value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("version");
    writer.value(value.getVersion());

    writer.endObject();
  }

  @Override
  public ServerInfo fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String version = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            version = reader.nextString();
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
    if (version == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "version");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new ServerInfo(
        version);
  }
}
