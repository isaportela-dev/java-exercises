package strings;

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.trim().split("\\s+");

        int wordCount = words.length;

        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}