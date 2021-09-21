package com.uninassau.programacaoavancada.desafio06_listaexercicio.exe03;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<Item> items = new ArrayList<>();


    public double getInvoiceAmount(){
        double amount = items.stream()
                .mapToDouble(item -> item.getPreco() * item.getQuantidadeComprada())
                .sum();
        return amount;
    }

   public String print(){
        StringBuilder sb = new StringBuilder();

       for (Item item :
               this.items) {
           sb.append(item.toString()).append("\n");
       }

       return sb.toString();
   }

    public List<Item> getItems() {
        return items;
    }
}
