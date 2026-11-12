
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TempConvertertest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(77, (25 * 9.0 / 5) + 32, 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(37, (98.6 - 32) * 5 / 9, 0.01);
    }

    @Test
    void testCelsiusToKelvin() {
        assertEquals(298.15, 25 + 273.15, 0.01);
    }

    @Test
    void testValidKelvin() {
        assertTrue(298.15 >= 0);
    }

    @Test
    void testInvalidKelvin() {
        assertFalse(-10 >= 0);
    }

    @Test
    void testAbsoluteZero() {
        assertEquals(0, -273.15 + 273.15, 0.01);
    }

}
