package chat.rocket.core.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.StringBuilder;
import java.lang.reflect.Type;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiPagedResultJsonAdapter<T> extends JsonAdapter<PagedResult<T>> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "result",
      "total",
      "offset");

  private final JsonAdapter<T> adapter0;

  public KotshiPagedResultJsonAdapter(Moshi moshi, Type[] types) {
    adapter0 = moshi.adapter(types[0]);
  }

  @Override
  public void toJson(JsonWriter writer, PagedResult<T> value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("result");
    adapter0.toJson(writer, value.getResult());
    writer.name("total");
    writer.value(value.getTotal());
    writer.name("offset");
    writer.value(value.getOffset());

    writer.endObject();
  }

  @Override
  public PagedResult<T> fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    T result = null;
    boolean totalIsSet = false;
    long total = 0;
    boolean offsetIsSet = false;
    long offset = 0;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          result = adapter0.fromJson(reader);
          continue;
        }
        case 1: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            total = reader.nextLong();
            totalIsSet = true;
          }
          continue;
        }
        case 2: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            offset = reader.nextLong();
            offsetIsSet = true;
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
    if (result == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "result");
    }
    if (!totalIsSet) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "total");
    }
    if (!offsetIsSet) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "offset");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new PagedResult<T>(
        result,
        total,
        offset);
  }
}
