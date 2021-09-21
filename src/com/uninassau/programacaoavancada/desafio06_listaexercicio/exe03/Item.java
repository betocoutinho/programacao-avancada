package com.uninassau.programacaoavancada.desafio06_listaexercicio.exe03;

public class Item {
    private int numeroDoItem;
    private String descricaoDoItem;
    private double quantidadeComprada;
    private double preco;

    public Item(int numeroDoItem, String descricaoDoItem, double quantidadeComprada, double preco) {
        this.numeroDoItem = numeroDoItem;
        this.descricaoDoItem = descricaoDoItem;

        if (quantidadeComprada < 0){
            this.quantidadeComprada = 0;
        }else {
            this.quantidadeComprada = quantidadeComprada;
        }

        if (preco < 0){
            this.preco = 0;
        }else {
            this.preco = preco;
        }

    }

    public int getNumeroDoItem() {
        return numeroDoItem;
    }

    public void setNumeroDoItem(int numeroDoItem) {
        this.numeroDoItem = numeroDoItem;
    }

    public String getDescricaoDoItem() {
        return descricaoDoItem;
    }

    public void setDescricaoDoItem(String descricaoDoItem) {
        this.descricaoDoItem = descricaoDoItem;
    }

    public double getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(double quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "COD=" + numeroDoItem +
                ", Descrição=' " + descricaoDoItem + '\'' +
                ", Quantidade= " + quantidadeComprada +
                ", Preco= " + preco;
    }
}
