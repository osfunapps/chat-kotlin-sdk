package chat.rocket.core.internal.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiSocketMessageJsonAdapter extends JsonAdapter<SocketMessage> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "msg",
      "id",
      "collection",
      "reason");

  private final JsonAdapter<MessageType> adapter0;

  public KotshiSocketMessageJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(MessageType.class);
  }

  @Override
  public void toJson(JsonWriter writer, SocketMessage value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("msg");
    adapter0.toJson(writer, value.getType());
    writer.name("id");
    writer.value(value.getId());
    writer.name("collection");
    writer.value(value.getCollection());
    writer.name("reason");
    writer.value(value.getErrorReason());

    writer.endObject();
  }

  @Override
  public SocketMessage fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    MessageType type = null;
    String id = null;
    String collection = null;
    String errorReason = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          type = adapter0.fromJson(reader);
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
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            collection = reader.nextString();
          }
          continue;
        }
        case 3: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            errorReason = reader.nextString();
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
    if (type == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "type");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new SocketMessage(
        type,
        id,
        collection,
        errorReason);
  }
}
