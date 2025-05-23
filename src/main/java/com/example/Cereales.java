package com.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cereales extends ProductoAlimenticio {
    private String marca;
    private float precio;
    private String tipoCereal;

    public Cereales(String marca, float precio, String tipoCereal) {
        super(0, null);
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
        this.calorias = setCaloriasAut();
        this.fechaCaducidad = setCaducidadAut();
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
        cal.add(Calendar.YEAR, 1); // La caducidad por defecto de los cereales será de 1 año hasta que se cambie

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
