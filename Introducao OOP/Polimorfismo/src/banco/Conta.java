package banco;

import java.util.Random;

public abstract class Conta {
    private final int totalDigitos = 5;
    private final int digitosMaximo = 10;

    private String numero;
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
        gerarNumero();
    }

    private void gerarNumero() {
        Random random = new Random();

        numero = "";

        for(int i = 0; i < totalDigitos - 1; i++) {
            numero += random.nextInt(digitosMaximo);
        }

        numero += "-";
        numero += random.nextInt(digitosMaximo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }
}
