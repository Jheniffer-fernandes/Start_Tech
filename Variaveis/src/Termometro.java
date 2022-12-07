import java.util.Scanner;

public class Termometro {
    public static void main(String[] args) {

        Scanner temperatura = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em Celsius: ");

        celsius = temperatura.nextDouble();

        System.out.println("A temperatura informada é " + celsius);

        fahrenheit = ( 9 * celsius + 160 ) / 5;

        System.out.println("O valor convetido é " + fahrenheit + "ºF");

        temperatura.close();

    }
}