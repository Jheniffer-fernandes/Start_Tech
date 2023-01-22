package baralho;

import java.util.Random;

public class Baralho {
    private final String[] naipes = {"Copas", "Espadas", "Paus", "Ouros"};
    private final String[] ranks = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
    private final int quantidadeCartas = 52;

    private final Cartas[] cartas = new Cartas[quantidadeCartas];
    private final Random sorteador = new Random();

    public Baralho() {
        int i = 0;

        for(String rank : ranks) {
            for(String naipe : naipes) {
                Cartas carta = new Cartas(rank, naipe);
                cartas[i] = carta;
                i++;
            }
        }
    }

    public Cartas sortear() {
        int i = sorteador.nextInt(0, quantidadeCartas + 1);

        return cartas[i];
    }
}
