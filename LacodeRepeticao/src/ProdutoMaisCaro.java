import java.util.Scanner;

public class ProdutoMaisCaro {
    public static void main(String[] args) {


        float[] prices = new float[3];
        String[] produtos = new String[3];
        float maior;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o nome de 3 produtos: \n");

        for (int count = 0; count < produtos.length; count++) {
            System.out.println("Produto nº" + count);
            produtos[count] = input.nextLine();
        }

        System.out.println("");

        for (int count = 0; count < prices.length; count++) {
            System.out.println("Preço nº" + count);
            prices[count] = input.nextFloat();
        }

        System.out.println("");

       maior = prices[0];

        // encontrar o maior número

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maior) {
                maior = prices[i];
            }
        }

        System.out.println("O maior preço é: "+maior);





    }}

