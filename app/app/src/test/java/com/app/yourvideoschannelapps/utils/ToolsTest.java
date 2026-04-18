package com.app.yourvideoschannelapps.utils;

import org.junit.Test;
import static org.junit.Assert.*;

public class ToolsTest {

    @Test
    public void testTimeStringtoMilis_validDate() {
        // "2023-01-01 12:00:00" in milliseconds since epoch (assuming UTC or system default)
        // Since SimpleDateFormat uses the system default timezone, the exact millis might vary depending on the environment.
        // But we can at least test if it returns a non-zero value.
        long millis = Tools.timeStringtoMilis("2023-01-01 12:00:00");
        assertTrue("Millis should be greater than 0 for a valid date", millis > 0);
    }

    @Test
    public void testTimeStringtoMilis_invalidDate_returnsZero() {
        long millis = Tools.timeStringtoMilis("invalid-date");
        assertEquals("Millis should be 0 for an invalid date string", 0, millis);
    }

    @Test
    public void testTimeStringtoMilis_emptyString_returnsZero() {
        long millis = Tools.timeStringtoMilis("");
        assertEquals("Millis should be 0 for an empty string", 0, millis);
    }

    @Test
    public void testTimeStringtoMilis_nullString_returnsZero() {
        long millis = Tools.timeStringtoMilis(null);
        assertEquals("Millis should be 0 for a null string", 0, millis);
    }
}
