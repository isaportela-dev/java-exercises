package fundamentals;

import java.util.Scanner;

public class StudentReport {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the first grade: ");
        double grade1 = scanner.nextDouble();

        System.out.print("Enter the second grade: ");
        double grade2 = scanner.nextDouble();

        System.out.print("Enter the third grade: ");
        double grade3 = scanner.nextDouble();

        double average = (grade1 + grade2 + grade3) / 3;

        System.out.println("\n--- Student Report ---");
        System.out.println("Student: " + name);
        System.out.printf("Average: %.2f%n", average);

        if (average >= 7) {
            System.out.println("Status: Approved");
        } 
        else if (average >= 5) {
            System.out.println("Status: Recovery");
        } 
        else {
            System.out.println("Status: Failed");
        }

        scanner.close();
    }
}