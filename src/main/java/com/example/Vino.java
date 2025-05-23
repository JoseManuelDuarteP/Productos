package com.example;

import java.util.Calendar;
import java.util.Date;

public class Vino extends ProductoAlimenticio implements ILiquido,IDescuento {
    private String marca;
    private String tipoVino;
    private float gradoAlcohol;
    private float precio;
    private String tipoEnvase;
    private float volumen;
    private float descuento;

    public Vino(String marca, String tipoVino, float gradoAlcohol, float precio) {
        super(0, null);
        this.marca = marca;
        this.tipoVino = tipoVino;
        this.gradoAlcohol = gradoAlcohol;
        this.precio = precio;
        this.calorias = setCaloriasAut();
        this.fechaCaducidad = setCaducidadAut();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public float getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(float gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Vino [marca= " + marca + ", tipoVino= " + tipoVino + ", gradoAlcohol= " + gradoAlcohol + ", precio= "
                + precio + ", tipoEnvase= " + tipoEnvase + ", volumen= " + volumen + ", descuento= " + descuento
                + ", calorias= " + calorias + ", fechaCaducidad= " + formatearFechaCad(fechaCaducidad) + "]";
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    @Override
    public float getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
        
    }

    @Override
    public void setVolumen(float volumen) {
        this.volumen = volumen;
        
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

    @Override
    public Date getCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public int getCalorias() {
        return calorias;
    }

    @Override
    public Date setCaducidadAut() {
        Date fechaActual;
        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.YEAR, 5); // Por defecto la caducidad será de 5 años

        return fechaActual = cal.getTime();
    }

    @Override
    public void setCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    
    @Override
    protected int setCaloriasAut() {
        return (int) gradoAlcohol*10;
    }
}
