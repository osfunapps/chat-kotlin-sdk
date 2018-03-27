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

public final class KotshiUrlJsonAdapter extends JsonAdapter<Url> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "url",
      "meta",
      "headers",
      "parsedUrl",
      "ignoreParse");

  private final JsonAdapter<Meta> adapter0;

  private final JsonAdapter<Map<String, String>> adapter1;

  private final JsonAdapter<ParsedUrl> adapter2;

  public KotshiUrlJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(Meta.class);
    adapter1 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, String.class));
    adapter2 = moshi.adapter(ParsedUrl.class);
  }

  @Override
  public void toJson(JsonWriter writer, Url value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("url");
    writer.value(value.getUrl());
    writer.name("meta");
    adapter0.toJson(writer, value.getMeta());
    writer.name("headers");
    adapter1.toJson(writer, value.getHeaders());
    writer.name("parsedUrl");
    adapter2.toJson(writer, value.getParsedUrl());
    writer.name("ignoreParse");
    writer.value(value.getIgnoreParse());

    writer.endObject();
  }

  @Override
  public Url fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String url = null;
    Meta meta = null;
    Map<String, String> headers = null;
    ParsedUrl parsedUrl = null;
    boolean ignoreParse = false;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            url = reader.nextString();
          }
          continue;
        }
        case 1: {
          meta = adapter0.fromJson(reader);
          continue;
        }
        case 2: {
          headers = adapter1.fromJson(reader);
          continue;
        }
        case 3: {
          parsedUrl = adapter2.fromJson(reader);
          continue;
        }
        case 4: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            ignoreParse = reader.nextBoolean();
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
    if (url == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "url");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new Url(
        url,
        meta,
        headers,
        parsedUrl,
        ignoreParse);
  }
}
