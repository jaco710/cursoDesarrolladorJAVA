package com.clase007;

public class Descuento extends Producto {
    private double porcentaje;

    public Descuento(String nombre, double precio, double porcentaje) {
        super(nombre, precio);
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public double calcularDescuento(double monto) {
        return monto * porcentaje / 100;
    }
}