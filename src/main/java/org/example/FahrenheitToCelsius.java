package org.example;

public class FahrenheitToCelsius {
    // method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // method to convert Kelvin to Celsius

    public static float kelvinToCelsius(float kelvin) {
        return (float) (kelvin - 273.15f);
    }
}
