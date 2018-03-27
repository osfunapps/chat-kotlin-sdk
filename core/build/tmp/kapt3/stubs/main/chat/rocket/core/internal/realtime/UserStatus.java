package chat.rocket.core.internal.realtime;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\u0004\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lchat/rocket/core/internal/realtime/UserStatus;", "", "()V", "toString", "", "Away", "Busy", "Offline", "Online", "Lchat/rocket/core/internal/realtime/UserStatus$Online;", "Lchat/rocket/core/internal/realtime/UserStatus$Busy;", "Lchat/rocket/core/internal/realtime/UserStatus$Away;", "Lchat/rocket/core/internal/realtime/UserStatus$Offline;", "core"})
public abstract class UserStatus {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    private UserStatus() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/internal/realtime/UserStatus$Online;", "Lchat/rocket/core/internal/realtime/UserStatus;", "()V", "core"})
    @com.squareup.moshi.Json(name = "online")
    public static final class Online extends chat.rocket.core.internal.realtime.UserStatus {
        public static final chat.rocket.core.internal.realtime.UserStatus.Online INSTANCE = null;
        
        private Online() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/internal/realtime/UserStatus$Busy;", "Lchat/rocket/core/internal/realtime/UserStatus;", "()V", "core"})
    @com.squareup.moshi.Json(name = "busy")
    public static final class Busy extends chat.rocket.core.internal.realtime.UserStatus {
        public static final chat.rocket.core.internal.realtime.UserStatus.Busy INSTANCE = null;
        
        private Busy() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/internal/realtime/UserStatus$Away;", "Lchat/rocket/core/internal/realtime/UserStatus;", "()V", "core"})
    @com.squareup.moshi.Json(name = "away")
    public static final class Away extends chat.rocket.core.internal.realtime.UserStatus {
        public static final chat.rocket.core.internal.realtime.UserStatus.Away INSTANCE = null;
        
        private Away() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/internal/realtime/UserStatus$Offline;", "Lchat/rocket/core/internal/realtime/UserStatus;", "()V", "core"})
    @com.squareup.moshi.Json(name = "offline")
    public static final class Offline extends chat.rocket.core.internal.realtime.UserStatus {
        public static final chat.rocket.core.internal.realtime.UserStatus.Offline INSTANCE = null;
        
        private Offline() {
            super();
        }
    }
}