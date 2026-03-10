import java.util.Scanner;

public class AntecessorSucessor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        teclado.close();
    }
}