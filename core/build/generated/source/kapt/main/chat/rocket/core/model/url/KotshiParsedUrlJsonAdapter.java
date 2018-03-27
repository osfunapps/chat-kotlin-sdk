package chat.rocket.core.model.url;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;

public final class KotshiParsedUrlJsonAdapter extends JsonAdapter<ParsedUrl> {
  private static final JsonReader.Options OPTIONS = JsonReader.Options.of(
      "host",
      "hash",
      "pathname",
      "protocol",
      "port",
      "search",
      "hostname");

  @Override
  public void toJson(JsonWriter writer, ParsedUrl value) throws IOException {
    if (value == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("host");
    writer.value(value.getHost());
    writer.name("hash");
    writer.value(value.getHash());
    writer.name("pathname");
    writer.value(value.getPathname());
    writer.name("protocol");
    writer.value(value.getProtocol());
    writer.name("port");
    writer.value(value.getPort());
    writer.name("search");
    writer.value(value.getSearch());
    writer.name("hostname");
    writer.value(value.getHostname());

    writer.endObject();
  }

  @Override
  public ParsedUrl fromJson(JsonReader reader) throws IOException {
    if (reader.peek() == JsonReader.Token.NULL) {
      return reader.nextNull();
    }

    reader.beginObject();

    String host = null;
    String hash = null;
    String pathname = null;
    String protocol = null;
    String port = null;
    String search = null;
    String hostname = null;
    while (reader.hasNext()) {
      switch (reader.selectName(OPTIONS)) {
        case 0: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            host = reader.nextString();
          }
          continue;
        }
        case 1: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            hash = reader.nextString();
          }
          continue;
        }
        case 2: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            pathname = reader.nextString();
          }
          continue;
        }
        case 3: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            protocol = reader.nextString();
          }
          continue;
        }
        case 4: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            port = reader.nextString();
          }
          continue;
        }
        case 5: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            search = reader.nextString();
          }
          continue;
        }
        case 6: {
          if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
          } else {
            hostname = reader.nextString();
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
    return new ParsedUrl(
        host,
        hash,
        pathname,
        protocol,
        port,
        search,
        hostname);
  }
}
