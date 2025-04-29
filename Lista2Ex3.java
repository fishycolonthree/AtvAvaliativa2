import java.util.Scanner;
import java.util.Random;

public class Lista2Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSorteado = random.nextInt(20) + 1; // Gera número entre 1 e 20
        int tentativa;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número entre 1 e 20!");

        do {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa > numeroSorteado) {
                System.out.println("O número é menor.");
            } else if (tentativa < numeroSorteado) {
                System.out.println("O número é maior.");
            }
        } while (tentativa != numeroSorteado);

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s).");

        scanner.close();
    }
}
