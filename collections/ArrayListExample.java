package collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        System.out.println("names in the list");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}