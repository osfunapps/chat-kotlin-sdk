package chat.rocket.common.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiTokenJsonAdapter extends JsonAdapter<Token> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "userId",
      "authToken");

  @Override
  public void toJson(JsonWriter writer, Token value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("userId");
    writer.value(value.getUserId());
    writer.name("authToken");
    writer.value(value.getAuthToken());

    writer.endObject();
  }

  @Override
  public Token fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String userId = null;
    String authToken = null;
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

    return new Token(
        userId,
        authToken);
  }
}
