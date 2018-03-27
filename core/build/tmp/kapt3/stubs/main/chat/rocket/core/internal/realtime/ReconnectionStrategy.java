package chat.rocket.core.internal.realtime;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lchat/rocket/core/internal/realtime/ReconnectionStrategy;", "", "maxAttempts", "", "interval", "(II)V", "getMaxAttempts", "()I", "numberOfAttempts", "getNumberOfAttempts", "setNumberOfAttempts", "(I)V", "reconnectInterval", "getReconnectInterval", "processAttempts", "", "core"})
public class ReconnectionStrategy {
    private int numberOfAttempts;
    private final int maxAttempts = 0;
    private final int interval = 0;
    
    public final int getNumberOfAttempts() {
        return 0;
    }
    
    public final void setNumberOfAttempts(int p0) {
    }
    
    public final void processAttempts() {
    }
    
    public final int getReconnectInterval() {
        return 0;
    }
    
    public final int getMaxAttempts() {
        return 0;
    }
    
    public ReconnectionStrategy(int maxAttempts, int interval) {
        super();
    }
}