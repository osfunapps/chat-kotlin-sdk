package chat.rocket.core.internal.rest;

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
import java.util.Map;
import se.ansman.kotshi.KotshiUtils;

public final class KotshiConfigurationsPayloadJsonAdapter extends JsonAdapter<ConfigurationsPayload> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "configurations");

  private final JsonAdapter<List<Map<String, String>>> adapter0;

  public KotshiConfigurationsPayloadJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(Types.newParameterizedType(List.class, Types.newParameterizedType(Map.class, String.class, String.class)));
  }

  @Override
  public void toJson(JsonWriter writer, ConfigurationsPayload value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("configurations");
    adapter0.toJson(writer, value.getConfigurations());

    writer.endObject();
  }

  @Override
  public ConfigurationsPayload fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    List<Map<String, String>> configurations = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          configurations = adapter0.fromJson(reader);
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
    if (configurations == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "configurations");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new ConfigurationsPayload(
        configurations);
  }
}
