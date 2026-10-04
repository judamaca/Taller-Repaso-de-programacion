package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner


public class Ejercicio31 implements IEjercicio {
    //     Escribe un algoritmo que imprima los 10 primeros números naturales.

    @Override
    public void ejecutar() {
        System.out.println("The first 10 natural numbers are: ");

        for  (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}