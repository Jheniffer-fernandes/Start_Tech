import java.util.Scanner;
import java.util.Random;

public class Desafio {
    public static void main(String[] args) {

//        emprestimo reprovado

        int idade, parcela, renda, emprestimo, limite, valor;

        Scanner info = new Scanner(System.in);

        System.out.println("Informe sua idade ");
        idade = info.nextInt();

        System.out.println("Informe o numero de parcelas");
        parcela = info.nextInt();

        System.out.println("Qual a sua renda?");
        renda = info.nextInt();

        System.out.println("Qual o valor de empréstimo desejado?");
        emprestimo = info.nextInt();

        System.out.println("A pessoa que está solicitando o empréstimo tem " + idade + " anos de idade e " +
                "tem o salário de " + renda);

        System.out.println("O valor solicitado é de " + emprestimo +
                " para ser pago em " + parcela + " parecelas");

        valor = emprestimo / parcela;
        limite = renda - (30 / 100);

        info.close();

        if(idade < 18){
            System.out.println("O empréstimo foi reprovado pois a idade não pode ser menor que 18 anos.");
        } else if(idade > 65) {
            System.out.println("O empréstimo foi reprovado pois a idade não pode ser maior que 65 anos.");
        } else if(parcela < 3) {
            System.out.println("O empréstimo foi reprovado pois a quantidade de parcelas não pode ser menor que 3.");
        } else if(parcela > 24) {
            System.out.println("O empréstimo foi reprovado pois a quantidade de parcelas não pode ser maior que 24.");
        } else if(valor > limite) {
            System.out.printf(
                    "O empréstimo foi reprovado pois uma parcela de %.2f compromete mais " +
                            "do que 30% da renda dessa pessoa.", valor);
        } else {
            System.out.println("O empréstimo foi aprovado.");
        }

//      sorteio

        int aposta = Integer.parseInt(args[0]);

        System.out.printf("O número selecionado foi o %d.\n", aposta);

        if(aposta < 1 || aposta > 6) {
            System.out.println("Erro! Por favor, escolha um número entre 1 e 6.");
        } else {
            Random random = new Random();
            int sorteio1 = random.nextInt(1, 7);
            int sorteio2 = random.nextInt(1, 7);
            int sorteio3 = random.nextInt(1, 7);

            System.out.printf("O números sorteados foram: %d, %d e %d.\n", sorteio1, sorteio2, sorteio3);

            int acertos = 0;

            if(aposta == sorteio1) {
                acertos++;
            }

            if(aposta == sorteio2) {
                acertos++;
            }

            if(aposta == sorteio3) {
                acertos++;
            }

            if(acertos == 1) {
                System.out.printf("Você teve 1 acerto!");
            } else if(acertos > 1) {
                System.out.printf("Você teve %d acertos!", acertos);
            } else {
                System.out.println("Voce não teve nenhum acerto.");
            }

    }
}
}
