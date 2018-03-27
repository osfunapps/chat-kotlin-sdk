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

public final class KotshiValueJsonAdapter<T> extends JsonAdapter<Value<T>> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "value");

  private final JsonAdapter<T> adapter0;

  public KotshiValueJsonAdapter(Moshi moshi, Type[] types) {
    adapter0 = moshi.adapter(types[0]);
  }

  @Override
  public void toJson(JsonWriter writer, Value<T> value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("value");
    adapter0.toJson(writer, value.getValue());

    writer.endObject();
  }

  @Override
  public Value<T> fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    T value_ = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          value_ = adapter0.fromJson(reader);
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
    if (value_ == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "value");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new Value<T>(
        value_);
  }
}
