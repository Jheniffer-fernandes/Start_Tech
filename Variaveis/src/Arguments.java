public class Arguments {
    public static void main(String[] args) {

//        idade

        int birthday = Integer.parseInt(args[0]);
        int ano = Integer.parseInt(args[1]);

        int idade = ano - birthday;

        System.out.printf(
                "O ano de nascimento informado é %d.\n" +
                        "A pessoa tem (ou vai completar) %d anos em %d.",
                birthday, idade, ano
        );

//      cinema

        int fileiras = Integer.parseInt(args[2]);
        int cadeiras = Integer.parseInt(args[3]);

        int sala = fileiras * cadeiras;

        System.out.printf(
                "A sala de cinema tem %d fileiras e %d cadeiras em cada.\n" +
                        "A capacidade dessa sala é de 80 pessoas.",
                fileiras, cadeiras, sala
        );

//        kilometros

        double kilometros = Double.parseDouble(args[4]);
        double milhas = 0.6213712;

        double resultado = kilometros * milhas;

        System.out.printf(
                "O valor recebido em kilômetros é %f.\n" +
                        "O resultado em milhas é %f.",
                kilometros, resultado
        );

//        temperatura

        double celsius = Double.parseDouble(args[5]);
        double farenheit = (celsius * 1.8) + 32;

        System.out.printf(
                "A temperatura informada é %.2fºC.\n" +
                        "O valor convetido é %.2fºF.",
                celsius, farenheit
        );

//        Piscina

        double largura = Double.parseDouble(args[6]);
        double comprimento = Double.parseDouble(args[7]);
        double altura = Double.parseDouble(args[8]);

        double volume = largura * comprimento * altura;
        double litros = volume * 1000;

        System.out.printf(
                "As dimensões da piscina são %.2fm x %.2fm x %.2fm.\n" +
                        "Essa piscina comporta %.2f litros de água.",
                largura, comprimento, altura, litros
        );

    }
}