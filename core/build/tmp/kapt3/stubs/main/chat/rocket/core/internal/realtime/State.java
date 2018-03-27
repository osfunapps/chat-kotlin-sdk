package chat.rocket.core.internal.realtime;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lchat/rocket/core/internal/realtime/State;", "", "()V", "Authenticating", "Connected", "Connecting", "Created", "Disconnected", "Disconnecting", "Waiting", "Lchat/rocket/core/internal/realtime/State$Created;", "Lchat/rocket/core/internal/realtime/State$Waiting;", "Lchat/rocket/core/internal/realtime/State$Connecting;", "Lchat/rocket/core/internal/realtime/State$Authenticating;", "Lchat/rocket/core/internal/realtime/State$Connected;", "Lchat/rocket/core/internal/realtime/State$Disconnecting;", "Lchat/rocket/core/internal/realtime/State$Disconnected;", "core"})
public abstract class State {
    
    private State() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/internal/realtime/State$Created;", "Lchat/rocket/core/internal/realtime/State;", "()V", "core"})
    public static final class Created extends chat.rocket.core.internal.realtime.State {
        
        public Created() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lchat/rocket/core/internal/realtime/State$Waiting;", "Lchat/rocket/core/internal/realtime/State;", "seconds", "", "(I)V", "getSeconds", "()I", "core"})
    public static final class Waiting extends chat.rocket.core.internal.realtime.State {
        private final int seconds = 0;
        
        public final int getSeconds() {
            return 0;
        }
        
        public Waiting(int seconds) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/internal/realtime/State$Connecting;", "Lchat/rocket/core/internal/realtime/State;", "()V", "core"})
    public static final class Connecting extends chat.rocket.core.internal.realtime.State {
        
        public Connecting() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/internal/realtime/State$Authenticating;", "Lchat/rocket/core/internal/realtime/State;", "()V", "core"})
    public static final class Authenticating extends chat.rocket.core.internal.realtime.State {
        
        public Authenticating() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/internal/realtime/State$Connected;", "Lchat/rocket/core/internal/realtime/State;", "()V", "core"})
    public static final class Connected extends chat.rocket.core.internal.realtime.State {
        
        public Connected() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/internal/realtime/State$Disconnecting;", "Lchat/rocket/core/internal/realtime/State;", "()V", "core"})
    public static final class Disconnecting extends chat.rocket.core.internal.realtime.State {
        
        public Disconnecting() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lchat/rocket/core/internal/realtime/State$Disconnected;", "Lchat/rocket/core/internal/realtime/State;", "()V", "core"})
    public static final class Disconnected extends chat.rocket.core.internal.realtime.State {
        
        public Disconnected() {
            super();
        }
    }
}