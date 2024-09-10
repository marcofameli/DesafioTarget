package org.example;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d ", fib(i));
        }
        System.out.println();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        if (isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static int fib(int n) {
        if (n == 1)
            return 0;

        if (n == 2)
            return 1;

        int F = 0, F1 = 0, F2 = 1;
        for (int i = 3; i <= n; i++) {
            F = F1 + F2;
            F1 = F2;
            F2 = F;
        }

        return F;
    }

    public static boolean isFibonacci(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int F1 = 0, F2 = 1, F = 0;
        while (F < n) {
            F = F1 + F2;
            F1 = F2;
            F2 = F;
        }

        return F == n;
    }
}
