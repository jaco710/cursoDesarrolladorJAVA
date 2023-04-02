package com.clase05;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<ItemCarrito> items;

    public Carrito() {
        items = new ArrayList<>();
    }

    public void agregarItem(Producto producto, int cantidad) {
        ItemCarrito item = new ItemCarrito(producto, cantidad);
        items.add(item);
    }

    public List<ItemCarrito> getItems() {
        return items;
    }

    public double getTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.getSubtotal();
        }
        return total;
    }
}
