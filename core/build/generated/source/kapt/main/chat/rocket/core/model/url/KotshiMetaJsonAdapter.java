package chat.rocket.core.model.url;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Map;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiMetaJsonAdapter extends JsonAdapter<Meta> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "title",
      "description",
      "imageUrl",
      "raw");

  private final JsonAdapter<Map<String, String>> adapter0;

  public KotshiMetaJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, String.class));
  }

  @Override
  public void toJson(JsonWriter writer, Meta value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("title");
    writer.value(value.getTitle());
    writer.name("description");
    writer.value(value.getDescription());
    writer.name("imageUrl");
    writer.value(value.getImageUrl());
    writer.name("raw");
    adapter0.toJson(writer, value.getRaw());

    writer.endObject();
  }

  @Override
  public Meta fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String title = null;
    String description = null;
    String imageUrl = null;
    Map<String, String> raw = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            title = reader.nextString();
          }
          continue;
        }
        case 1: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            description = reader.nextString();
          }
          continue;
        }
        case 2: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            imageUrl = reader.nextString();
          }
          continue;
        }
        case 3: {
          raw = adapter0.fromJson(reader);
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
    if (raw == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "raw");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new Meta(
        title,
        description,
        imageUrl,
        raw);
  }
}
