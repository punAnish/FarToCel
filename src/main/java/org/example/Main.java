package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // testing method fahrenheitToCelsius
        System.out.println(FahrenheitToCelsius.fahrenheitToCelsius(100));
        // testing method kelvinToCelsius
        System.out.println(FahrenheitToCelsius.kelvinToCelsius(100));

        // testing method kelvinToFahrenheit
        System.out.println(FahrenheitToCelsius.kelvinToFahrenheit(100));
    }
}
