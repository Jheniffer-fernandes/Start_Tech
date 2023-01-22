package banco;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = Print.criarPessoa();
        Conta conta = Print.criarConta();

        pessoa.setConta(conta);

        Print.imprimirResumo(pessoa);
    }
}
