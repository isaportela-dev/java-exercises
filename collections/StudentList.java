package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.println("Enter student names (type 'exit' to stop):");

        while (true) {

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            students.add(name);
        }

        System.out.println("\nRegistered students:");
       
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        scanner.close();
    }
    
}
