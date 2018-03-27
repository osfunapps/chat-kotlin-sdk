package chat.rocket.core.internal.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiReactionPayloadJsonAdapter extends JsonAdapter<ReactionPayload> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "messageId",
      "emoji");

  @Override
  public void toJson(JsonWriter writer, ReactionPayload value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("messageId");
    writer.value(value.getMessageId());
    writer.name("emoji");
    writer.value(value.getEmoji());

    writer.endObject();
  }

  @Override
  public ReactionPayload fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String messageId = null;
    String emoji = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            messageId = reader.nextString();
          }
          continue;
        }
        case 1: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            emoji = reader.nextString();
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
    if (messageId == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "messageId");
    }
    if (emoji == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "emoji");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new ReactionPayload(
        messageId,
        emoji);
  }
}
