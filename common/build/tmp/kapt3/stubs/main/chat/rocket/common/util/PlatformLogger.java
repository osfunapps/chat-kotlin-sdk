package chat.rocket.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lchat/rocket/common/util/PlatformLogger;", "", "debug", "", "s", "", "info", "warn", "NoOpLogger", "common"})
public abstract interface PlatformLogger {
    
    public abstract void debug(@org.jetbrains.annotations.NotNull()
    java.lang.String s);
    
    public abstract void info(@org.jetbrains.annotations.NotNull()
    java.lang.String s);
    
    public abstract void warn(@org.jetbrains.annotations.NotNull()
    java.lang.String s);
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\t"}, d2 = {"Lchat/rocket/common/util/PlatformLogger$NoOpLogger;", "Lchat/rocket/common/util/PlatformLogger;", "()V", "debug", "", "s", "", "info", "warn", "common"})
    public static final class NoOpLogger implements chat.rocket.common.util.PlatformLogger {
        
        @java.lang.Override()
        public void debug(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
        }
        
        @java.lang.Override()
        public void info(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
        }
        
        @java.lang.Override()
        public void warn(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
        }
        
        public NoOpLogger() {
            super();
        }
    }
}