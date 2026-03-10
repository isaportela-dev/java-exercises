import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = teclado.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        teclado.close();
    }
}