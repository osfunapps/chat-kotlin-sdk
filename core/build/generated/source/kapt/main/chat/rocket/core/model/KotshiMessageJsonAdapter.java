package chat.rocket.core.model;

import chat.rocket.common.internal.ISO8601Date;
import chat.rocket.common.model.SimpleRoom;
import chat.rocket.common.model.SimpleUser;
import chat.rocket.core.model.attachment.Attachment;
import chat.rocket.core.model.url.Url;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.Long;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiMessageJsonAdapter extends JsonAdapter<Message> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "_id",
      "rid",
      "msg",
      "ts",
      "u",
      "_updatedAt",
      "editedAt",
      "editedBy",
      "alias",
      "avatar",
      "t",
      "groupable",
      "parseUrls",
      "urls",
      "mentions",
      "channels",
      "attachments",
      "pinned",
      "reactions");

  private final JsonAdapter<Long> adapter0;

  private final JsonAdapter<SimpleUser> adapter1;

  private final JsonAdapter<Long> adapter2;

  private final JsonAdapter<MessageType> adapter3;

  private final JsonAdapter<List<Url>> adapter4;

  private final JsonAdapter<List<SimpleUser>> adapter5;

  private final JsonAdapter<List<SimpleRoom>> adapter6;

  private final JsonAdapter<List<Attachment>> adapter7;

  private final JsonAdapter<Reactions> adapter8;

  public KotshiMessageJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(long.class, ISO8601Date.class);
    adapter1 = moshi.adapter(SimpleUser.class);
    adapter2 = moshi.adapter(Long.class, ISO8601Date.class);
    adapter3 = moshi.adapter(MessageType.class);
    adapter4 = moshi.adapter(Types.newParameterizedType(List.class, Url.class));
    adapter5 = moshi.adapter(Types.newParameterizedType(List.class, SimpleUser.class));
    adapter6 = moshi.adapter(Types.newParameterizedType(List.class, SimpleRoom.class));
    adapter7 = moshi.adapter(Types.newParameterizedType(List.class, Attachment.class));
    adapter8 = moshi.adapter(Reactions.class);
  }

  @Override
  public void toJson(JsonWriter writer, Message value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("_id");
    writer.value(value.getId());
    writer.name("rid");
    writer.value(value.getRoomId());
    writer.name("msg");
    writer.value(value.getMessage());
    writer.name("ts");
    adapter0.toJson(writer, value.getTimestamp());
    writer.name("u");
    adapter1.toJson(writer, value.getSender());
    writer.name("_updatedAt");
    adapter2.toJson(writer, value.getUpdatedAt());
    writer.name("editedAt");
    adapter2.toJson(writer, value.getEditedAt());
    writer.name("editedBy");
    adapter1.toJson(writer, value.getEditedBy());
    writer.name("alias");
    writer.value(value.getSenderAlias());
    writer.name("avatar");
    writer.value(value.getAvatar());
    writer.name("t");
    adapter3.toJson(writer, value.getType());
    writer.name("groupable");
    writer.value(value.getGroupable());
    writer.name("parseUrls");
    writer.value(value.getParseUrls());
    writer.name("urls");
    adapter4.toJson(writer, value.getUrls());
    writer.name("mentions");
    adapter5.toJson(writer, value.getMentions());
    writer.name("channels");
    adapter6.toJson(writer, value.getChannels());
    writer.name("attachments");
    adapter7.toJson(writer, value.getAttachments());
    writer.name("pinned");
    writer.value(value.getPinned());
    writer.name("reactions");
    adapter8.toJson(writer, value.getReactions());

    writer.endObject();
  }

  @Override
  public Message fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String id = null;
    String roomId = null;
    String message = "";
    Long timestamp = null;
    SimpleUser sender = null;
    Long updatedAt = null;
    Long editedAt = null;
    SimpleUser editedBy = null;
    String senderAlias = null;
    String avatar = null;
    MessageType type = null;
    boolean groupable = false;
    boolean parseUrls = false;
    List<Url> urls = null;
    List<SimpleUser> mentions = null;
    List<SimpleRoom> channels = null;
    List<Attachment> attachments = null;
    boolean pinned = false;
    Reactions reactions = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            id = reader.nextString();
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
            message = reader.nextString();
          }
          continue;
        }
        case 3: {
          timestamp = adapter0.fromJson(reader);
          continue;
        }
        case 4: {
          sender = adapter1.fromJson(reader);
          continue;
        }
        case 5: {
          updatedAt = adapter2.fromJson(reader);
          continue;
        }
        case 6: {
          editedAt = adapter2.fromJson(reader);
          continue;
        }
        case 7: {
          editedBy = adapter1.fromJson(reader);
          continue;
        }
        case 8: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            senderAlias = reader.nextString();
          }
          continue;
        }
        case 9: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            avatar = reader.nextString();
          }
          continue;
        }
        case 10: {
          type = adapter3.fromJson(reader);
          continue;
        }
        case 11: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            groupable = reader.nextBoolean();
          }
          continue;
        }
        case 12: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            parseUrls = reader.nextBoolean();
          }
          continue;
        }
        case 13: {
          urls = adapter4.fromJson(reader);
          continue;
        }
        case 14: {
          mentions = adapter5.fromJson(reader);
          continue;
        }
        case 15: {
          channels = adapter6.fromJson(reader);
          continue;
        }
        case 16: {
          attachments = adapter7.fromJson(reader);
          continue;
        }
        case 17: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            pinned = reader.nextBoolean();
          }
          continue;
        }
        case 18: {
          reactions = adapter8.fromJson(reader);
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
    if (id == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "id");
    }
    if (roomId == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "roomId");
    }
    if (timestamp == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "timestamp");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new Message(
        id,
        roomId,
        message,
        timestamp,
        sender,
        updatedAt,
        editedAt,
        editedBy,
        senderAlias,
        avatar,
        type,
        groupable,
        parseUrls,
        urls,
        mentions,
        channels,
        attachments,
        pinned,
        reactions);
  }
}
