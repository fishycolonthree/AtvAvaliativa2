public class Lista1Ex4 {
    public static void main(String[] args) {
        int contador = 0;
        int primeiro = 0;
        int segundo = 1;

        while (contador < 10) {
            if (contador == 0) {
                System.out.print(primeiro);
            } else if (contador == 1) {
                System.out.print(", " + segundo);
            } else {
                int proximo = primeiro + segundo;
                System.out.print(", " + proximo);
                primeiro = segundo;
                segundo = proximo;
            }
            contador++;
        }
    }
}
