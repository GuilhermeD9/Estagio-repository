package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Faturamento da Distribuidora:");

        //Lista com a sigla e valor
        Map<String, Double> listaEstados = new HashMap<>();
        listaEstados.put("SP", 67836.43);
        listaEstados.put("RJ", 36678.66);
        listaEstados.put("MG", 29229.88);
        listaEstados.put("ES", 27165.48);
        listaEstados.put("Outros", 19849.53);

        //Calculo valor total
        double valorTotal = 0.0;
        for (double valor : listaEstados.values()) {
            valorTotal += valor;
        }

        //For para mostrar o resultado :)
        for (Map.Entry<String, Double> entry : listaEstados.entrySet()) {
            String estado = entry.getKey();
            double valor = entry.getValue();
            double percentual = (valor / valorTotal) * 100;
            System.out.printf("Estado: %s - Valor: R$%.2f - Percentual: %.2f%%%n", estado, valor, percentual);
        }
        System.out.printf("Valor total da distribuidora: R$%.2f%n", valorTotal);
    }
}