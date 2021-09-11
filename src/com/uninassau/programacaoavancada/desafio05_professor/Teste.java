package com.uninassau.programacaoavancada.desafio05_professor;

import javax.swing.*;

public class Teste {
    public static void main(String[] args) {
        boolean status = true;

        do {
            String opcao = JOptionPane.showInputDialog(null,
                    "Informe [1] para Professor Horista ou [2] para Professor Bolsista ou [0] para sair",
                    "digite");

            if (opcao.equals("1")){
                String nome = JOptionPane.showInputDialog(null,
                        "Informe o nome do professor: ", "Nome");
                long matricula = Long.parseLong(JOptionPane.showInputDialog(null,
                        "Informe a matricula: ", "Matricula"));
                double valorDeHora = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Informe o valor da hora aula", "Valor da hora aula"));
                int quantidadeDeHoras = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Informe a Quantidade de horas: ", "quantidade de horas"));

                ProfessorHorista professorHorista = new ProfessorHorista(nome, matricula, valorDeHora, quantidadeDeHoras);

                JOptionPane.showMessageDialog(null, professorHorista.toString()
                        + "Valor das horas aulas: " + Teste.calcSalario(professorHorista));
            }else if (opcao.equals("2")){
                String nome = JOptionPane.showInputDialog(null,
                        "Informe o nome do professor: ", "Nome");
                long matricula = Long.parseLong(JOptionPane.showInputDialog(null,
                        "Informe a matricula: ", "Matricula"));

                double salario = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Informe o valor do salario", "Valor do salario"));

                ProfessorBolsista professorBolsista = new ProfessorBolsista(nome, matricula, salario);

                JOptionPane.showMessageDialog(null, professorBolsista.toString());
            }else {
                status = false;
            }
        }while (status);



    }

    public static double calcSalario(ProfessorHorista professorHorista){
        return professorHorista.getQuantidadeDeHoras() * professorHorista.getValorDeHora();
    }
}
