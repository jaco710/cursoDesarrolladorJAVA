package com.clase004;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class ejercicio01 {
    public static void main(String[] args) {

        datosUsuario();
        tipoEdad();
        compraSupermercado();

    }
    public static void datosUsuario() {
        System.out.println("\nPunto 1 - Trabajo practico 4");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("Usuario: " + nombre + apellido + " Edad: " + edad);
    }
    public static void tipoEdad() {
        System.out.println("\nPunto 2 - Trabajo practico 4");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        String tipoEdad = "";
        if (edad >= 18) {
            tipoEdad = "mayor de edad";
        } else {
            tipoEdad = "menor de edad";
        }
        System.out.println("El usuario es " + tipoEdad);
    }
    public static void compraSupermercado() {
        System.out.println("\nPunto 3 - Trabajo practico 4");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el producto: ");
        String producto = sc.next();
        System.out.print("Ingrese el precio: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();

        double totalSinDescuento = precio * cantidad;

        double totalConDescuento = totalSinDescuento;
        if (totalSinDescuento > 1000 && (producto.equals("frutas") || producto.equals("verduras") || producto.equals("gaseosas"))) {
            totalConDescuento = totalSinDescuento * 0.8;
        }

        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Producto: " + producto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        if (totalConDescuento < totalSinDescuento) {
            double descuento = totalSinDescuento - totalConDescuento;
            System.out.println("Descuento: " + descuento);
        }
        System.out.println("Total a pagar: " + totalConDescuento);
    }
}
