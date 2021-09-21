package com.uninassau.programacaoavancada.desafio06_listaexercicio.exe03;

import javax.swing.*;

public class Teste {

    public static void main(String[] args) {
        Invoice invoice = new Invoice();

        JOptionPane.showMessageDialog(null, "==INVOICE==");

        boolean loop = true;

        do {
            String opcao = JOptionPane.showInputDialog(null,
                    "Escolha uma das opções Abaixo: \n"
                            + "[1] para adicionar item: \n"
                            + "[2] para sair\n"
                            + "----------------------------\n"
                            + "INVOICE: \n"
                            + invoice.print()
                            + "\n\n TOTAL: " + invoice.getInvoiceAmount(), "Digite aqui");

            if (opcao.equals("1")){
                int numeroDoItem = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Informe o numero do item", "digite aqui"));

                String descItem =JOptionPane.showInputDialog(null,
                        "Informe a descrição do item", "digite aqui");

                Double quantidade = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Informe a quantidade do item", "digite aqui"));

                Double preco = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Informe o preço do item", "digite aqui"));

                invoice.getItems().add(new Item(numeroDoItem, descItem, quantidade, preco));
            }else{
                loop = false;
            }
        }while (loop);


    }
}
