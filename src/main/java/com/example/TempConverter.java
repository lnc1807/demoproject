
package com.example;

public class TempConverter {

    public static void main(String[] args) {

        double celsius = 25;

        double fahrenheit = 98.6;

        System.out.println("Celsius to Fahrenheit: " +
            (celsius * 9 / 5 + 32) + " °F");

        System.out.println("Fahrenheit to Celsius: " +
            ((fahrenheit - 32) * 5 / 9) + " °C");

        System.out.println("Celsius to Kelvin: " +
            (celsius + 273.15) + " K");

        double kelvin = celsius + 273.15;

        if (kelvin < 0)
            System.out.println("Invalid Kelvin value");
        else
            System.out.println("Valid Kelvin value");

    }

}
