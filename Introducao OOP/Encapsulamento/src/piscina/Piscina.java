package piscina;

import utils.Leitor;
public class Piscina {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();

        double largura = leitor.lerDecimal("Digite a largura: ");
        double comprimento = leitor.lerDecimal("Digite o comprimento: ");
        double profundidade = leitor.lerDecimal("Digite a profundidade: ");

        Volume piscina = new Volume(largura, comprimento, profundidade);
        System.out.println(piscina);
        System.out.printf("O volume da piscina é %.2f m³.", piscina.calcularVolume());
    }
}

