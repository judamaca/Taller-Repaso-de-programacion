package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Locale;
import java.util.Scanner;


public class Ejercicio35 implements IEjercicio {
    // Escribe un algoritmo que convierta un número binario a decimal.

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter a the number to convert it to binary: ");
        float originalNum = input.nextFloat();
        int intPart = (int) originalNum;
        float decPart = originalNum - intPart;

        StringBuilder bin = new StringBuilder();

        if (intPart == 0) {
            bin.append(0);
        } else {
            while (intPart > 0) {
                int waste = intPart % 2;
                bin.insert(0, waste);
                intPart /= 2;
            }
        }

        if (decPart > 0) {
            bin.append(".");
            int i = 0;

            while (decPart > 0 && i < 10) {
                decPart *= 2;
                int bit = (int) decPart;
                bin.append(bit);
                decPart -= bit;
                i++;
            }
        }

        System.out.println("The binary number is: " + bin);
    }
}