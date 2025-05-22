package com.example;

public enum Color {
    RESET("\u001B[0m"),
    ROJO("\u001B[31m"),
    AMARILLO("\u001B[33m"),
    VERDE("\u001B[32m");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getCode() {
        return this.color;
    }
}
