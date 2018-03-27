package chat.rocket.common.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lchat/rocket/common/model/UserStatus;", "", "()V", "Away", "Busy", "Offline", "Online", "Unknown", "Lchat/rocket/common/model/UserStatus$Online;", "Lchat/rocket/common/model/UserStatus$Busy;", "Lchat/rocket/common/model/UserStatus$Away;", "Lchat/rocket/common/model/UserStatus$Offline;", "Lchat/rocket/common/model/UserStatus$Unknown;", "common"})
@chat.rocket.common.internal.FallbackSealedClass(name = "Unknown", fieldName = "rawStatus")
public abstract class UserStatus {
    
    private UserStatus() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/common/model/UserStatus$Online;", "Lchat/rocket/common/model/UserStatus;", "()V", "common"})
    @com.squareup.moshi.Json(name = "online")
    public static final class Online extends chat.rocket.common.model.UserStatus {
        
        public Online() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/common/model/UserStatus$Busy;", "Lchat/rocket/common/model/UserStatus;", "()V", "common"})
    @com.squareup.moshi.Json(name = "busy")
    public static final class Busy extends chat.rocket.common.model.UserStatus {
        
        public Busy() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/common/model/UserStatus$Away;", "Lchat/rocket/common/model/UserStatus;", "()V", "common"})
    @com.squareup.moshi.Json(name = "away")
    public static final class Away extends chat.rocket.common.model.UserStatus {
        
        public Away() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/common/model/UserStatus$Offline;", "Lchat/rocket/common/model/UserStatus;", "()V", "common"})
    @com.squareup.moshi.Json(name = "offline")
    public static final class Offline extends chat.rocket.common.model.UserStatus {
        
        public Offline() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lchat/rocket/common/model/UserStatus$Unknown;", "Lchat/rocket/common/model/UserStatus;", "rawStatus", "", "(Ljava/lang/String;)V", "getRawStatus", "()Ljava/lang/String;", "common"})
    public static final class Unknown extends chat.rocket.common.model.UserStatus {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String rawStatus = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRawStatus() {
            return null;
        }
        
        public Unknown(@org.jetbrains.annotations.NotNull()
        java.lang.String rawStatus) {
            super();
        }
    }
}