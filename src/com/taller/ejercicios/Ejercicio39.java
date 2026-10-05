package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz


public class Ejercicio39 implements IEjercicio {
    // Escribe un algoritmo que dada el número de filas, imprima el siguiente patrón de elementos
    //en forma de triángulo invertido. Por ejemplo 6 filas:
    //******
    //*****
    //****
    //***
    //**
    //*

    @Override
    public void ejecutar() {

        for (int i = 10; i >= 1; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}