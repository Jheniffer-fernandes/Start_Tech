package piscina;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Piscina volume = new Piscina();

        System.out.println("Digite a altura");
        volume.altura = input.nextDouble();

        System.out.println("Digite a largura");
        volume.largura = input.nextDouble();

        System.out.println("Digite a profundidade");
        volume.profundidade = input.nextDouble();

        System.out.println(volume.calcularVolume());
    }
}
