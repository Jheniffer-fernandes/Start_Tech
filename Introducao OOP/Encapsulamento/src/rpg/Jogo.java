package rpg;

public class Jogo {
    public static void main(String[] args) {
        Personagens jogador = new Personagens(
                "Jogador",
                10,
                new Armas("Espada", 2, 8),
                2
        );

        Personagens orc = new Personagens(
                "Orc",
                8,
                new Armas("Machado", 0, 12),
                0
        );

        while(orc.estaVivo() && jogador.estaVivo()) {
            System.out.println("Uma nova rodada inicia.");
            jogador.atacar(orc);

            if(orc.estaVivo()) {
                orc.atacar(jogador);
            }
        }

        if(jogador.estaVivo()) {
            System.out.println("Morreu " + orc.getNome());
        } else {
            System.out.println("Morreu " + jogador.getNome());
        }
    }
}
