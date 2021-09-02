package com.uninassau.programacaoavancada.desafio04_pessoa;

import javax.swing.*;

public class Pessoa {
    private String nome;
    private int idade;
    private String CPF;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
    }


    public void alterar(){


        boolean status = true;
        do {
            String opcao = JOptionPane.showInputDialog(null,
                    "Escolha uma das opções para alterar: [1] - Nome, [2] - idade, [3]- CPF, [4] - sair", "Digite um número");
            switch (opcao){
                case "1":
                    String nome = JOptionPane.showInputDialog(null, "Digite um Nome: ", "alteração de dados");
                    this.setNome(nome);
                    break;

                case "2":
                    int idade = Integer.parseInt(
                            JOptionPane.showInputDialog(null, "Digite a Idade: ", "alteração de dados"));
                    this.setIdade(idade);
                    break;

                case "3":
                    String CPF = JOptionPane.showInputDialog(null, "Digite um CPF: ", "alteração de dados");
                    this.setCPF(CPF);
                    break;

                case "4":
                    status = false;
                    break;
                default:
                    System.exit(0);
            }
        }while (status);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", CPF='" + CPF + '\'' +
                '}';
    }
}
