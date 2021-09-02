package com.uninassau.programacaoavancada.desafio03_conta;

import javax.swing.*;

public class Conta {
    private String nome;
    private int numeroDaConta;
    private double saldo = 100;

    public Conta() {}



    public void sacar(double valor){
        if(valor > this.saldo || this.saldo == 0){
            JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE!!!");
            System.out.println("Saldo Insuficiente");
        }else {
            this.setSaldo(this.getSaldo() - valor);
        }
    }

    public void depositar(double valor){
        this.setSaldo(this.getSaldo() + valor);
    }

    public double consultarSaldo(){
        return this.getSaldo();
    }

    public void consultarNome(){
        System.out.println(this.getNome());
    }

    public void alterarNome(String novoNome){
        this.setNome(novoNome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
