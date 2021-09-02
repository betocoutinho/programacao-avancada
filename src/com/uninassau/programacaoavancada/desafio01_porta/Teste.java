package com.uninassau.programacaoavancada.desafio01_porta;

public class Teste {

    public static void main(String[] args) {
        Porta porta1 = new Porta("Branca", 2.10, 0.80);
        System.out.println(porta1.toString());

        //teste para abrir porta
        porta1.abrirPorta();
        System.out.println(porta1.toString());

        //teste para fechar porta
        porta1.fecharPorta();
        System.out.println(porta1.toString());

        //teste para pintar porta
        porta1.pintar();
        System.out.println(porta1.toString());

        //teste para saber se a porta esta aberta
        System.out.println("A porta esta aberta: "+porta1.estaAberta());






    }



}
