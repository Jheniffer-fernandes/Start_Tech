package banco;

import utils.Leitor;

public class Print {
    private static Leitor leitor = new Leitor();

    public static Pessoa criarPessoa() {
        int opcoes = leitor.lerInteiro(
                """
                Escolha uma opção:
                1- Pessoa Física
                2- Pessoa Jurídica
                """
        );

        if(opcoes == 1) {
            return criarPessoaFisica();
        }

        if(opcoes == 2) {
            return criarPessoaJuridica();
        }

        throw new RuntimeException("Opção inválida");
    }

    private static Fisica criarPessoaFisica() {
        String nome = leitor.lerString("Digite o nome: ");
        String cpf = leitor.lerString("Digite o cpf: ");
        String telefone = leitor.lerString("Digite o telefone: ");
        String email = leitor.lerString("Digite o e-mail: ");

        return new Fisica(nome, cpf, telefone, email);
    }

    private static Juridica criarPessoaJuridica() {
        String nomeFantasia = leitor.lerString("Digite o nome fantasia: ");
        String razaoSocial = leitor.lerString("Digite a razão social: ");
        String cnpj = leitor.lerString("Digite o CNPJ: ");
        String email = leitor.lerString("Digite o e-mail: ");

        return new Juridica(nomeFantasia, razaoSocial, cnpj, email);
    }


    public static Conta criarConta() {
        int opcoes = leitor.lerInteiro(
                """
                Escolha uma opção:
                1- Conta Corrente
                2- Conta Poupança
                """
        );

        if(opcoes != 1 && opcoes != 2) {
            throw new RuntimeException("Opção inválida");
        }

        double saldo = leitor.lerDecimal("Digite o valor do depósito inicial: ");

        if(opcoes == 1) {
            return new Corrente(saldo);
        } else {
            return new Poupanca(saldo);
        }
    }

    public static void imprimirResumo(Pessoa pessoa) {
        System.out.println(pessoa);
        System.out.println(pessoa.getConta());
    }
}
