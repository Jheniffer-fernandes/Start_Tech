import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner birthday = new Scanner(System.in);
        System.out.println("Qual o ano do seu nascimento?");
        int ano = birthday.nextInt();
        ano = 2022 - ano;
        System.out.println("Você tem ou vai completar " + ano + " anos");
        birthday.close();
    }
}
