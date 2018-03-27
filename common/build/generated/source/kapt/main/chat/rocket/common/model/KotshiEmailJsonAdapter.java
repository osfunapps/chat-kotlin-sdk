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

public final class KotshiEmailJsonAdapter extends JsonAdapter<Email> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "address",
      "verified");

  @Override
  public void toJson(JsonWriter writer, Email value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("address");
    writer.value(value.getAddress());
    writer.name("verified");
    writer.value(value.getVerified());

    writer.endObject();
  }

  @Override
  public Email fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String address = null;
    boolean verified = false;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            address = reader.nextString();
          }
          continue;
        }
        case 1: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            verified = reader.nextBoolean();
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
    if (address == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "address");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new Email(
        address,
        verified);
  }
}
