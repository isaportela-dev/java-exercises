package fundamentals;

import java.util.Scanner;

public class PredecessorSuccessor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int predecessor = number - 1;
        int successor = number + 1;

        System.out.println("Predecessor: " + predecessor);
        System.out.println("Successor: " + successor);

        scanner.close();
    }
}