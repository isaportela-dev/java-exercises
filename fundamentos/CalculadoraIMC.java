import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite seu peso em kg: ");
        double peso = teclado.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = teclado.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("\n--- Resultado ---");
        System.out.println("Nome: " + nome);
        System.out.printf("IMC: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade grau 1");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade grau 2");
        } else {
            System.out.println("Classificação: Obesidade grau 3");
        }

        teclado.close();
    }
}