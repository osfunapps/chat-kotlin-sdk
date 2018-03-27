package chat.rocket.core.internal.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;

public final class KotshiUserPayloadDataJsonAdapter extends JsonAdapter<UserPayloadData> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "name",
      "password",
      "username",
      "email");

  @Override
  public void toJson(JsonWriter writer, UserPayloadData value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("name");
    writer.value(value.getName());
    writer.name("password");
    writer.value(value.getPassword());
    writer.name("username");
    writer.value(value.getUsername());
    writer.name("email");
    writer.value(value.getEmail());

    writer.endObject();
  }

  @Override
  public UserPayloadData fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String name = null;
    String password = null;
    String username = null;
    String email = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            name = reader.nextString();
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
            username = reader.nextString();
          }
          continue;
        }
        case 3: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            email = reader.nextString();
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
    return new UserPayloadData(
        name,
        password,
        username,
        email);
  }
}
