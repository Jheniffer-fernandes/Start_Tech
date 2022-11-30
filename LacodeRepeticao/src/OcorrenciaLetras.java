import java.util.Scanner;

public class OcorrenciaLetras {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();

        System.out.print("Digite uma letra: ");
        String letra = input.nextLine();

        Integer contagem = 0;

        if (letra.length() != 1) {
            System.out.printf("É necessário informar apenas uma letra, mas foi informado %d", letra.length());
            return;
        }

        for (int i = 0; i < palavra.length(); i++) {
            if (letra.charAt(0) == palavra.charAt(i)) {
                contagem++;
            }
        }

        System.out.printf("A quantidade de letras %s na palavra %s é %d", letra, palavra, contagem);

        input.close();
    }

}

