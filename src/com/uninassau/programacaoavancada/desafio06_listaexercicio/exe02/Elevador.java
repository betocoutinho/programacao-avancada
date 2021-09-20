package com.uninassau.programacaoavancada.desafio06_listaexercicio.exe02;

public class Elevador {
    
    private int andarAtual;
    private int totalAndares;
    private int capacidadeDoElevador;
    private int pessoasPresentes;

    public Elevador() {
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }


    public void inicializar(int capacidadeDoElevador, int totalAndares ) {
        this.capacidadeDoElevador = capacidadeDoElevador;
        this.totalAndares = totalAndares;
    }

    public boolean entra(){
        if (this.pessoasPresentes <= capacidadeDoElevador){
            this.pessoasPresentes++;
            return true;
        }else {
            return false;
        }
    }

    public boolean sai(){
        if (this.pessoasPresentes > 0){
            this.pessoasPresentes--;
            return true;
        }else{
            return false;
        }
    }

    public boolean sobe(int andar){
        if (andar <= totalAndares){
            this.andarAtual = andar;
            return true;
        }else {
            return false;
        }


    }


    public boolean desce(int andar){
        if (andar >= 0){
            this.andarAtual = andar;
            return true;
        }else {
            return false;
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeDoElevador() {
        return capacidadeDoElevador;
    }

    public void setCapacidadeDoElevador(int capacidadeDoElevador) {
        this.capacidadeDoElevador = capacidadeDoElevador;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
}
