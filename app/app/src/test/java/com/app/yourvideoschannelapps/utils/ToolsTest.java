package com.app.yourvideoschannelapps.utils;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ToolsTest {

    @Test
    public void testWithSuffix() {
        // Less than 1000
        assertEquals("0", Tools.withSuffix(0));
        assertEquals("999", Tools.withSuffix(999));

        // Thousands (K)
        assertEquals("1.0K", Tools.withSuffix(1000));
        assertEquals("1.5K", Tools.withSuffix(1500));
        assertEquals("999.9K", Tools.withSuffix(999900));

        // Millions (M)
        assertEquals("1.0M", Tools.withSuffix(1000000));
        assertEquals("1.5M", Tools.withSuffix(1500000));
        assertEquals("999.9M", Tools.withSuffix(999900000));

        // Billions (G)
        assertEquals("1.0G", Tools.withSuffix(1000000000L));
        assertEquals("1.5G", Tools.withSuffix(1500000000L));

        // Trillions (T)
        assertEquals("1.0T", Tools.withSuffix(1000000000000L));

        // Quadrillions (P)
        assertEquals("1.0P", Tools.withSuffix(1000000000000000L));

        // Quintillions (E)
        assertEquals("1.0E", Tools.withSuffix(1000000000000000000L));

        // Edge cases - negative numbers
        assertEquals("-1", Tools.withSuffix(-1));
        assertEquals("-1000", Tools.withSuffix(-1000));
    }
}
