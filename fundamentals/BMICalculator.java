package fundamentals;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (meters): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("\n--- Result ---");
        System.out.println("Name: " + name);
        System.out.printf("BMI: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Category: Overweight");
        } else if (bmi < 35) {
            System.out.println("Category: Obesity Class I");
        } else if (bmi < 40) {
            System.out.println("Category: Obesity Class II");
        } else {
            System.out.println("Category: Obesity Class III");
        }

        scanner.close();
    }
}