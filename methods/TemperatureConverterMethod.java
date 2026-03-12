package methods;

import java.util.Scanner;

public class TemperatureConverterMethod {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1 - Celsius to Fahrenheit");
        System.out.println("2 - Fahrenheit to Celsius");

        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        if (option == 1) {

            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();

            double result = celsiusToFahrenheit(celsius);

            System.out.println("Temperature in Fahrenheit: " + result);

        } else if (option == 2) {

            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            double result = fahrenheitToCelsius(fahrenheit);

            System.out.println("Temperature in Celsius: " + result);

        } else {
            System.out.println("Invalid option");
        }

        scanner.close();
    }
}