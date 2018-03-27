package chat.rocket.core.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiCommandJsonAdapter extends JsonAdapter<Command> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "command",
      "params",
      "description",
      "clientOnly");

  @Override
  public void toJson(JsonWriter writer, Command value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("command");
    writer.value(value.getCommand());
    writer.name("params");
    writer.value(value.getParams());
    writer.name("description");
    writer.value(value.getDescription());
    writer.name("clientOnly");
    writer.value(value.getClientOnly());

    writer.endObject();
  }

  @Override
  public Command fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String command = null;
    String params = null;
    String description = null;
    boolean clientOnly = false;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            command = reader.nextString();
          }
          continue;
        }
        case 1: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            params = reader.nextString();
          }
          continue;
        }
        case 2: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            description = reader.nextString();
          }
          continue;
        }
        case 3: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            clientOnly = reader.nextBoolean();
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
    if (command == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "command");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new Command(
        command,
        params,
        description,
        clientOnly);
  }
}
