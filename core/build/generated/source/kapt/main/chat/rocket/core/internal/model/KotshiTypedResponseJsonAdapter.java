package chat.rocket.core.internal.model;

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

public final class KotshiTypedResponseJsonAdapter<T> extends JsonAdapter<TypedResponse<T>> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "result");

  private final JsonAdapter<T> adapter0;

  public KotshiTypedResponseJsonAdapter(Moshi moshi, Type[] types) {
    adapter0 = moshi.adapter(types[0]);
  }

  @Override
  public void toJson(JsonWriter writer, TypedResponse<T> value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("result");
    adapter0.toJson(writer, value.getResult());

    writer.endObject();
  }

  @Override
  public TypedResponse<T> fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    T result = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          result = adapter0.fromJson(reader);
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
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new TypedResponse<T>(
        result);
  }
}
