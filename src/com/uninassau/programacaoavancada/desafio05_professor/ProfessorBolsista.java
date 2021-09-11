package com.uninassau.programacaoavancada.desafio05_professor;

public class ProfessorBolsista extends Professor {
    private double salario;


    public ProfessorBolsista(String nome, long matricula, double salario) {
        super(nome, matricula);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ProfessorBolsista{ " + super.toString() +
                " salario=" + salario +
                '}';
    }
}
