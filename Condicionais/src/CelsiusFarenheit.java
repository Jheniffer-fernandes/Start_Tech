import java.util.Scanner;

public class CelsiusFarenheit {
    public static void main(String[] args) {

        Scanner temperatura = new Scanner(System.in);
        float graus;
        String escala;

        System.out.println("Insira a temperatura: ");
        graus = temperatura.nextFloat();

        System.out.println("Informe se está em celsius (c) ou farenheit (f)");
        escala= temperatura.next();

        System.out.println("A temperatura informada foi " + graus + " " + escala);

        switch (escala) {
            case "C", "c":
                System.out.println("Ela equivale a " + ( 9 * graus + 160 ) / 5 + " farenheit");
               break;
           case "F", "f":
               System.out.println("Ela equivale a " +(graus - 32) * 5/9 + " celsius");
                break;
           default:
                System.out.println("A letra "+ escala + " não corresponde a uma unidade de medida de temperatura");
        }
        temperatura.close();

    }
}
