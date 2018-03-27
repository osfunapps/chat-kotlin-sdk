package chat.rocket.core.internal.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;

public final class KotshiUserPayloadJsonAdapter extends JsonAdapter<UserPayload> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "userId",
      "data",
      "avatarUrl");

  private final JsonAdapter<UserPayloadData> adapter0;

  public KotshiUserPayloadJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(UserPayloadData.class);
  }

  @Override
  public void toJson(JsonWriter writer, UserPayload value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("userId");
    writer.value(value.getUserId());
    writer.name("data");
    adapter0.toJson(writer, value.getData());
    writer.name("avatarUrl");
    writer.value(value.getAvatarUrl());

    writer.endObject();
  }

  @Override
  public UserPayload fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String userId = null;
    UserPayloadData data = null;
    String avatarUrl = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            userId = reader.nextString();
          }
          continue;
        }
        case 1: {
          data = adapter0.fromJson(reader);
          continue;
        }
        case 2: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            avatarUrl = reader.nextString();
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
    return new UserPayload(
        userId,
        data,
        avatarUrl);
  }
}
