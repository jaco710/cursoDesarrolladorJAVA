package com.clase007;

import java.util.Scanner;

import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carrito carrito = new Carrito();

        System.out.println("Ingrese los productos a agregar al carrito (cantidad, precio unitario y nombre del producto separados por espacios), o escriba 'fin' para terminar:");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("fin")) {
                break;
            }

            String[] detallesProducto = input.split(" ");
            int cantidad = Integer.parseInt(detallesProducto[0]);
            double precio = Double.parseDouble(detallesProducto[1]);
            String nombre = detallesProducto[2];

            Producto producto = new Producto(nombre, precio);
            carrito.agregarProducto(producto, cantidad);
        }

        double precioTotal = carrito.getTotal();

        System.out.println("El precio total del carrito es: " + precioTotal);
    }
}
