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



        String opçao = JOptionPane.showInputDialog(null,
                "STATUS DO ELEVADOR: \n"
        + "Andar Atual: " + elevador.getAndarAtual()
        + " \nPessoas no Elevador: " + elevador.getPessoasPresentes()
        + "\n \n EsColha uma das opções: \n"
        + "[1] para entrar \n"
        + "[2] para sair \n"
        + "[3] para subir \n"
        + "[4] para descer \n"
        + "[5] para sair", "Digite aqui");
    }
}
