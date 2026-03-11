package arrays;

import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            sum = sum + numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Average: " + average);

        scanner.close();
    }
}