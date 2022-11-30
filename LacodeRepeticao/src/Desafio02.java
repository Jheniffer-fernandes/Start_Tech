import java.util.Scanner;
import java.util.Random;

public class Desafio02 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de dados que deverá ser lançado");
        int dados = input.nextInt();

        System.out.println("Digite o número de sorteios");
        int sorteios = input.nextInt();


        for (int j = 0; j < sorteios; j++) {
            int total = 0;
            for (int i = 0; i < dados; i++) {
                int numero = random.nextInt(1, 7);
                total += numero;

                if (i == dados - 1) {
                    System.out.printf("%d = ", numero);
                } else {
                    System.out.printf("%d + ", numero);
                }
            }

            System.out.printf("%d\n", total);
            input.close();
        }
    }
}
