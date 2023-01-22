package banco;

public class Fisica extends Pessoa {
    private String nome;
    private String cpf;
    private String telefone;

    public Fisica(String nome, String cpf, String telefone, String email) {
        super(email);

        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return String.format(
                """
                %s
                CPF: %s
                Telefone: %s
                E-mail: %s
                """,
                nome, cpf, telefone, getEmail()
        );
    }

}
