package methods;

import java.util.Scanner;

public class SumMethod {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        int result = sum(n1, n2);

        System.out.println("Result: " + result);

        scanner.close();
    }
}