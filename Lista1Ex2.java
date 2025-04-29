import java.util.Scanner;

public class Lista1Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite números positivos para somar. Digite um número negativo para encerrar.");

        numero = scanner.nextInt();

        while (numero >= 0) {
            soma += numero;
            numero = scanner.nextInt();
        }

        System.out.println("A soma dos números positivos é: " + soma);

        scanner.close();
    }
}
