package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Faturamento {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        //Leitura do Json
        try {
            List<Dados> dadosList = mapper.readValue(new File("C:\\Users\\guilh\\Documents\\Codigos_vscode\\java\\Estagio-repository\\Questao03\\src\\main\\java\\org\\example\\dados.json"),
                    new TypeReference<List<Dados>>() {});

            //Variáveis
            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0.0;
            int diasComFaturamento = 0;

            //Cálculo do menor, maior e soma dos faturamentos
            for (Dados d : dadosList) {
                double valor = d.getValor();
                if (valor > 0) {
                    if (valor < menorFaturamento) {
                        menorFaturamento = valor;
                    }
                    if (valor > maiorFaturamento) {
                        maiorFaturamento = valor;
                    }
                    somaFaturamento += valor;
                    diasComFaturamento++;
                }
            }

            //Média do mês
            double mediaMensal = somaFaturamento / diasComFaturamento;

            //Dias acima da média
            int diasAcimaDaMedia = 0;
            for (Dados d : dadosList) {
                if (d.getValor() > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }

            //RESULTADOS
            System.out.println("Menor faturamento: " + menorFaturamento);
            System.out.println("Maior faturamento: " + maiorFaturamento);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);


        } catch (IOException e) {
            System.out.println("Algo deu errado!");
        }
    }
}
