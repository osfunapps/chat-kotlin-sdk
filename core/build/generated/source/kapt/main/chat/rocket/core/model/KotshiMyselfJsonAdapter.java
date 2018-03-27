package chat.rocket.core.model;

import chat.rocket.common.model.UserStatus;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.Float;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiMyselfJsonAdapter extends JsonAdapter<Myself> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "_id",
      "username",
      "name",
      "status",
      "statusConnection",
      "utcOffset",
      "active",
      "emails");

  private final JsonAdapter<UserStatus> adapter0;

  private final JsonAdapter<List<Email>> adapter1;

  public KotshiMyselfJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(UserStatus.class);
    adapter1 = moshi.adapter(Types.newParameterizedType(List.class, Email.class));
  }

  @Override
  public void toJson(JsonWriter writer, Myself value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("_id");
    writer.value(value.getId());
    writer.name("username");
    writer.value(value.getUsername());
    writer.name("name");
    writer.value(value.getName());
    writer.name("status");
    adapter0.toJson(writer, value.getStatus());
    writer.name("statusConnection");
    adapter0.toJson(writer, value.getStatusConnection());
    writer.name("utcOffset");
    writer.value(value.getUtcOffset());
    writer.name("active");
    writer.value(value.getActive());
    writer.name("emails");
    adapter1.toJson(writer, value.getEmails());

    writer.endObject();
  }

  @Override
  public Myself fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String id = null;
    String username = null;
    String name = null;
    UserStatus status = null;
    UserStatus statusConnection = null;
    Float utcOffset = null;
    boolean activeIsSet = false;
    boolean active = false;
    List<Email> emails = null;
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
            username = reader.nextString();
          }
          continue;
        }
        case 2: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            name = reader.nextString();
          }
          continue;
        }
        case 3: {
          status = adapter0.fromJson(reader);
          continue;
        }
        case 4: {
          statusConnection = adapter0.fromJson(reader);
          continue;
        }
        case 5: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            utcOffset = KotshiUtils.nextFloat(reader);
          }
          continue;
        }
        case 6: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            active = reader.nextBoolean();
            activeIsSet = true;
          }
          continue;
        }
        case 7: {
          emails = adapter1.fromJson(reader);
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
    if (!activeIsSet) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "active");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new Myself(
        id,
        username,
        name,
        status,
        statusConnection,
        utcOffset,
        active,
        emails);
  }
}
