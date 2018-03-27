package chat.rocket.common;

import chat.rocket.common.internal.AuthenticationErrorMessage;
import chat.rocket.common.internal.ErrorMessage;
import chat.rocket.common.internal.KotshiAuthenticationErrorMessageJsonAdapter;
import chat.rocket.common.internal.KotshiErrorMessageJsonAdapter;
import chat.rocket.common.model.BaseResult;
import chat.rocket.common.model.Email;
import chat.rocket.common.model.KotshiBaseResultJsonAdapter;
import chat.rocket.common.model.KotshiEmailJsonAdapter;
import chat.rocket.common.model.KotshiServerInfoJsonAdapter;
import chat.rocket.common.model.KotshiSimpleRoomJsonAdapter;
import chat.rocket.common.model.KotshiSimpleUserJsonAdapter;
import chat.rocket.common.model.KotshiTokenJsonAdapter;
import chat.rocket.common.model.KotshiUserJsonAdapter;
import chat.rocket.common.model.ServerInfo;
import chat.rocket.common.model.SimpleRoom;
import chat.rocket.common.model.SimpleUser;
import chat.rocket.common.model.Token;
import chat.rocket.common.model.User;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Override;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

final class KotshiCommonJsonAdapterFactory extends CommonJsonAdapterFactory {
  @Override
  public JsonAdapter<?> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
    if (!annotations.isEmpty()) return null;

    if (type.equals(AuthenticationErrorMessage.class)) {
      return new KotshiAuthenticationErrorMessageJsonAdapter();
    }
    if (type.equals(ErrorMessage.class)) {
      return new KotshiErrorMessageJsonAdapter();
    }
    if (type.equals(ServerInfo.class)) {
      return new KotshiServerInfoJsonAdapter();
    }
    if (type.equals(Email.class)) {
      return new KotshiEmailJsonAdapter();
    }
    if (type.equals(BaseResult.class)) {
      return new KotshiBaseResultJsonAdapter();
    }
    if (type.equals(User.class)) {
      return new KotshiUserJsonAdapter(moshi);
    }
    if (type.equals(SimpleUser.class)) {
      return new KotshiSimpleUserJsonAdapter();
    }
    if (type.equals(SimpleRoom.class)) {
      return new KotshiSimpleRoomJsonAdapter();
    }
    if (type.equals(Token.class)) {
      return new KotshiTokenJsonAdapter();
    }
    return null;
  }
}
