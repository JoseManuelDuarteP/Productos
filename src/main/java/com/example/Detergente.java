package com.example;

public class Detergente implements IDescuento {
    private String marca;
    private float precio;
    private float descuento;

    public Detergente(String marca, float precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public Detergente(String marca, float precio, float descuento) { //Constructor para crear instancia con descuento al instante
        this.marca = marca;
        this.precio = precio;
        this.descuento = descuento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Detergente [marca= " + marca + ", precio= " + precio + ", descuento= " + descuento + "]";
    }

    @Override
    public float getDescuento() {
        return descuento;
    }

    @Override
    public float getPrecioDescuento() {
        return precio - descuento;
    }

    @Override
    public void setDescuento(float descuento) {
        this.descuento = descuento;
        
    }
}
