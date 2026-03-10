import java.util.Scanner;

public class MiniCalculadora {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Mini Calculadora ===");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Escolha uma opção: ");
        int opcao = teclado.nextInt();

        System.out.print("Digite o primeiro número: ");
        double n1 = teclado.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = teclado.nextDouble();

        double resultado;

        if (opcao == 1) {
            resultado = n1 + n2;
            System.out.println("Resultado: " + resultado);
        } 
        else if (opcao == 2) {
            resultado = n1 - n2;
            System.out.println("Resultado: " + resultado);
        } 
        else if (opcao == 3) {
            resultado = n1 * n2;
            System.out.println("Resultado: " + resultado);
        } 
        else if (opcao == 4) {
            if (n2 == 0) {
                System.out.println("Erro: divisão por zero!");
            } else {
                resultado = n1 / n2;
                System.out.println("Resultado: " + resultado);
            }
        } 
        else {
            System.out.println("Opção inválida!");
        }

        teclado.close();
    }
}