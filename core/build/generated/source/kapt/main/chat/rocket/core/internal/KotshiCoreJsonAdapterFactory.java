package chat.rocket.core.internal;

import chat.rocket.core.internal.model.CasLoginPayload;
import chat.rocket.core.internal.model.ChatRoomJoinPayload;
import chat.rocket.core.internal.model.ChatRoomPayload;
import chat.rocket.core.internal.model.CommandPayload;
import chat.rocket.core.internal.model.Data;
import chat.rocket.core.internal.model.DeletePayload;
import chat.rocket.core.internal.model.EmailLoginPayload;
import chat.rocket.core.internal.model.KotshiCasLoginPayloadJsonAdapter;
import chat.rocket.core.internal.model.KotshiChatRoomJoinPayloadJsonAdapter;
import chat.rocket.core.internal.model.KotshiChatRoomPayloadJsonAdapter;
import chat.rocket.core.internal.model.KotshiCommandPayloadJsonAdapter;
import chat.rocket.core.internal.model.KotshiDataJsonAdapter;
import chat.rocket.core.internal.model.KotshiDeletePayloadJsonAdapter;
import chat.rocket.core.internal.model.KotshiEmailLoginPayloadJsonAdapter;
import chat.rocket.core.internal.model.KotshiLdapLoginPayloadJsonAdapter;
import chat.rocket.core.internal.model.KotshiMessagePayloadJsonAdapter;
import chat.rocket.core.internal.model.KotshiPushRegistrationPayloadJsonAdapter;
import chat.rocket.core.internal.model.KotshiPushUnregistrationPayloadJsonAdapter;
import chat.rocket.core.internal.model.KotshiReactionPayloadJsonAdapter;
import chat.rocket.core.internal.model.KotshiSamlLoginPayloadJsonAdapter;
import chat.rocket.core.internal.model.KotshiSignUpPayloadJsonAdapter;
import chat.rocket.core.internal.model.KotshiSocketMessageJsonAdapter;
import chat.rocket.core.internal.model.KotshiSocketTokenJsonAdapter;
import chat.rocket.core.internal.model.KotshiSubscriptionJsonAdapter;
import chat.rocket.core.internal.model.KotshiTypedResponseJsonAdapter;
import chat.rocket.core.internal.model.KotshiUserPayloadDataJsonAdapter;
import chat.rocket.core.internal.model.KotshiUserPayloadJsonAdapter;
import chat.rocket.core.internal.model.KotshiUsernameLoginPayloadJsonAdapter;
import chat.rocket.core.internal.model.LdapLoginPayload;
import chat.rocket.core.internal.model.MessagePayload;
import chat.rocket.core.internal.model.PushRegistrationPayload;
import chat.rocket.core.internal.model.PushUnregistrationPayload;
import chat.rocket.core.internal.model.ReactionPayload;
import chat.rocket.core.internal.model.SamlLoginPayload;
import chat.rocket.core.internal.model.SignUpPayload;
import chat.rocket.core.internal.model.SocketMessage;
import chat.rocket.core.internal.model.SocketToken;
import chat.rocket.core.internal.model.Subscription;
import chat.rocket.core.internal.model.TypedResponse;
import chat.rocket.core.internal.model.UserPayload;
import chat.rocket.core.internal.model.UserPayloadData;
import chat.rocket.core.internal.model.UsernameLoginPayload;
import chat.rocket.core.internal.rest.ConfigurationsPayload;
import chat.rocket.core.internal.rest.KotshiConfigurationsPayloadJsonAdapter;
import chat.rocket.core.model.Command;
import chat.rocket.core.model.DeleteResult;
import chat.rocket.core.model.Email;
import chat.rocket.core.model.KotshiCommandJsonAdapter;
import chat.rocket.core.model.KotshiDeleteResultJsonAdapter;
import chat.rocket.core.model.KotshiEmailJsonAdapter;
import chat.rocket.core.model.KotshiMessageJsonAdapter;
import chat.rocket.core.model.KotshiMyselfJsonAdapter;
import chat.rocket.core.model.KotshiPagedResultJsonAdapter;
import chat.rocket.core.model.KotshiPermissionJsonAdapter;
import chat.rocket.core.model.KotshiPushTokenJsonAdapter;
import chat.rocket.core.model.KotshiRoomJsonAdapter;
import chat.rocket.core.model.KotshiSpotlightResultJsonAdapter;
import chat.rocket.core.model.KotshiUserRoleJsonAdapter;
import chat.rocket.core.model.KotshiValueJsonAdapter;
import chat.rocket.core.model.Message;
import chat.rocket.core.model.Myself;
import chat.rocket.core.model.PagedResult;
import chat.rocket.core.model.Permission;
import chat.rocket.core.model.PushToken;
import chat.rocket.core.model.Room;
import chat.rocket.core.model.SpotlightResult;
import chat.rocket.core.model.UserRole;
import chat.rocket.core.model.Value;
import chat.rocket.core.model.url.KotshiMetaJsonAdapter;
import chat.rocket.core.model.url.KotshiParsedUrlJsonAdapter;
import chat.rocket.core.model.url.KotshiUrlJsonAdapter;
import chat.rocket.core.model.url.Meta;
import chat.rocket.core.model.url.ParsedUrl;
import chat.rocket.core.model.url.Url;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Override;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;

final class KotshiCoreJsonAdapterFactory extends CoreJsonAdapterFactory {
  @Override
  public JsonAdapter<?> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
    if (!annotations.isEmpty()) return null;

    if (type instanceof ParameterizedType) {
      ParameterizedType parameterized = (ParameterizedType) type;
      Type rawType = parameterized.getRawType();
      if (rawType.equals(TypedResponse.class)) {
        return new KotshiTypedResponseJsonAdapter<>(moshi, parameterized.getActualTypeArguments());
      }
      if (rawType.equals(PagedResult.class)) {
        return new KotshiPagedResultJsonAdapter<>(moshi, parameterized.getActualTypeArguments());
      }
      if (rawType.equals(Value.class)) {
        return new KotshiValueJsonAdapter<>(moshi, parameterized.getActualTypeArguments());
      }
    }
    if (type.equals(CasLoginPayload.class)) {
      return new KotshiCasLoginPayloadJsonAdapter(moshi);
    }
    if (type.equals(DeletePayload.class)) {
      return new KotshiDeletePayloadJsonAdapter();
    }
    if (type.equals(MessagePayload.class)) {
      return new KotshiMessagePayloadJsonAdapter(moshi);
    }
    if (type.equals(SocketToken.class)) {
      return new KotshiSocketTokenJsonAdapter(moshi);
    }
    if (type.equals(SocketMessage.class)) {
      return new KotshiSocketMessageJsonAdapter(moshi);
    }
    if (type.equals(UserPayloadData.class)) {
      return new KotshiUserPayloadDataJsonAdapter();
    }
    if (type.equals(Data.class)) {
      return new KotshiDataJsonAdapter();
    }
    if (type.equals(ReactionPayload.class)) {
      return new KotshiReactionPayloadJsonAdapter();
    }
    if (type.equals(ChatRoomJoinPayload.class)) {
      return new KotshiChatRoomJoinPayloadJsonAdapter();
    }
    if (type.equals(ChatRoomPayload.class)) {
      return new KotshiChatRoomPayloadJsonAdapter();
    }
    if (type.equals(CommandPayload.class)) {
      return new KotshiCommandPayloadJsonAdapter();
    }
    if (type.equals(PushRegistrationPayload.class)) {
      return new KotshiPushRegistrationPayloadJsonAdapter();
    }
    if (type.equals(UserPayload.class)) {
      return new KotshiUserPayloadJsonAdapter(moshi);
    }
    if (type.equals(SignUpPayload.class)) {
      return new KotshiSignUpPayloadJsonAdapter();
    }
    if (type.equals(EmailLoginPayload.class)) {
      return new KotshiEmailLoginPayloadJsonAdapter();
    }
    if (type.equals(Subscription.class)) {
      return new KotshiSubscriptionJsonAdapter(moshi);
    }
    if (type.equals(PushUnregistrationPayload.class)) {
      return new KotshiPushUnregistrationPayloadJsonAdapter();
    }
    if (type.equals(LdapLoginPayload.class)) {
      return new KotshiLdapLoginPayloadJsonAdapter(moshi);
    }
    if (type.equals(SamlLoginPayload.class)) {
      return new KotshiSamlLoginPayloadJsonAdapter();
    }
    if (type.equals(UsernameLoginPayload.class)) {
      return new KotshiUsernameLoginPayloadJsonAdapter();
    }
    if (type.equals(ConfigurationsPayload.class)) {
      return new KotshiConfigurationsPayloadJsonAdapter(moshi);
    }
    if (type.equals(Message.class)) {
      return new KotshiMessageJsonAdapter(moshi);
    }
    if (type.equals(Room.class)) {
      return new KotshiRoomJsonAdapter(moshi);
    }
    if (type.equals(UserRole.class)) {
      return new KotshiUserRoleJsonAdapter(moshi);
    }
    if (type.equals(Myself.class)) {
      return new KotshiMyselfJsonAdapter(moshi);
    }
    if (type.equals(Email.class)) {
      return new KotshiEmailJsonAdapter();
    }
    if (type.equals(Command.class)) {
      return new KotshiCommandJsonAdapter();
    }
    if (type.equals(Meta.class)) {
      return new KotshiMetaJsonAdapter(moshi);
    }
    if (type.equals(Url.class)) {
      return new KotshiUrlJsonAdapter(moshi);
    }
    if (type.equals(ParsedUrl.class)) {
      return new KotshiParsedUrlJsonAdapter();
    }
    if (type.equals(PushToken.class)) {
      return new KotshiPushTokenJsonAdapter(moshi);
    }
    if (type.equals(Permission.class)) {
      return new KotshiPermissionJsonAdapter(moshi);
    }
    if (type.equals(SpotlightResult.class)) {
      return new KotshiSpotlightResultJsonAdapter(moshi);
    }
    if (type.equals(DeleteResult.class)) {
      return new KotshiDeleteResultJsonAdapter();
    }
    return null;
  }
}
