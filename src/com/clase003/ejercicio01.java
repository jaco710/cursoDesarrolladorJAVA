package com.clase003;

public class ejercicio01 {
    public static void main(String[] args) {
        int[] numeros = new int[15];


        System.out.println("Metodo del punto A: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nMetodo del punto B: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 5;
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nMetodo del punto C: ");
        int[] diezNumeros = new int[10];
        for (int i = 0; i < diezNumeros.length; i++) {
            if (i == 5) {
                 diezNumeros[i] = i / 3;
            } else {
                diezNumeros[i] = i + 1;
            }
            System.out.print(diezNumeros[i] + " ");
        }

        System.out.println("\n\nMetodo del punto D: ");
        String[] prductosDeportivos = {
                "camiseta de Futbol",
                "chomba padle",
                "short rugby",
                "pelota basket",
                "mancuernas hexagonal 3kg"
        };
        int[] precios = {10220, 7990, 8990, 3450, 3390};
        String[] listadoProductosPrecios = new String[5];
        for (int i = 0; i < listadoProductosPrecios.length; i++) {
            System.out.println(
                    listadoProductosPrecios[i] = prductosDeportivos[i] + " = $" + precios[i]);
        }

        System.out.println("\nMetodo del punto E: ");
        String[] cursos = {"Programacion", "Excel", "Ingles"};
        double[] promedios = {6.6, 8, 7.5};
        for (int i = 0; i < cursos.length; i++) {
            System.out.println("Promedio del curso de " + cursos[i] + ": " + promedios[i]);
        }
    }
}

