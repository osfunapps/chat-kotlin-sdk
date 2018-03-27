package chat.rocket.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eJ\u0016\u0010\u0010\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lchat/rocket/common/util/Logger;", "", "platformLogger", "Lchat/rocket/common/util/PlatformLogger;", "(Lchat/rocket/common/util/PlatformLogger;)V", "enabled", "", "getEnabled", "()Z", "getPlatformLogger", "()Lchat/rocket/common/util/PlatformLogger;", "debug", "", "msg", "Lkotlin/Function0;", "info", "warn", "common"})
public final class Logger {
    private final boolean enabled = true;
    @org.jetbrains.annotations.NotNull()
    private final chat.rocket.common.util.PlatformLogger platformLogger = null;
    
    public final boolean getEnabled() {
        return false;
    }
    
    public final void debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.lang.Object> msg) {
    }
    
    public final void info(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.lang.Object> msg) {
    }
    
    public final void warn(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.lang.Object> msg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final chat.rocket.common.util.PlatformLogger getPlatformLogger() {
        return null;
    }
    
    public Logger(@org.jetbrains.annotations.NotNull()
    chat.rocket.common.util.PlatformLogger platformLogger) {
        super();
    }
}