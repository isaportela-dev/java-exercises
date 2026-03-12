package strings;

import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine().toLowerCase();

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            char letter = text.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);

        scanner.close();
    }
}