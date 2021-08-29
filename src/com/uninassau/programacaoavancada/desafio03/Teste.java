package com.uninassau.programacaoavancada.desafio03;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--Banco Paraguaçu--");

        Conta conta1 = new Conta();

        System.out.println("Informe um nome para criar a sua conta: ");
        String nome = leitor.nextLine();

        conta1.alterarNome(nome);

        boolean verificador = true;

        do {
            System.out.println("ESCOLHA UMA DAS OPÇÕES ABAIXO: ");
            System.out.println("[1] - SACAR");
            System.out.println("[2] - DEPOSITAR");
            System.out.println("[3] - CONSULTAR SALDO");
            System.out.println("[4] - SAIR");
            String opcao = leitor.nextLine();


            switch (opcao){
                case "1":
                    System.out.println("Informe um valor para sacar: ");
                    double valorASacar = leitor.nextDouble();
                    conta1.sacar(valorASacar);
                    break;
                case "2":
                    System.out.println("Informe um valor para depositar: ");
                    double valorADepositar = leitor.nextDouble();
                    conta1.depositar(valorADepositar);
                    break;
                case "3":
                    conta1.consultarSaldo();
                    break;
                case "4":
                    verificador = false;
                    break;
                default:
            }
        }while (verificador == true);
    }
}
