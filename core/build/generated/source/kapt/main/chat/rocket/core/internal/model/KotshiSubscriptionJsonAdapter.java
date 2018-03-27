package chat.rocket.core.internal.model;

import chat.rocket.common.internal.ISO8601Date;
import chat.rocket.common.model.RoomType;
import chat.rocket.common.model.SimpleUser;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiSubscriptionJsonAdapter extends JsonAdapter<Subscription> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "rid",
      "_id",
      "t",
      "u",
      "name",
      "fname",
      "ro",
      "ts",
      "ls",
      "_updatedAt",
      "default",
      "open",
      "alert",
      "unread",
      "userMentions",
      "groupMentions");

  private final JsonAdapter<RoomType> adapter0;

  private final JsonAdapter<SimpleUser> adapter1;

  private final JsonAdapter<Long> adapter2;

  public KotshiSubscriptionJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(RoomType.class);
    adapter1 = moshi.adapter(SimpleUser.class);
    adapter2 = moshi.adapter(Long.class, ISO8601Date.class);
  }

  @Override
  public void toJson(JsonWriter writer, Subscription value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("rid");
    writer.value(value.getRoomId());
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
    writer.name("ts");
    adapter2.toJson(writer, value.getTimestamp());
    writer.name("ls");
    adapter2.toJson(writer, value.getLastSeen());
    writer.name("_updatedAt");
    adapter2.toJson(writer, value.getUpdatedAt());
    writer.name("default");
    writer.value(value.isDefault());
    writer.name("open");
    writer.value(value.getOpen());
    writer.name("alert");
    writer.value(value.getAlert());
    writer.name("unread");
    writer.value(value.getUnread());
    writer.name("userMentions");
    writer.value(value.getUserMentions());
    writer.name("groupMentions");
    writer.value(value.getGroupMentions());

    writer.endObject();
  }

  @Override
  public Subscription fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String roomId = null;
    String id = null;
    RoomType type = null;
    SimpleUser user = null;
    String name = null;
    String fullName = null;
    Boolean readonly = null;
    Long timestamp = null;
    Long lastSeen = null;
    Long updatedAt = null;
    boolean isDefault = false;
    boolean open = false;
    boolean alert = false;
    long unread = 0L;
    Long userMentions = 0L;
    Long groupMentions = 0L;
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
            id = reader.nextString();
          }
          continue;
        }
        case 2: {
          type = adapter0.fromJson(reader);
          continue;
        }
        case 3: {
          user = adapter1.fromJson(reader);
          continue;
        }
        case 4: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            name = reader.nextString();
          }
          continue;
        }
        case 5: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            fullName = reader.nextString();
          }
          continue;
        }
        case 6: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            readonly = reader.nextBoolean();
          }
          continue;
        }
        case 7: {
          timestamp = adapter2.fromJson(reader);
          continue;
        }
        case 8: {
          lastSeen = adapter2.fromJson(reader);
          continue;
        }
        case 9: {
          updatedAt = adapter2.fromJson(reader);
          continue;
        }
        case 10: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            isDefault = reader.nextBoolean();
          }
          continue;
        }
        case 11: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            open = reader.nextBoolean();
          }
          continue;
        }
        case 12: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            alert = reader.nextBoolean();
          }
          continue;
        }
        case 13: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            unread = reader.nextLong();
          }
          continue;
        }
        case 14: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            userMentions = reader.nextLong();
          }
          continue;
        }
        case 15: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            groupMentions = reader.nextLong();
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
    if (id == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "id");
    }
    if (type == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "type");
    }
    if (name == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "name");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new Subscription(
        roomId,
        id,
        type,
        user,
        name,
        fullName,
        readonly,
        timestamp,
        lastSeen,
        updatedAt,
        isDefault,
        open,
        alert,
        unread,
        userMentions,
        groupMentions);
  }
}
