package conditionals;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = scanner.nextInt();

        int largest = n1;

        if (n2 > largest) {
            largest = n2;
        }

        if (n3 > largest) {
            largest = n3;
        }

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}