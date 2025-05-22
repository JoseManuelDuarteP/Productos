package com.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Detergente> detergentes = new ArrayList<>();
        List<Cereales> cereales = new ArrayList<>();
        List<Vino> vinos = new ArrayList<>();

        String marca;
        float precio;
        float descuento;
        String tipoCereal;
        String tipoVino;
        int gradoAlcohol;

        int option;
        do {
            System.out.println("Menú:");
            System.out.println("1. Crear detergente");
            System.out.println("2. Crear cereales");
            System.out.println("3. Crear vino");
            System.out.println("4. Listar todos los productos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Ingrese la marca del detergente: ");
                    marca = sc.nextLine();
                    System.out.println("Ingrese el precio del detergente: ");
                    precio = sc.nextFloat();
                    System.out.println("Ingrese el descuento del detergente: ");
                    descuento = sc.nextFloat();

                    Detergente detergente = new Detergente(marca, precio, descuento);
                    detergentes.add(detergente);
                    System.out.println("Instanciado Detergente:\n " + detergente);
                    break;

                case 2:
                    System.out.println("Ingrese la marca de los cereales: ");
                    marca = sc.nextLine();
                    System.out.println("Ingrese el precio de los cereales: ");
                    precio = sc.nextFloat();
                    sc.nextLine();
                    System.out.println("Ingrese el tipo de creal (espelta, maíz, trigo...): ");
                    tipoCereal = sc.nextLine();

                    Cereales cereal = new Cereales(marca, precio, tipoCereal);
                    cereales.add(cereal);
                    System.out.println("Instanciando Cereales:\n " + cereales);
                    break;

                case 3:
                    System.out.println("Ingrese la marca del vino: ");
                    marca = sc.nextLine();
                    System.out.println("Ingrese el precio del vino: ");
                    precio = sc.nextFloat();
                    System.out.println("Ingrese el tipo de vino (tinto, blanco, rosado...): ");
                    sc.nextLine();
                    tipoVino = sc.nextLine();
                    System.out.println("Ingrese el grado de alcohol del vino: ");
                    gradoAlcohol = sc.nextInt();

                    Vino vino = new Vino(marca, tipoVino, gradoAlcohol, precio);
                    vinos.add(vino);
                    System.out.println("Instanciado Vino:\n " + vino);
                    break;

                case 4:
                    System.out.println("Detergentes: ");
                    for (Detergente detergenteL : detergentes) {
                        System.out.println(detergenteL);
                    }

                    System.out.println("Cereales: ");
                    for (Cereales cereaL : cereales) {
                        System.out.println(cereaL);
                    }

                    System.out.println("Vinos: ");
                    for (Vino vinoL : vinos) {
                        System.out.println(vinoL);
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 0);
    }
}