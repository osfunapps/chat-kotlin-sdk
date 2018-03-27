package chat.rocket.common.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiErrorMessageJsonAdapter extends JsonAdapter<ErrorMessage> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "error",
      "errorType");

  @Override
  public void toJson(JsonWriter writer, ErrorMessage value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("error");
    writer.value(value.getError());
    writer.name("errorType");
    writer.value(value.getErrorType());

    writer.endObject();
  }

  @Override
  public ErrorMessage fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String error = null;
    String errorType = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            error = reader.nextString();
          }
          continue;
        }
        case 1: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            errorType = reader.nextString();
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
    if (error == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "error");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new ErrorMessage(
        error,
        errorType);
  }
}
