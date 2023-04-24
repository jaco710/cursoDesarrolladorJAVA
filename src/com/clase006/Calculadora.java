package com.clase006;

import java.util.Scanner;

public class Calculadora {

    public double sumar(double unNumero, double otroNumero) {
        return unNumero + otroNumero;
    }

    public double restar(double unNumero, double otroNumero) {
        return unNumero - otroNumero;
    }

    public double multiplicar(double unNumero, double otroNumero) {
        return unNumero * otroNumero;
    }

    public double dividir(double unNumero, double otroNumero) {
        if (otroNumero == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return unNumero / otroNumero;
    }

    public void realizarOperacion() {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        System.out.println("Bienvenido a la Calculadora");

        do {
            System.out.print("Ingresa un número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingresa otro número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Ingresa la operación a realizar (+, -, *, /): ");
            char operacion = scanner.next().charAt(0);

            double resultado = 0;

            switch (operacion) {
                case '+':
                    resultado = sumar(num1, num2);
                    break;
                case '-':
                    resultado = restar(num1, num2);
                    break;
                case '*':
                    resultado = multiplicar(num1, num2);
                    break;
                case '/':
                    resultado = dividir(num1, num2);
                    break;
                default:
                    System.out.println("Operación no válida.");
                    return;
            }

            if (resultado != 0) {
                System.out.println("El resultado de la operación es: " + resultado);
            }

            System.out.println("¿Desea realizar otra operación? (s/n):");
            char continuarChar = scanner.next().charAt(0);
            continuar = (continuarChar == 's' || continuarChar == 'S');

        } while (continuar);

        System.out.println("Calculadora finalizada.");
    }
}
