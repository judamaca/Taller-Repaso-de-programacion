package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz


public class Ejercicio32 implements IEjercicio {
    //     Escribe un algoritmo que imprima los 10 primeros números impares naturales.

    @Override
    public void ejecutar() {
        System.out.println("The first 10 natural numbers are: ");
        int counter = 0;

        for  (int i = 1; counter < 10; i+=2) {
            System.out.println(i);
            counter++;
        }
    }
}