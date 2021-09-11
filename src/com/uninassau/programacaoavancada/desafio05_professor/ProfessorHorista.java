package com.uninassau.programacaoavancada.desafio05_professor;

public class ProfessorHorista extends Professor{

    private double valorDeHora;
    private int quantidadeDeHoras;

    public ProfessorHorista(String nome, long matricula, double valorDeHora, int quantidadeDeHoras) {
        super(nome, matricula);
        this.valorDeHora = valorDeHora;
        this.quantidadeDeHoras = quantidadeDeHoras;
    }

    public double getValorDeHora() {
        return valorDeHora;
    }

    public void setValorDeHora(double valorDeHora) {
        this.valorDeHora = valorDeHora;
    }

    public int getQuantidadeDeHoras() {
        return quantidadeDeHoras;
    }

    public void setQuantidadeDeHoras(int quantidadeDeHoras) {
        this.quantidadeDeHoras = quantidadeDeHoras;
    }

    @Override
    public String toString() {
        return "ProfessorHorista{ " + super.toString() +
                " valorDeHora=" + valorDeHora +
                ", quantidadeDeHoras=" + quantidadeDeHoras +
                "} ";
    }
}
