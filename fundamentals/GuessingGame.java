package fundamentals;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("=== Guessing Game ===");
        System.out.println("Try to guess the number between 1 and 100");

        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low!");
            }
            else if (guess > secretNumber) {
                System.out.println("Too high!");
            }
            else {
                System.out.println("Congratulations! You guessed it!");
            }
        }

        scanner.close();
    }
}