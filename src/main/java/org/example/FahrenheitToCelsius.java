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

    // method to convert Kelvin to Fahrenheit
    public static float kelvinToFahrenheit(float kelvin) {
        return (float) ((kelvin -273.15f) * (9/5) + 32);
    }

    public static void main(String[] args) {
        // testing method fahrenheitToCelsius
        System.out.println(FahrenheitToCelsius.fahrenheitToCelsius(100));
        // testing method kelvinToCelsius
        System.out.println(FahrenheitToCelsius.kelvinToCelsius(100));

        // testing method kelvinToFahrenheit
        System.out.println(FahrenheitToCelsius.kelvinToFahrenheit(100));
    }
}
