package com.clase007;

public class ItemCarrito extends Producto {
    private int cantidad;

    public ItemCarrito(String nombre, double precio, int cantidad) {
        super(nombre, precio);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubtotal() {
        return getPrecio() * cantidad;
    }
}
