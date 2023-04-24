package com.clase008;

import java.util.Scanner;
import com.clase007.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carrito carrito = new Carrito();

        System.out.println("Ingrese los productos a agregar al carrito (cantidad, precio unitario y nombre del producto separados por espacios), o escriba 'fin' para terminar:");

        while (true) {
            try {
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("fin")) {
                    break;
                }

                String[] detallesProducto = input.split(" ");

                if (detallesProducto.length != 3) {
                    throw new Exception("Formato de ingreso incorrecto. Ingrese la cantidad, precio y nombre del producto separados por espacios.");
                }

                int cantidad = Integer.parseInt(detallesProducto[0]);
                if (cantidad <= 0) {
                    throw new Exception("La cantidad debe ser mayor que cero.");
                }

                double precio = Double.parseDouble(detallesProducto[1]);
                if (precio <= 0) {
                    throw new Exception("El precio debe ser mayor que cero.");
                }

                String nombre = detallesProducto[2];
                if (nombre.matches(".*\\d.*")) {
                    throw new Exception("El nombre no debe contener números.");
                }

                Producto producto = new Producto(nombre, precio);
                carrito.agregarProducto(producto, cantidad);

            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        double precioTotal = carrito.getTotal();

        System.out.println("El precio total del carrito es: " + precioTotal);
    }
}