package chat.rocket.core.internal.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;

public final class KotshiSignUpPayloadJsonAdapter extends JsonAdapter<SignUpPayload> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "username",
      "email",
      "pass",
      "name");

  @Override
  public void toJson(JsonWriter writer, SignUpPayload value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("username");
    writer.value(value.getUsername());
    writer.name("email");
    writer.value(value.getEmail());
    writer.name("pass");
    writer.value(value.getPassword());
    writer.name("name");
    writer.value(value.getName());

    writer.endObject();
  }

  @Override
  public SignUpPayload fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String username = null;
    String email = null;
    String password = null;
    String name = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            username = reader.nextString();
          }
          continue;
        }
        case 1: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            email = reader.nextString();
          }
          continue;
        }
        case 2: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            password = reader.nextString();
          }
          continue;
        }
        case 3: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            name = reader.nextString();
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
    return new SignUpPayload(
        username,
        email,
        password,
        name);
  }
}
