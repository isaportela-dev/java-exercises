package arrays;

import java.util.Scanner;

public class StudentGradesArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] grades = new double[5];
        double sum = 0;

        System.out.println("Enter 5 student grades:");

        for (int i = 0; i < grades.length; i++) {

            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();

            sum += grades[i];
        }

        double average = sum / grades.length;

        double highest = grades[0];
        double lowest = grades[0];

        for (int i = 1; i < grades.length; i++) {

            if (grades[i] > highest) {
                highest = grades[i];
            }

            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        System.out.println("\nResults:");
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        scanner.close();
    }
}