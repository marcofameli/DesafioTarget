package org.example;

public class Desafio4 {

    public static void main(String[] args) {

        double[] faturamentos = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};

        double faturamentoTotal = 0;
        for (double faturamento : faturamentos) {
            faturamentoTotal += faturamento;
        }

        String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};
        for (int i = 0; i < faturamentos.length; i++) {
            double percentual = (faturamentos[i] / faturamentoTotal) * 100;
            System.out.printf("Percentual %s: %.2f%%%n", estados[i], percentual);
        }
    }
}