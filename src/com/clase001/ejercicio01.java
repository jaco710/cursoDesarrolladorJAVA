package com.clase001;

import java.util.Scanner;

public class ejercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejercicio Nº1");
        System.out.print("Imprimir números del 1 al 100 usando un while, un for, do while y for con resultado doble");

        System.out.print("\nPresiona Enter para empezar con el ciclo de while...");
        scanner.nextLine();
        int n = 1;
        while (n < 101) {
            System.out.print(n + ", ");
            n++;
        }

        System.out.println("\nTermino el ciclo de while");
        System.out.print("\nPresiona Enter para continuar con el ciclo de for...");
        scanner.nextLine();
        for (int i= 1; i < 101; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\nTermino el ciclo de while");
        System.out.print("\nPresiona Enter para continuar con el ciclo de do while...");
        scanner.nextLine();
        int m = 1;
        do {
            System.out.print(m + ", ");
            m++;
        } while (m < 101);

        System.out.println("\nTermino el ciclo de while");
        System.out.print("\nPresiona Enter para continuar con el ciclo de for...");
        scanner.nextLine();
        for (int i= 1; i < 101; i = i + 2) {
            System.out.print(i + ", ");
        }
        System.out.print("\n\nEl programa termino con excito");
    }
}
