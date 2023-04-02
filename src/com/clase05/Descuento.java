package com.clase05;

public class Descuento {
    private double porcentaje;

    public Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public double calcularDescuento(double monto) {
        return monto * porcentaje / 100;
    }
}
