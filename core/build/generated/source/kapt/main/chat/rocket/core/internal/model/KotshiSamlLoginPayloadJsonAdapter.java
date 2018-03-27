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

public final class KotshiSamlLoginPayloadJsonAdapter extends JsonAdapter<SamlLoginPayload> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "saml",
      "credentialToken");

  @Override
  public void toJson(JsonWriter writer, SamlLoginPayload value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("saml");
    writer.value(value.getSaml());
    writer.name("credentialToken");
    writer.value(value.getCredentialToken());

    writer.endObject();
  }

  @Override
  public SamlLoginPayload fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    boolean samlIsSet = false;
    boolean saml = false;
    String credentialToken = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            saml = reader.nextBoolean();
            samlIsSet = true;
          }
          continue;
        }
        case 1: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            credentialToken = reader.nextString();
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
    if (!samlIsSet) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "saml");
    }
    if (credentialToken == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "credentialToken");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new SamlLoginPayload(
        saml,
        credentialToken);
  }
}
