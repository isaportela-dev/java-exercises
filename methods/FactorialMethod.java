package methods;

import java.util.Scanner;

public class FactorialMethod {

    public static int factorial(int number) {

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int factorialResult = factorial(number);

        System.out.println("Factorial: " + factorialResult);

        scanner.close();
    }
}