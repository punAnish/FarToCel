package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FahrenheitToCelsiusTest {

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(37.77777777777778, FahrenheitToCelsius.fahrenheitToCelsius(100.0), 0.001);
    }

    @Test
    public void testKelvinToCelsius() {
        assertEquals(0.001, FahrenheitToCelsius.kelvinToCelsius(273.15f), 0.001);
    }
}