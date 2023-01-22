package baralho;

public class Cartas {
    private String rank;
    private String naipe;

    public Cartas(String rank, String naipe) {
        this.rank = rank;
        this.naipe = naipe;
    }

    public String toString() {
        return String.format("%s de %s", rank, naipe);
    }
}
