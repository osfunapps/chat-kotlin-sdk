package chat.rocket.common.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\u0005\u000b\f\r\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Lchat/rocket/common/model/RoomType;", "", "()V", "toString", "", "Channel", "Companion", "Custom", "DirectMessage", "Livechat", "PrivateGroup", "Lchat/rocket/common/model/RoomType$Channel;", "Lchat/rocket/common/model/RoomType$PrivateGroup;", "Lchat/rocket/common/model/RoomType$DirectMessage;", "Lchat/rocket/common/model/RoomType$Livechat;", "Lchat/rocket/common/model/RoomType$Custom;", "common"})
@chat.rocket.common.internal.FallbackSealedClass(name = "Custom", fieldName = "rawType")
public abstract class RoomType {
    @org.jetbrains.annotations.NotNull()
    private static final chat.rocket.common.model.RoomType.Channel CHANNEL = null;
    @org.jetbrains.annotations.NotNull()
    private static final chat.rocket.common.model.RoomType.PrivateGroup PRIVATE_GROUP = null;
    @org.jetbrains.annotations.NotNull()
    private static final chat.rocket.common.model.RoomType.DirectMessage DIRECT_MESSAGE = null;
    @org.jetbrains.annotations.NotNull()
    private static final chat.rocket.common.model.RoomType.Livechat LIVECHAT = null;
    public static final chat.rocket.common.model.RoomType.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    private RoomType() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/common/model/RoomType$Channel;", "Lchat/rocket/common/model/RoomType;", "()V", "common"})
    @com.squareup.moshi.Json(name = "c")
    public static final class Channel extends chat.rocket.common.model.RoomType {
        
        public Channel() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/common/model/RoomType$PrivateGroup;", "Lchat/rocket/common/model/RoomType;", "()V", "common"})
    @com.squareup.moshi.Json(name = "p")
    public static final class PrivateGroup extends chat.rocket.common.model.RoomType {
        
        public PrivateGroup() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/common/model/RoomType$DirectMessage;", "Lchat/rocket/common/model/RoomType;", "()V", "common"})
    @com.squareup.moshi.Json(name = "d")
    public static final class DirectMessage extends chat.rocket.common.model.RoomType {
        
        public DirectMessage() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/common/model/RoomType$Livechat;", "Lchat/rocket/common/model/RoomType;", "()V", "common"})
    @com.squareup.moshi.Json(name = "l")
    public static final class Livechat extends chat.rocket.common.model.RoomType {
        
        public Livechat() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lchat/rocket/common/model/RoomType$Custom;", "Lchat/rocket/common/model/RoomType;", "rawType", "", "(Ljava/lang/String;)V", "getRawType", "()Ljava/lang/String;", "common"})
    public static final class Custom extends chat.rocket.common.model.RoomType {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String rawType = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRawType() {
            return null;
        }
        
        public Custom(@org.jetbrains.annotations.NotNull()
        java.lang.String rawType) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lchat/rocket/common/model/RoomType$Companion;", "", "()V", "CHANNEL", "Lchat/rocket/common/model/RoomType$Channel;", "getCHANNEL", "()Lchat/rocket/common/model/RoomType$Channel;", "DIRECT_MESSAGE", "Lchat/rocket/common/model/RoomType$DirectMessage;", "getDIRECT_MESSAGE", "()Lchat/rocket/common/model/RoomType$DirectMessage;", "LIVECHAT", "Lchat/rocket/common/model/RoomType$Livechat;", "getLIVECHAT", "()Lchat/rocket/common/model/RoomType$Livechat;", "PRIVATE_GROUP", "Lchat/rocket/common/model/RoomType$PrivateGroup;", "getPRIVATE_GROUP", "()Lchat/rocket/common/model/RoomType$PrivateGroup;", "common"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final chat.rocket.common.model.RoomType.Channel getCHANNEL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final chat.rocket.common.model.RoomType.PrivateGroup getPRIVATE_GROUP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final chat.rocket.common.model.RoomType.DirectMessage getDIRECT_MESSAGE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final chat.rocket.common.model.RoomType.Livechat getLIVECHAT() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}