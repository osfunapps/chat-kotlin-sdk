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

public final class KotshiCommandPayloadJsonAdapter extends JsonAdapter<CommandPayload> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "command",
      "roomId",
      "params");

  @Override
  public void toJson(JsonWriter writer, CommandPayload value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("command");
    writer.value(value.getCommand());
    writer.name("roomId");
    writer.value(value.getRoomId());
    writer.name("params");
    writer.value(value.getParams());

    writer.endObject();
  }

  @Override
  public CommandPayload fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String command = null;
    String roomId = null;
    String params = null;
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
            roomId = reader.nextString();
          }
          continue;
        }
        case 2: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            params = reader.nextString();
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
    if (roomId == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "roomId");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new CommandPayload(
        command,
        roomId,
        params);
  }
}
