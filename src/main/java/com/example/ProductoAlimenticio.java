package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class ProductoAlimenticio implements IAlimento {
    protected int calorias;
    protected Date fechaCaducidad;

    ProductoAlimenticio(int calorias, Date fechaCaducidad) {
        this.calorias = calorias;
        this.fechaCaducidad = fechaCaducidad;
    }

    protected int setCaloriasAut() {
        return 0;
    }

    public void setCalorias(int calorias) {

    }

    protected String formatearFechaCad(Date fechaCaducidad) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaConFormato;

        return fechaConFormato = formato.format(fechaCaducidad);
    }
}
