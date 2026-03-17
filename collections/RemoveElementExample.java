package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElementExample {

    public static void main (String[] args) {
       
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.println ("Enter student names (type 'exit' to stop):");

        while (true) {

            System.out.print ("Student name:");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            students.add(name);
        }

    System.out.print ("\nEnter a name to remove: ");
    String removeName = scanner.nextLine();
    
    if (students.remove(removeName)) {
        System.out.println ("Student removed successfully.");
    } else {
        System.out.println ("Student not found.");
    }

    System.out.println ("\nUpdated list: ");
    for (String student : students) {
        System.out.println (student);
    }
    scanner.close();
    }
}
