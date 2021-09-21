package com.uninassau.programacaoavancada.desafio06_listaexercicio.exe02;

import javax.swing.*;

public class Teste {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();

        JOptionPane.showMessageDialog(null, "BEM VINDO AO PREDIO GUIMARÃES");

        JOptionPane.showMessageDialog(null, "Configure o seu prédio!!!");
        int capacidadeElevador = Integer.parseInt(JOptionPane
                .showInputDialog(null, "Informe a capacidade do elevador",
                        "Digite aqui"));

        int totalDeAndares = Integer.parseInt(JOptionPane
                .showInputDialog(null, "Informe a quantidade de andares",
                        "Digite aqui"));

        elevador.inicializar(capacidadeElevador, totalDeAndares);

        boolean loop = true;

        do {
            String opçao = JOptionPane.showInputDialog(null,
                    "STATUS DO ELEVADOR: \n"
                            + "Capacidade do elevador: " + elevador.getCapacidadeDoElevador()
                            + "\nQuantidade de andares: " + elevador.getTotalAndares()
                            + "\n---------------------------------------"
                            + " \nAndar Atual: " + elevador.getAndarAtual()
                            + " \nPessoas no Elevador: " + elevador.getPessoasPresentes()
                            + "\n \n EsColha uma das opções: \n"
                            + "[1] para entrar \n"
                            + "[2] para sair \n"
                            + "[3] para subir \n"
                            + "[4] para descer \n"
                            + "[5] para sair", "Digite aqui");

            switch (opçao){
                case "1":
                    if (!elevador.entrar()){
                        JOptionPane.showMessageDialog(null, "Elevador Lotado!!!");
                    }
                    break;
                case "2":
                    if (!elevador.sair()){
                        JOptionPane.showMessageDialog(null, "Elevador vazio");
                    }
                    break;
                case "3":
                    int andarParaSubir = Integer.parseInt(JOptionPane
                            .showInputDialog(null, "Informe o andar para subir",
                                    "Digite aqui"));
                    if (!elevador.sobe(andarParaSubir)){
                        JOptionPane.showMessageDialog(null, "Este andar não existe!!!");
                    }
                    break;
                case "4":
                    int andarParaDescer = Integer.parseInt(JOptionPane
                            .showInputDialog(null, "Informe o andar para descer",
                                    "Digite aqui"));

                    if (!elevador.desce(andarParaDescer)){
                        JOptionPane.showMessageDialog(null, "Andar invalido!!!");
                    }
                    break;
                case "5":
                    loop = false;
                    break;
                default:
                    System.exit(0);
            }
        }while (loop);


    }
}
