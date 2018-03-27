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

public final class KotshiLdapLoginPayloadJsonAdapter extends JsonAdapter<LdapLoginPayload> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "ldap",
      "username",
      "ldapPass",
      "ldapOptions");

  private final JsonAdapter<String[]> adapter0;

  public KotshiLdapLoginPayloadJsonAdapter(Moshi moshi) {
    adapter0 = moshi.adapter(String[].class);
  }

  @Override
  public void toJson(JsonWriter writer, LdapLoginPayload value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("ldap");
    writer.value(value.getLdap());
    writer.name("username");
    writer.value(value.getUsername());
    writer.name("ldapPass");
    writer.value(value.getLdapPass());
    writer.name("ldapOptions");
    adapter0.toJson(writer, value.getLdapOptions());

    writer.endObject();
  }

  @Override
  public LdapLoginPayload fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    boolean ldapIsSet = false;
    boolean ldap = false;
    String username = null;
    String ldapPass = null;
    String[] ldapOptions = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            ldap = reader.nextBoolean();
            ldapIsSet = true;
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
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            ldapPass = reader.nextString();
          }
          continue;
        }
        case 3: {
          ldapOptions = adapter0.fromJson(reader);
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
    if (!ldapIsSet) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "ldap");
    }
    if (username == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "username");
    }
    if (ldapPass == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "ldapPass");
    }
    if (ldapOptions == null) {
      stringBuilder = KotshiUtils.appendNullableError(stringBuilder, "ldapOptions");
    }
    if (stringBuilder != null) {
      throw new NullPointerException(stringBuilder.toString());
    }

    return new LdapLoginPayload(
        ldap,
        username,
        ldapPass,
        ldapOptions);
  }
}
