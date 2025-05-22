package com.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Detergente> detergentes = new ArrayList<>();
    static List<Cereales> cereales = new ArrayList<>();
    static List<Vino> vinos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String marca;
        float precio;
        float descuento;
        String tipoCereal;
        String tipoVino;
        int gradoAlcohol;

        int option;
        do {
            System.out.println("\n" + Color.VERDE.getCode() + "Menú:" + Color.RESET.getCode());
            System.out.println("1. Crear detergente");
            System.out.println("2. Crear cereales");
            System.out.println("3. Crear vino");
            System.out.println("4. Listar todos los productos");
            System.out.println("5. Sumar calorías");
            System.out.println(Color.ROJO.getCode() + "0. Salir" + Color.RESET.getCode());
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
                    System.out.println("Instanciando Cereales:\n " + cereal);
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
                    listarDetergentes();

                    listarCereales();

                    listarVinos();
                    break;

                case 5:
                    menuCalorias();
                    break;

                case 0:
                    System.out.println(Color.AMARILLO.getCode() + "Saliendo..." + Color.RESET.getCode());
                    break;

                default:
                    System.out.println(Color.AMARILLO.getCode() + "Opción no válida." + Color.RESET.getCode());
            }
        } while (option != 0);

        sc.close();
    }

    public static void menuCalorias() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int caloriasTotales = 0;

        do {
            System.out.println("\n1. Listar cereales");
            System.out.println("2. Listar vinos");
            System.out.println(Color.ROJO.getCode() + "3. Para de añadir" + Color.RESET.getCode());
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    listarCereales();

                    caloriasTotales += sumarCalorias();
                    break;
            
                case 2:
                    listarVinos();

                    caloriasTotales += sumarCalorias();
                    break;

                case 3:
                    System.out.println(Color.AMARILLO.getCode() + "Volviendo..." + Color.RESET.getCode());
                    break;

                default:
                    System.out.println(Color.AMARILLO.getCode() + "Opción no válida." + Color.RESET.getCode());
            }
        } while (opcion != 3);
        
        System.out.println(Color.AMARILLO.getCode() + "Calorías totales: " + caloriasTotales +  Color.RESET.getCode());
    }

    public static void listarDetergentes() {
        int index = 0;

        System.out.println(Color.VERDE.getCode() + "Detergentes: " + Color.RESET.getCode());
        for (Detergente deterL : detergentes) {
            System.out.println(index + ". " + deterL.toString());
            index++;
        }
    }

    public static void listarCereales() {
        int index = 0;

        System.out.println(Color.VERDE.getCode() + "Cereales: " + Color.RESET.getCode());
        for (Cereales cereaL : cereales) {
            System.out.println(index + ". " + cereaL.toString());
            index++;
        }
    }

    public static void listarVinos() {
        int index = 0;

        System.out.println(Color.VERDE.getCode() + "Vinos: " + Color.RESET.getCode());
        for (Vino vinoL : vinos) {
            System.out.println(index + ". " + vinoL.toString());
            index++;
        }
    }

    public static int sumarCalorias() {
        Scanner sc = new Scanner(System.in);
        int seleccion;

        System.out.println("Artículo a añadir (Índice): ");
        seleccion = sc.nextInt();
        sc.nextLine();

        return cereales.get(seleccion).getCalorias();
    }
}