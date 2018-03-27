package chat.rocket.core.internal.model;

import chat.rocket.common.internal.ISO8601Date;
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

public final class KotshiSocketTokenJsonAdapter extends JsonAdapter<SocketToken> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "id",
      "token",
      "tokenExpires");

  private final JsonAdapter<Long> adapter0;

  public KotshiSocketTokenJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(Long.class, ISO8601Date.class);
  }

  @Override
  public void toJson(JsonWriter writer, SocketToken value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("id");
    writer.value(value.getUserId());
    writer.name("token");
    writer.value(value.getAuthToken());
    writer.name("tokenExpires");
    adapter0.toJson(writer, value.getExpiresAt());

    writer.endObject();
  }

  @Override
  public SocketToken fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String userId = null;
    String authToken = null;
    Long expiresAt = null;
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
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            authToken = reader.nextString();
          }
          continue;
        }
        case 2: {
          expiresAt = adapter0.fromJson(reader);
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
    if (userId == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "userId");
    }
    if (authToken == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "authToken");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new SocketToken(
        userId,
        authToken,
        expiresAt);
  }
}
