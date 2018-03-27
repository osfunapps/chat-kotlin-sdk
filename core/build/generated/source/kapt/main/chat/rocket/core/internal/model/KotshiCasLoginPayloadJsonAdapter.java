package chat.rocket.core.internal.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.StringBuilder;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiCasLoginPayloadJsonAdapter extends JsonAdapter<CasLoginPayload> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "cas");

  private final JsonAdapter<Data> adapter0;

  public KotshiCasLoginPayloadJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(Data.class);
  }

  @Override
  public void toJson(JsonWriter writer, CasLoginPayload value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("cas");
    adapter0.toJson(writer, value.getCas());

    writer.endObject();
  }

  @Override
  public CasLoginPayload fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    Data cas = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          cas = adapter0.fromJson(reader);
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
    if (cas == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "cas");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new CasLoginPayload(
        cas);
  }
}
