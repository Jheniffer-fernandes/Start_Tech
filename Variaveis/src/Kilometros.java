import java.util.Scanner;

public class Kilometros {
    public static void main(String[] args) {
        Scanner kilometros = new Scanner(System.in);
        System.out.println("Informe os Kilomentros:");
        double milhas = kilometros.nextDouble();
        milhas = milhas / 1.609;
        System.out.printf("%.2f", milhas);

        //dividir por 1,609
    }
}
