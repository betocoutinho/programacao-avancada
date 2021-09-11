package com.uninassau.programacaoavancada.desafio05_professor;

public abstract class Professor {
    private String nome;
    private long matricula;

    public Professor(String nome, long matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", matricula=" + matricula;
    }
}
