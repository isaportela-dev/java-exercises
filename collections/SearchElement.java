package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.print ("Enter student names (type exit to stop): ");

        while (true) {
            System.out.print ("Student name: ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            students.add(name);
        }
        System.out.print ("Enter a name to search: ");
        String searchName = scanner.nextLine();

        if (students.contains (searchName)){
            System.out.print("Student found!");
        } else {
            System.out.print("Student not found.");
        }
        scanner.close();
    }
    
}
