import java.util.Scanner;

public class OcorrenciaLetras {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String palavra;
        char letra;

        System.out.println("Digite uma palavra ");
        palavra = input.nextLine();

        System.out.println("Escolha uma letra");
        letra = input.next().charAt(0);


        long count = palavra.codePoints().filter(ch -> ch == letra).count();
        System.out.println("Ocorrencia " + count);

        if (letra == 0){
            System.out.println("Não existem ocorrencias");
        }
    }
}
