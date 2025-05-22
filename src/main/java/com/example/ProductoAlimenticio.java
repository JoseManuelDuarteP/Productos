package com.example;

public abstract class ProductoAlimenticio implements IAlimento {
    public int calorias;

    ProductoAlimenticio(int calorias) {
        this.calorias = calorias;
    }

    public int setCalorias() {
        return 0;
    }
}
