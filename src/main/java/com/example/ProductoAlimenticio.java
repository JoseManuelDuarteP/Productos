package com.example;

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
}
