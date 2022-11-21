import java.util.Scanner;
import java.util.Random;

public class Sorteio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int palpite, num = 0;
        num = rand.nextInt(6) + 1;
        System.out.println("Digite seu palpite:");
        palpite = input.nextInt();
        if (palpite == num) {
            System.out.println("Você acertou!!! O número era " + num);
        } else {
            if (palpite < num) {
                System.out.println("Seu palpite está abaixo!!! O número era " + num);
            } else {
                System.out.println("Seu palpite está acima. O número era " + num);
            }
        }
        input.close();
    }
}
