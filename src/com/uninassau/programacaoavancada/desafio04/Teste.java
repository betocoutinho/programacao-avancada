package com.uninassau.programacaoavancada.desafio04;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Roberto", 25, "025.487.512-11");
        Pessoa pessoa2 = new Pessoa();


        pessoa2.setNome("Julia");
        pessoa2.setIdade(36);
        pessoa2.setCPF("985.421.521-55");

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
    }
}
