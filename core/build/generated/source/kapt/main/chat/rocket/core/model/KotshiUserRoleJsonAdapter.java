package chat.rocket.core.model;

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

public final class KotshiUserRoleJsonAdapter extends JsonAdapter<UserRole> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "_id",
      "username",
      "roles");

  private final JsonAdapter<List<String>> adapter0;

  public KotshiUserRoleJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(Types.newParameterizedType(List.class, String.class));
  }

  @Override
  public void toJson(JsonWriter writer, UserRole value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("_id");
    writer.value(value.getId());
    writer.name("username");
    writer.value(value.getUsername());
    writer.name("roles");
    adapter0.toJson(writer, value.getRoles());

    writer.endObject();
  }

  @Override
  public UserRole fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String id = null;
    String username = null;
    List<String> roles = null;
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
          roles = adapter0.fromJson(reader);
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
    if (username == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "username");
    }
    if (roles == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "roles");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new UserRole(
        id,
        username,
        roles);
  }
}
