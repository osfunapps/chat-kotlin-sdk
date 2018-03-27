package chat.rocket.common.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.StringBuilder;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiBaseResultJsonAdapter extends JsonAdapter<BaseResult> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "success");

  @Override
  public void toJson(JsonWriter writer, BaseResult value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("success");
    writer.value(value.getSuccess());

    writer.endObject();
  }

  @Override
  public BaseResult fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    boolean successIsSet = false;
    boolean success = false;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            success = reader.nextBoolean();
            successIsSet = true;
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
    if (!successIsSet) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "success");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new BaseResult(
        success);
  }
}
