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

public final class KotshiEmailLoginPayloadJsonAdapter extends JsonAdapter<EmailLoginPayload> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "user",
      "password",
      "code");

  @Override
  public void toJson(JsonWriter writer, EmailLoginPayload value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("user");
    writer.value(value.getUser());
    writer.name("password");
    writer.value(value.getPassword());
    writer.name("code");
    writer.value(value.getCode());

    writer.endObject();
  }

  @Override
  public EmailLoginPayload fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String user = null;
    String password = null;
    String code = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            user = reader.nextString();
          }
          continue;
        }
        case 1: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            password = reader.nextString();
          }
          continue;
        }
        case 2: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            code = reader.nextString();
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
    if (user == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "user");
    }
    if (password == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "password");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new EmailLoginPayload(
        user,
        password,
        code);
  }
}
