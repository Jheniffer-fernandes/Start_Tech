package piscina;

public class Piscina {
    double altura;
    double profundidade;
    double largura;

    double volume;

    public double calcularVolume() {
       volume = altura * profundidade * largura;
       return volume;
    }
}
