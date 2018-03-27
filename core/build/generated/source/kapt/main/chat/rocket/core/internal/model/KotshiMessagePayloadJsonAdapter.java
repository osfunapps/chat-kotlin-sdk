package chat.rocket.core.internal.model;

import chat.rocket.core.model.attachment.Attachment;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiMessagePayloadJsonAdapter extends JsonAdapter<MessagePayload> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "roomId",
      "text",
      "alias",
      "emoji",
      "avatar",
      "attachments",
      "msgId");

  private final JsonAdapter<List<Attachment>> adapter0;

  public KotshiMessagePayloadJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(Types.newParameterizedType(List.class, Attachment.class));
  }

  @Override
  public void toJson(JsonWriter writer, MessagePayload value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("roomId");
    writer.value(value.getRoomId());
    writer.name("text");
    writer.value(value.getText());
    writer.name("alias");
    writer.value(value.getAlias());
    writer.name("emoji");
    writer.value(value.getEmoji());
    writer.name("avatar");
    writer.value(value.getAvatar());
    writer.name("attachments");
    adapter0.toJson(writer, value.getAttachments());
    writer.name("msgId");
    writer.value(value.getMsgId());

    writer.endObject();
  }

  @Override
  public MessagePayload fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String roomId = null;
    String text = null;
    String alias = null;
    String emoji = null;
    String avatar = null;
    List<Attachment> attachments = null;
    String msgId = null;
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
            text = reader.nextString();
          }
          continue;
        }
        case 2: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            alias = reader.nextString();
          }
          continue;
        }
        case 3: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            emoji = reader.nextString();
          }
          continue;
        }
        case 4: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            avatar = reader.nextString();
          }
          continue;
        }
        case 5: {
          attachments = adapter0.fromJson(reader);
          continue;
        }
        case 6: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            msgId = reader.nextString();
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
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new MessagePayload(
        roomId,
        text,
        alias,
        emoji,
        avatar,
        attachments,
        msgId);
  }
}
