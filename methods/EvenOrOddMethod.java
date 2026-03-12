package methods;

import java.util.Scanner;

public class EvenOrOddMethod {

    public static String checkNumber(int number) {

        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = checkNumber(number);

        System.out.println("The number is: " + result);

        scanner.close();
    }
}