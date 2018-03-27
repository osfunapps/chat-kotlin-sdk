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

public final class KotshiAuthenticationErrorMessageJsonAdapter extends JsonAdapter<AuthenticationErrorMessage> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "message",
      "status",
      "error");

  @Override
  public void toJson(JsonWriter writer, AuthenticationErrorMessage value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("message");
    writer.value(value.getMessage());
    writer.name("status");
    writer.value(value.getStatus());
    writer.name("error");
    writer.value(value.getError());

    writer.endObject();
  }

  @Override
  public AuthenticationErrorMessage fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String message = null;
    String status = null;
    String error = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            message = reader.nextString();
          }
          continue;
        }
        case 1: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            status = reader.nextString();
          }
          continue;
        }
        case 2: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            error = reader.nextString();
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
    if (message == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "message");
    }
    if (status == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "status");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new AuthenticationErrorMessage(
        message,
        status,
        error);
  }
}
