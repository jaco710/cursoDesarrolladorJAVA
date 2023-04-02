package com.clase05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrito carrito = new Carrito();

        System.out.println("Ingrese los productos y cantidades (formato: cantidad precio_unitario producto):");
        while (scanner.hasNextInt()) {
            int cantidad = scanner.nextInt();
            double precioUnitario = scanner.nextDouble();
            String nombre = scanner.nextLine().trim();
            Producto producto = new Producto(nombre, precioUnitario);
            carrito.agregarItem(producto, cantidad);
        }

        double precio = carrito.getTotal();
        System.out.println("El precio total del carrito es: " + precio);
    }
}
