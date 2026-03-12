package strings;

import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        int length = text.length();

        System.out.println("Number of characters: " + length);

        scanner.close();
    }
}