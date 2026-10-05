package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz


public class Ejercicio38 implements IEjercicio {
    // Escribe un algoritmo que, dada el número de filas, imprima el siguiente patrón de elementos
    //en forma de triángulo invertido. Por ejemplo 6 filas:
    //@
    //@@
    //@@@
    //@@@@
    //@@@@@
    //@@@@@@

    @Override
    public void ejecutar() {
        String x = "";
        for (int i = 1; i < 11; i++) {
            x = x + "@";
            System.out.println(x);
        }
    }
}