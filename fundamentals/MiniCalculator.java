package fundamentals;

import java.util.Scanner;

public class MiniCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Mini Calculator ===");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double n1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double n2 = scanner.nextDouble();

        double result;

        if (option == 1) {
            result = n1 + n2;
            System.out.println("Result: " + result);
        }
        else if (option == 2) {
            result = n1 - n2;
            System.out.println("Result: " + result);
        }
        else if (option == 3) {
            result = n1 * n2;
            System.out.println("Result: " + result);
        }
        else if (option == 4) {

            if (n2 == 0) {
                System.out.println("Error: division by zero!");
            }
            else {
                result = n1 / n2;
                System.out.println("Result: " + result);
            }

        }
        else {
            System.out.println("Invalid option!");
        }

        scanner.close();
    }
}