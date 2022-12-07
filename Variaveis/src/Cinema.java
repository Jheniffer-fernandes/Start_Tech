import java.util.Scanner;

public class Cinema {
    public class salaCinema {
        public static void main(String[] args) {
            Scanner lugares = new Scanner(System.in);
            System.out.println("Quantidade de cadeiras na fileira?");
            int cadeiras = lugares.nextInt();
            System.out.println("Quantidade de fileiras na sala?");
            int fileiras = lugares.nextInt();
            int sala = cadeiras * fileiras;
            System.out.println("A capacidade dessa sala é " + sala);

            double total = 0.1 * sala ;

            System.out.println("Extra: A capacidade dessa sala é " +cadeiras * fileiras + " sendo que" + total +
                    " lugares são reservados para PCDs");

            lugares.close();
        }
    }
}
