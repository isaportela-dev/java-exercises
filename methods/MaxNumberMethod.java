package methods;

import java.util.Scanner;

public class MaxNumberMethod {

    public static int findMax(int a, int b, int c) {

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = scanner.nextInt();

        int result = findMax(n1, n2, n3);

        System.out.println("The largest number is: " + result);

        scanner.close();
    }
}