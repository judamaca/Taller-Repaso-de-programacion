package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;


public class Ejercicio37 implements IEjercicio {
    //  Escribe un algoritmo que imprima el siguiente patrón:
    //1
    //12
    //123
    //1234
    //12345
    //123456
    //1234567
    //12345678
    //123456789
    //12345678910

    @Override
    public void ejecutar() {
        String x = "";
        for (int i = 1; i < 11; i++) {
            x = x+i;
            System.out.println(x);
        }
    }
}