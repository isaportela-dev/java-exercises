package loops;

import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.println("Enter numbers to sum. Type 0 to stop.");

        while (true) {

            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum = sum + number;
        }

        System.out.println("Total sum: " + sum);

        scanner.close();
    }
}