import java.util.Scanner;

public class MaiorEMenorValor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menor;
        int maior;
        int[] numeros = new int[10];

        // comprimento do vetor

        int tamanho = numeros.length;

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um número:");
            numeros[i] = input.nextInt();
        }
        menor = numeros[0];
        maior = numeros[0];

        // encontrar o maior número

        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        // encontrar o menor número

        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("O maior número é: "+maior);
        System.out.println("O menor número é: "+menor);
        input.close();
    }

}

