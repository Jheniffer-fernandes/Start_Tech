import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        int primo, x, y;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número maior que 0 ");
        int n = input.nextInt();

        for (x = 1; x <= n; x++) {

            // Omite 0
            if (x == 0)
                continue;

            primo = 1;

            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    primo = 0;
                    break;
                }
            }

            if (primo == 1) {
                System.out.print(x + " ");
            }
        }

    }
}

