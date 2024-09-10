package org.example;

import java.util.Scanner;

public class Desafio5 {


    public static String inverterString(String s) {
        String stringInvertida = "";


        for (int i = s.length() - 1; i >= 0; i--) {
            stringInvertida += s.charAt(i);
        }

        return stringInvertida;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma string para inverter: ");
        String entrada = scanner.nextLine();

        String resultado = inverterString(entrada);
        System.out.println("String invertida: " + resultado);

        scanner.close(); // Fecha o scanner
    }
}
