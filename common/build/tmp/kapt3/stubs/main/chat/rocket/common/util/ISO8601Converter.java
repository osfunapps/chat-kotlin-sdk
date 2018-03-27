package chat.rocket.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\'\u00a8\u0006\b"}, d2 = {"Lchat/rocket/common/util/ISO8601Converter;", "", "fromTimestamp", "", "timestamp", "", "toTimestamp", "date", "common"})
public abstract interface ISO8601Converter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String fromTimestamp(long timestamp);
    
    public abstract long toTimestamp(@org.jetbrains.annotations.NotNull()
    java.lang.String date) throws java.text.ParseException;
}