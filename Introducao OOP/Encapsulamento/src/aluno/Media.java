package aluno;

public class Media {
    private String nome;
    private double[] notas;

    public Media(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public double calcularMedia() {
        double soma = 0;

        for(double nota : notas){
            soma += nota;
        }

        return soma / notas.length;
    }
}