package chat.rocket.core.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lchat/rocket/core/model/MessageType;", "", "()V", "MessagePinned", "MessageRemoved", "RoomNameChanged", "Unspecified", "UserAdded", "UserJoined", "UserLeft", "UserRemoved", "Welcome", "Lchat/rocket/core/model/MessageType$RoomNameChanged;", "Lchat/rocket/core/model/MessageType$UserAdded;", "Lchat/rocket/core/model/MessageType$UserRemoved;", "Lchat/rocket/core/model/MessageType$UserJoined;", "Lchat/rocket/core/model/MessageType$UserLeft;", "Lchat/rocket/core/model/MessageType$Welcome;", "Lchat/rocket/core/model/MessageType$MessageRemoved;", "Lchat/rocket/core/model/MessageType$MessagePinned;", "Lchat/rocket/core/model/MessageType$Unspecified;", "core"})
@chat.rocket.common.internal.FallbackSealedClass(name = "Unspecified", fieldName = "rawType")
public abstract class MessageType {
    
    private MessageType() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/model/MessageType$RoomNameChanged;", "Lchat/rocket/core/model/MessageType;", "()V", "core"})
    @com.squareup.moshi.Json(name = "r")
    public static final class RoomNameChanged extends chat.rocket.core.model.MessageType {
        
        public RoomNameChanged() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/model/MessageType$UserAdded;", "Lchat/rocket/core/model/MessageType;", "()V", "core"})
    @com.squareup.moshi.Json(name = "au")
    public static final class UserAdded extends chat.rocket.core.model.MessageType {
        
        public UserAdded() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/model/MessageType$UserRemoved;", "Lchat/rocket/core/model/MessageType;", "()V", "core"})
    @com.squareup.moshi.Json(name = "ru")
    public static final class UserRemoved extends chat.rocket.core.model.MessageType {
        
        public UserRemoved() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/model/MessageType$UserJoined;", "Lchat/rocket/core/model/MessageType;", "()V", "core"})
    @com.squareup.moshi.Json(name = "uj")
    public static final class UserJoined extends chat.rocket.core.model.MessageType {
        
        public UserJoined() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/model/MessageType$UserLeft;", "Lchat/rocket/core/model/MessageType;", "()V", "core"})
    @com.squareup.moshi.Json(name = "ul")
    public static final class UserLeft extends chat.rocket.core.model.MessageType {
        
        public UserLeft() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/model/MessageType$Welcome;", "Lchat/rocket/core/model/MessageType;", "()V", "core"})
    @com.squareup.moshi.Json(name = "wm")
    public static final class Welcome extends chat.rocket.core.model.MessageType {
        
        public Welcome() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/model/MessageType$MessageRemoved;", "Lchat/rocket/core/model/MessageType;", "()V", "core"})
    @com.squareup.moshi.Json(name = "rm")
    public static final class MessageRemoved extends chat.rocket.core.model.MessageType {
        
        public MessageRemoved() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/model/MessageType$MessagePinned;", "Lchat/rocket/core/model/MessageType;", "()V", "core"})
    @com.squareup.moshi.Json(name = "message_pinned")
    public static final class MessagePinned extends chat.rocket.core.model.MessageType {
        
        public MessagePinned() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lchat/rocket/core/model/MessageType$Unspecified;", "Lchat/rocket/core/model/MessageType;", "rawType", "", "(Ljava/lang/String;)V", "getRawType", "()Ljava/lang/String;", "core"})
    public static final class Unspecified extends chat.rocket.core.model.MessageType {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String rawType = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRawType() {
            return null;
        }
        
        public Unspecified(@org.jetbrains.annotations.NotNull()
        java.lang.String rawType) {
            super();
        }
    }
}