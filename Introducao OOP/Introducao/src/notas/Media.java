package notas;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        int quantidadeAlunos = 3;

        Aluno[] media = new Aluno[quantidadeAlunos];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < quantidadeAlunos; i++) {
            Aluno aluno = new Aluno();

            System.out.println("Digite o nome do aluno");
            aluno.nome = input.next();

            System.out.println("Digite a primeira nota");
            aluno.notas[0] = input.nextDouble();

            System.out.println("Digite a segunda nota");
            aluno.notas[1] = input.nextDouble();

            System.out.println("Digite a terceira nota");
            aluno.notas[2] = input.nextDouble();

            media[i] = aluno;
        }

        for (Aluno aluno : media) {
            System.out.printf("%s teve a média %.1f. \n", aluno.nome, aluno.Calcularmedia());
        }
    }
}