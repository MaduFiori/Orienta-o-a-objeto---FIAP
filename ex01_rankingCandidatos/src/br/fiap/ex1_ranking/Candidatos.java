package br.fiap.ex1_ranking;

public class Candidatos {
    public String Nome;
    private int Experiencia;
    private double Nota;

    public String toString(){
        return String.format("Nome = %s | Nota técnica = %.2f | Anos de experiência = %d", Nome, Nota, Experiencia);
    }

    public Candidatos(String nome, int experiencia, double nota) {
        Nome = nome;
        Experiencia = experiencia;
        Nota = nota;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(int experiencia) {
        Experiencia = experiencia;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double nota) {
        Nota = nota;
    }
}
