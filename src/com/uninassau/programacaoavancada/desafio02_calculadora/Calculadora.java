package com.uninassau.programacaoavancada.desafio02_calculadora;

public class Calculadora {
    public double somar(double x, double y){
        return x + y;
    }

    public double subtrair(double x, double y){
        return x - y;
    }

    public double multiplicar(double x, double y){
        return x * y;
    }

    public double dividir(double x, double y){
        if(y == 0){
            System.out.println("Divisor inválido");
            return 0;
        }

        return x / y;
    }

}
