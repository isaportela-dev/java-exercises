package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentCRUD {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        int option;

        do {
            System.out.println("\n=== Student System ===");
            System.out.println("1 - Add student");
            System.out.println("2 - List students");
            System.out.println("3 - Search student");
            System.out.println("4 - Remove student");
            System.out.println("5 - Exit");

            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (option) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    students.add(name);
                    System.out.println("Student added!");
                    break;

                case 2:
                    System.out.println("\nStudent list:");
                    if (students.isEmpty()) {
                        System.out.println("No students registered.");
                    } else {
                        for (String student : students) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = scanner.nextLine();

                    if (students.contains(search)) {
                        System.out.println("Student found!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to remove: ");
                    String remove = scanner.nextLine();

                    if (students.remove(remove)) {
                        System.out.println("Student removed!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 5);

        scanner.close();
    }
}