package com.example;

import java.util.Date;

public interface IAlimento {

    void setCaducidad(Date fechaCaducidad);

    Date setCaducidadAut();

    Date getCaducidad();

    int getCalorias();

}
