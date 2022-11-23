import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {

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

            if(
                    (idade >= 18 && idade <= 65) &&
                            (parcela >= 3 && parcela <= 24) &&
                            (valor <= limite)
            ) {
                System.out.println("O empréstimo foi aprovado.");
            } else  {
                System.out.println("O empréstimo foi reprovado.");
            }

        }
    }

