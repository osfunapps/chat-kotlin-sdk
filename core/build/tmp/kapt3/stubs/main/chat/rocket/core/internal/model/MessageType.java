package chat.rocket.core.internal.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lchat/rocket/core/internal/model/MessageType;", "", "(Ljava/lang/String;I)V", "CONNECTED", "RESULT", "READY", "UNSUBSCRIBED", "UPDATED", "ADDED", "CHANGED", "REMOVED", "PING", "PONG", "ERROR", "core"})
public enum MessageType {
    @com.squareup.moshi.Json(name = "connected")
    /*public static final*/ CONNECTED /* = new CONNECTED() */,
    @com.squareup.moshi.Json(name = "result")
    /*public static final*/ RESULT /* = new RESULT() */,
    @com.squareup.moshi.Json(name = "ready")
    /*public static final*/ READY /* = new READY() */,
    @com.squareup.moshi.Json(name = "nosub")
    /*public static final*/ UNSUBSCRIBED /* = new UNSUBSCRIBED() */,
    @com.squareup.moshi.Json(name = "updated")
    /*public static final*/ UPDATED /* = new UPDATED() */,
    @com.squareup.moshi.Json(name = "added")
    /*public static final*/ ADDED /* = new ADDED() */,
    @com.squareup.moshi.Json(name = "changed")
    /*public static final*/ CHANGED /* = new CHANGED() */,
    @com.squareup.moshi.Json(name = "removed")
    /*public static final*/ REMOVED /* = new REMOVED() */,
    @com.squareup.moshi.Json(name = "ping")
    /*public static final*/ PING /* = new PING() */,
    @com.squareup.moshi.Json(name = "pong")
    /*public static final*/ PONG /* = new PONG() */,
    @com.squareup.moshi.Json(name = "error")
    /*public static final*/ ERROR /* = new ERROR() */;
    
    MessageType() {
    }
}