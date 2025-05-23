package com.example;

import java.util.Date;

public class Cereales extends ProductoAlimenticio {
    private String marca;
    private float precio;
    private String tipoCereal;

    public Cereales(String marca, float precio, String tipoCereal) {
        super(0, null);
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
        this.calorias = setCalorias();
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

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    @Override
    public String toString() {
        return "Cereales [marca= " + marca + ", precio= " + precio + ", tipoCereal= " + tipoCereal + ", calorias= "
                + calorias + ", fechaCaducidad= " + fechaCaducidad + "]";
    }

    @Override
    public Date getCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public int getCalorias() {
        return calorias;
    }

    @Override
    public void setCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
    @Override
    protected int setCalorias() {
        if (this.tipoCereal.equalsIgnoreCase("espelta")) {
            return 5;
        } else if (this.tipoCereal.equalsIgnoreCase("maíz")) {
            return 8;
        } else if (this.tipoCereal.equalsIgnoreCase("trigo")) {
            return 12;
        } else if (this.tipoCereal.isEmpty()) {
            return 0;
        } else {
            return 15;
        }
    }
}
