package banco;

public class Pessoa {

    private Conta conta;
    private String email;

    public Pessoa(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
