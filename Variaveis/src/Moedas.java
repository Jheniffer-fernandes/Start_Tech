import java.util.Scanner;
import java.text.DecimalFormat;

public class Moedas {

    public static void main(String[] args) {
        Scanner moedas = new Scanner(System.in);
        System.out.println("Informe o valor em reais");
        double reais = moedas.nextDouble();
        DecimalFormat f = new DecimalFormat("##.##");
        double dolar = reais * 0.19;
        double iene = reais * 26.21;
        double libra = reais * 0.23;
        double euro = reais * 0.18;
        double franco = reais * 0.17;

        System.out.println(reais + " Reais equivale a :");
        System.out.println(f.format(dolar) + " dolares");
        System.out.println(f.format(iene) + " ienes");
        System.out.println(f.format(libra) + " libras");
        System.out.println(f.format(euro) + " euros");
        System.out.println(f.format(franco)+ " francos franceses");
        moedas.close();

    }
}