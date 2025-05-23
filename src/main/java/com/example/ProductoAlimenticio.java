package com.example;

import java.util.Date;

public abstract class ProductoAlimenticio implements IAlimento {
    protected int calorias;
    protected Date fechaCaducidad;

    ProductoAlimenticio(int calorias, Date fechaCaducidad) {
        this.calorias = calorias;
        this.fechaCaducidad = fechaCaducidad;
    }

    public int setCalorias() {
        return 0;
    }
}
