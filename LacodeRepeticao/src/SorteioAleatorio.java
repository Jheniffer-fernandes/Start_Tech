import java.util.Random;
import java.util.Scanner;

public class SorteioAleatorio {
    public static void main(String[] args) {
        int num;

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero inteiro maior que 0");
        num = input.nextInt();


        int[] random = new int[num];
        int total = 0;




        for (int i = 0; i < random.length; i++) {
            random[i] = rand.nextInt(6) + 1;
            System.out.printf( "O número %d foi sorteado!\n", random[i] );
            total += random[i];

        }
        System.out.printf( "\nA soma dos números é %d.", total );

        input.close();
    }
}
