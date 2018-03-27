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

public final class KotshiDeletePayloadJsonAdapter extends JsonAdapter<DeletePayload> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "roomId",
      "msgId",
      "asUser");

  @Override
  public void toJson(JsonWriter writer, DeletePayload value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("roomId");
    writer.value(value.getRoomId());
    writer.name("msgId");
    writer.value(value.getMsgId());
    writer.name("asUser");
    writer.value(value.getAsUser());

    writer.endObject();
  }

  @Override
  public DeletePayload fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String roomId = null;
    String msgId = null;
    boolean asUserIsSet = false;
    boolean asUser = false;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            roomId = reader.nextString();
          }
          continue;
        }
        case 1: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            msgId = reader.nextString();
          }
          continue;
        }
        case 2: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            asUser = reader.nextBoolean();
            asUserIsSet = true;
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
    if (roomId == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "roomId");
    }
    if (msgId == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "msgId");
    }
    if (!asUserIsSet) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "asUser");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new DeletePayload(
        roomId,
        msgId,
        asUser);
  }
}
