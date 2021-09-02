package com.uninassau.programacaoavancada.desafio04_pessoa;

import javax.swing.*;

public class Teste {
    public static void main(String[] args) {

        //entrada de dados

        String nome = JOptionPane.showInputDialog(null, "Digite um nome: ", "Entrada de dados");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade: ", "Entrada de dados"));
        String CPF = JOptionPane.showInputDialog(null, "Digite um CPF: ", "Entrada de dados");


        Pessoa pessoa1 = new Pessoa(nome, idade, CPF);
        Pessoa pessoa2 = new Pessoa();

        JOptionPane.showMessageDialog(null, "Tela de alteração");

        pessoa2.alterar();

        JOptionPane.showMessageDialog(null, pessoa1.toString());
        JOptionPane.showMessageDialog(null, pessoa2.toString());


    }
}
