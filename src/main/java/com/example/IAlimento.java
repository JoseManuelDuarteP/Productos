package com.example;

import java.util.Date;

public interface IAlimento {

    void setCaducidad(Date fechaCaducidad);

    Date getCaducidad();

    int getCalorias();

}
