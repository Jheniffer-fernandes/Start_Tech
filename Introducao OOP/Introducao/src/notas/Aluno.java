package notas;

public class Aluno {
    String nome;

    double [] notas = new double[3];
//    double nota1, nota2, nota3;
    double media;

    public double Calcularmedia(){
        double soma = 0;

        for (double nota : notas){
            soma += nota;
        }
        return soma/ notas.length;
    }
}
