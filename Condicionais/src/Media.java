import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner nota = new Scanner(System.in);

        float n1, n2, n3, n4, mediaFinal;

        System.out.println("Coloque a primeira nota");
        n1 = nota.nextFloat();

        System.out.println("Coloque a segunda nota");
        n2 = nota.nextFloat();

        System.out.println("Coloque a terceira nota");
        n3 = nota.nextFloat();

        System.out.println("Coloque a quarta nota");
        n4 = nota.nextFloat();

        mediaFinal = (n1 + n2 + n3 + n4) / 4;

        System.out.println("As notas do aluno são: " + n1 + n2 + n3 + n4);
        System.out.println("A média final é de: " + mediaFinal);

        if (mediaFinal >= 6) {
            System.out.println("o aluno foi aprovado");
        } else {
            System.out.println("O aluno foi reprovado");
        }
        nota.close();
    }
}
