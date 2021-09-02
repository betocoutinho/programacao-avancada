package com.uninassau.programacaoavancada.desafio01_porta;

import java.util.Scanner;

public class Porta {
    private boolean estaAberta;
    private String cor;
    private double altura;
    private double largura;

    public Porta(String cor, double altura, double largura) {
        this.estaAberta = false;
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
    }

    public void abrirPorta(){
        if (this.estaAberta == true){
            System.out.println("A porta já esta aberta!!!!");
        }else {
            System.out.println("Abrindo porta!!!!");
            this.estaAberta = true;
        }
    }

    public void fecharPorta(){
        if (this.estaAberta == false){
            System.out.println("A porta já esta fechada!!!!");
        }else {
            System.out.println("fechando porta!!!!");
            this.estaAberta = false;
        }
    }

    public void pintar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a cor da Porta: ");
        this.cor = leitor.nextLine();

        System.out.println("Cor Escolhida: " + this.cor);
    }

    public boolean estaAberta(){
        return this.estaAberta;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "Porta{" +
                "estaAberta=" + estaAberta +
                ", cor='" + cor + '\'' +
                ", altura=" + altura +
                ", largura=" + largura +
                '}';
    }
}
