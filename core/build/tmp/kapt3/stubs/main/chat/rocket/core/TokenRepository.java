package chat.rocket.core;

import java.lang.System;

/**
 * *
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lchat/rocket/core/TokenRepository;", "", "get", "Lchat/rocket/common/model/Token;", "save", "", "token", "core"})
public abstract interface TokenRepository {
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    chat.rocket.common.model.Token token);
    
    @org.jetbrains.annotations.Nullable()
    public abstract chat.rocket.common.model.Token get();
}