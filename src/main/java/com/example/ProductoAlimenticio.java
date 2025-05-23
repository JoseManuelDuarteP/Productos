package com.example;

public abstract class ProductoAlimenticio implements IAlimento {
    protected int calorias;
    protected String fechaCaducidad;

    ProductoAlimenticio(int calorias, String fechaCaducidad) {
        this.calorias = calorias;
        this.fechaCaducidad = fechaCaducidad;
    }

    protected int setCaloriasAut() {
        return 0;
    }

    public void setCalorias(int calorias) {

    }
}
