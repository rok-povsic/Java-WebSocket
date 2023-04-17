package org.java_websocket.util;

import java.time.Instant;

public class DateTimeUtils {
    public static long currentTimeNanos() {
        Instant now = Instant.now();
        long epochSeconds = now.getEpochSecond();
        int nanoSeconds = now.getNano();
        return (epochSeconds * 1_000_000_000L) + nanoSeconds;
    }
}
