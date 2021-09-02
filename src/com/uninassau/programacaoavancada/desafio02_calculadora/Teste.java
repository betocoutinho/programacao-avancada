package com.uninassau.programacaoavancada.desafio02_calculadora;

import javax.swing.*;

public class Teste {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        String identificador = JOptionPane.showInputDialog(null,
                "Digite [1] para somar, [2] para subtrair, [3] para multiplicar, [4] para dividir: ", "Informe o número");

        String valorA = JOptionPane.showInputDialog(null, "Informe o primeiro valor", "Digite um número");
        String valorb = JOptionPane.showInputDialog(null, "Informe o segundo valor", "Digite um número");

        double valorParseadoA = Double.parseDouble(valorA);
        double valorParseadob = Double.parseDouble(valorb);

        switch (identificador){
            case "1":
                double resultado1 = calc.somar(valorParseadoA, valorParseadob);
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado1, "A Soma dos valores", JOptionPane.QUESTION_MESSAGE);
                break;
            case "2":
                double resultado2 = calc.subtrair(valorParseadoA, valorParseadob);
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado2, "A Subtração dos valores", JOptionPane.QUESTION_MESSAGE);
                break;
            case "3":
                double resultado3 = calc.multiplicar(valorParseadoA, valorParseadob);
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado3, "A Multiplicação dos valores", JOptionPane.QUESTION_MESSAGE);
                break;
            case "4":
                double resultado4 = calc.dividir(valorParseadoA, valorParseadob);
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado4, "A Divisão dos valores", JOptionPane.QUESTION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "valor Invalido","Alerta", JOptionPane.INFORMATION_MESSAGE);

        }

        System.exit(0);






    }


}
