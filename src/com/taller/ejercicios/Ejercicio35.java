package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz

import java.util.Scanner;


public class Ejercicio35 implements IEjercicio {
    // Escribe un algoritmo que convierta un número binario a decimal.

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a the number to convert it to binary: ");
        float num = input.nextFloat();
        float numInt = (int) num;
        float residuo = 0;
        StringBuilder bin = new StringBuilder();

        do {
            residuo = numInt % 2;
            int residuoAux = (int) residuo;
            bin.insert(0, residuoAux);
            numInt = numInt/2;
        } while (num >= 1);

        System.out.println("The binary number is "+bin);
    }
}