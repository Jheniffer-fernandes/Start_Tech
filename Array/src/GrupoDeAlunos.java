import java.util.Random;

public class GrupoDeAlunos {
    public static void main(String[] args) {

        int quantidade = args.length / 3;

        String[][] grupos = new String[quantidade][3];

        Random group = new Random();

        for(int i = 0; i < quantidade; i++) {
            int alunos = 0;
            while(alunos < 3) {
                int sorteio = group.nextInt(0, args.length);

                if(!args[sorteio].equals("")) {
                    grupos[i][alunos] = args[sorteio];
                    alunos++;
                    args[sorteio] = "";
                }
            }
        }

        for(String[] grupo : grupos) {
            System.out.println("Grupo");
            for(String aluno : grupo) {
                System.out.println(aluno);
            }
        }

    }
}



