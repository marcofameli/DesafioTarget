package org.example;

import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Iterator;

public class Desafio3 {

    public static void main(String[] args) {
        String jsonFilePath = "C:\\Users\\MARQUOLA\\Desktop\\develops\\TargetDesafio\\src\\faturamento.json";

        try {

            String content = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
            JSONObject jsonObject = new JSONObject(content);
            JSONObject faturamento = jsonObject.getJSONObject("faturamento");

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0;
            int diasComFaturamento = 0;


            Iterator<String> keys = faturamento.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                double valor = faturamento.getDouble(key);


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


            double mediaFaturamento = somaFaturamento / diasComFaturamento;


            int diasAcimaDaMedia = 0;
            keys = faturamento.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                double valor = faturamento.getDouble(key);
                if (valor > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }


            System.out.println("Menor Faturamento: " + menorFaturamento);
            System.out.println("Maior Faturamento: " + maiorFaturamento);
            System.out.println("Média de Faturamento: " + mediaFaturamento);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
