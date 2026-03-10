import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int palpite = 0;

        System.out.println("=== Jogo de Adivinhação ===");
        System.out.println("Tente adivinhar o número entre 1 e 100");

        while (palpite != numeroSecreto) {

            System.out.print("Digite seu palpite: ");
            palpite = teclado.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo!");
            } 
            else if (palpite > numeroSecreto) {
                System.out.println("Muito alto!");
            } 
            else {
                System.out.println("Parabéns! Você acertou!");
            }
        }

        teclado.close();
    }
}