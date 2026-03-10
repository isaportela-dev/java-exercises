import java.util.Scanner;

public class BoletimAluno {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = teclado.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("\n--- Boletim ---");
        System.out.println("Aluno: " + nome);
        System.out.printf("Média: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 5) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }

        teclado.close();
    }
}