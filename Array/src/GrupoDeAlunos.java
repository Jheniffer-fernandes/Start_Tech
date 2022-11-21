import java.util.Scanner;
import java.util.Random;

public class GrupoDeAlunos {
    public static void main(String[] args) {

        Random group = new Random();

       String names [] = {"Ana","Bianco","Mistica","Logan","Clark","Sofia"};

        int select = group.nextInt(names.length());

        System.out.println("Random String selected: " + names[select]);


//        Scanner names = new Scanner(System.in);


    }
}


