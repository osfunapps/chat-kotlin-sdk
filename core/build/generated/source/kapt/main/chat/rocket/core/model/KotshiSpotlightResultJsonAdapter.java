package chat.rocket.core.model;

import chat.rocket.common.model.User;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.StringBuilder;
import java.util.List;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiSpotlightResultJsonAdapter extends JsonAdapter<SpotlightResult> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "users",
      "rooms");

  private final JsonAdapter<List<User>> adapter0;

  private final JsonAdapter<List<Room>> adapter1;

  public KotshiSpotlightResultJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(Types.newParameterizedType(List.class, User.class));
    adapter1 = moshi.adapter(Types.newParameterizedType(List.class, Room.class));
  }

  @Override
  public void toJson(JsonWriter writer, SpotlightResult value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("users");
    adapter0.toJson(writer, value.getUsers());
    writer.name("rooms");
    adapter1.toJson(writer, value.getRooms());

    writer.endObject();
  }

  @Override
  public SpotlightResult fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    List<User> users = null;
    List<Room> rooms = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          users = adapter0.fromJson(reader);
          continue;
        }
        case 1: {
          rooms = adapter1.fromJson(reader);
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
    if (users == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "users");
    }
    if (rooms == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "rooms");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new SpotlightResult(
        users,
        rooms);
  }
}
