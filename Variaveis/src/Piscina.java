import java.util.Scanner;

public class Piscina {
    public static void main(String[] args) {

        Scanner valores = new Scanner(System.in);

        System.out.println("informe a altura");
        double altura = valores.nextDouble();

        System.out.println("informe a largura");
        double largura = valores.nextDouble();

        System.out.println("Informe o comprimento");
        double comprimento = valores.nextDouble();

        System.out.println("Os valores informados foram " + altura + " m " + largura + " m " + comprimento + " m ");

        double valor = altura * largura * comprimento;
        double volume = valor * 1000;

        System.out.println("Essa piscina comporta " + volume + " litros de água.");

//        Desafio

        System.out.println("informe a altura");
        double h = valores.nextDouble();

        System.out.println("informe a largura");
        double l = valores.nextDouble();

        System.out.println("Informe a profundidade inicial");
        double profundidadeInicial = valores.nextDouble();

        System.out.println("Informe a profundidade final");
        double profundidadeFinal = valores.nextDouble();

        double profundidade = (profundidadeFinal + profundidadeInicial) / 2;
        double valorDesafio = h * l * profundidade;
        double volumeDesafio = valorDesafio * 1000;

        System.out.println("Essa piscina comporta " + volumeDesafio + " litros de água.");

        valores.close();

    }
}
