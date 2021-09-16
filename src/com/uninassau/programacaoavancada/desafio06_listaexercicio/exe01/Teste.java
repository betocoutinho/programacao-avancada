package com.uninassau.programacaoavancada.desafio06_listaexercicio.exe01;

import javax.swing.*;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner leitor = new Scanner(System.in);


        boolean loop = true;

        do {
            String opcao = JOptionPane.showInputDialog(null,
                    "***AGENDA***\n" +
                            "ESCOLHA UMA DAS OPÇÕES ABAIXO: \n" +
                            "[1] Para Adicionar uma Pessoa\n" +
                            "[2] Para remover uma Pessoa\n" +
                            "[3] Para buscar uma pessoa\n" +
                            "[4] Imprimir Agenda\n" +
                            "[5] Imprimir Pessoa\n" +
                            "[6] SAIR");
            switch (opcao) {
                case "1":
                    String nome = JOptionPane.showInputDialog(null,
                            "Informe o nome:","Nome");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Informe a idade", "Idade"));

                    double altura = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Informe a Altura"));

                    agenda.armazenarPessoa(nome, idade, altura);
                    break;
                case "2":
                    String nomeParaRemoção = JOptionPane.showInputDialog(null,
                            "Informe o nome para remover:","Nome");
                    agenda.removerPessoa(nomeParaRemoção);
                    break;
                case "3":
                    String nomeParaBuscar = JOptionPane.showInputDialog(null,
                            "Informe o nome para buscar:","Nome");

                    JOptionPane.showMessageDialog(null,
                            "A pessoa esta na posição: " + agenda.buscarPessoa(nomeParaBuscar));
                    break;
                case "4":
                    agenda.imprimirAgenda();
                    break;
                case "5":
                    int index = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Informe o index para imprimir a pessoa", "Index"));
                    agenda.imprimiPessoa(index);
                    break;
                case "6":
                    loop = false;
                    break;
                default:
                    System.exit(0);

            }
        }while (loop);





    }


}
