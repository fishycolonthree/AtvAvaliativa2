import java.util.Scanner;

public class Lista1Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "7515";
        String senhaDigitada;

        System.out.println("Digite a senha de acesso: (a senha é 7515)");

        senhaDigitada = scanner.nextLine();

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha incorreta, tente novamente.");
            senhaDigitada = scanner.nextLine();
        }

        System.out.println("Acesso concedido");

        scanner.close();
    }
}
