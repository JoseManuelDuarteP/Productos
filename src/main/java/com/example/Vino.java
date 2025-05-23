package com.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;

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
                + ", calorias= " + calorias + ", fechaCaducidad= " + fechaCaducidad + "]";
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
    public String getCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public int getCalorias() {
        return calorias;
    }

    @Override
    public String setCaducidadAut() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, 5); // La caducidad por defecto de los vinos será de 5 años hasta que se cambie

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormato = formato.format(cal.getTime());

        return fechaFormato;
    }

    @Override
    public void setCaducidad(String fechaCaducidad) {
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
