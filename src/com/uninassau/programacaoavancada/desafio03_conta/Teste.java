package com.uninassau.programacaoavancada.desafio03_conta;

import javax.swing.*;

public class Teste {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Banco Paraguaçu");

        String nome = JOptionPane.showInputDialog(null, "Informe um nome para criar a sua conta: ", "Nome");

        Conta conta1 = new Conta();
        conta1.setNome(nome);


        boolean verificador = true;

        do {

            String opcao = JOptionPane.showInputDialog(null,
                    "ESCOLHA UMA DAS OPÇÕES: [1] - SACAR , [2] - DEPOSITAR, [3] - CONSULTAR SALDO, [4] - SAIR",
                    "DIGITE UM VALOR");

            switch (opcao){
                case "1":
                    double valorASacar = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Informe um valor para sacar: ", "Digite um valor"));
                    conta1.sacar(valorASacar);
                    break;
                case "2":
                    double valorADepositar = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Informe um valor para depositar: ", "Digite um valor"));
                    conta1.depositar(valorADepositar);
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "O seu saldo é: " + conta1.consultarSaldo());
                    break;
                case "4":
                    verificador = false;
                    break;
                default:
            }
        }while (verificador);
    }
}
