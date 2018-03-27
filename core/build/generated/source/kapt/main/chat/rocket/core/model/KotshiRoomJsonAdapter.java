package chat.rocket.core.model;

import chat.rocket.common.internal.ISO8601Date;
import chat.rocket.common.model.RoomType;
import chat.rocket.common.model.SimpleUser;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.lang.Long;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiRoomJsonAdapter extends JsonAdapter<Room> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "_id",
      "t",
      "u",
      "name",
      "fname",
      "ro",
      "_updatedAt",
      "topic",
      "announcement",
      "lastMessage");

  private final JsonAdapter<RoomType> adapter0;

  private final JsonAdapter<SimpleUser> adapter1;

  private final JsonAdapter<Long> adapter2;

  private final JsonAdapter<Message> adapter3;

  public KotshiRoomJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(RoomType.class);
    adapter1 = moshi.adapter(SimpleUser.class);
    adapter2 = moshi.adapter(Long.class, ISO8601Date.class);
    adapter3 = moshi.adapter(Message.class);
  }

  @Override
  public void toJson(JsonWriter writer, Room value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("_id");
    writer.value(value.getId());
    writer.name("t");
    adapter0.toJson(writer, value.getType());
    writer.name("u");
    adapter1.toJson(writer, value.getUser());
    writer.name("name");
    writer.value(value.getName());
    writer.name("fname");
    writer.value(value.getFullName());
    writer.name("ro");
    writer.value(value.getReadonly());
    writer.name("_updatedAt");
    adapter2.toJson(writer, value.getUpdatedAt());
    writer.name("topic");
    writer.value(value.getTopic());
    writer.name("announcement");
    writer.value(value.getAnnouncement());
    writer.name("lastMessage");
    adapter3.toJson(writer, value.getLastMessage());

    writer.endObject();
  }

  @Override
  public Room fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String id = null;
    RoomType type = null;
    SimpleUser user = null;
    String name = null;
    String fullName = null;
    boolean readonly = false;
    Long updatedAt = null;
    String topic = null;
    String announcement = null;
    Message lastMessage = null;
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
          type = adapter0.fromJson(reader);
          continue;
        }
        case 2: {
          user = adapter1.fromJson(reader);
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
        case 4: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            fullName = reader.nextString();
          }
          continue;
        }
        case 5: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            readonly = reader.nextBoolean();
          }
          continue;
        }
        case 6: {
          updatedAt = adapter2.fromJson(reader);
          continue;
        }
        case 7: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            topic = reader.nextString();
          }
          continue;
        }
        case 8: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            announcement = reader.nextString();
          }
          continue;
        }
        case 9: {
          lastMessage = adapter3.fromJson(reader);
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
    if (type == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "type");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new Room(
        id,
        type,
        user,
        name,
        fullName,
        readonly,
        updatedAt,
        topic,
        announcement,
        lastMessage);
  }
}
