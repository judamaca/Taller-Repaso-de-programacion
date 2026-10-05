package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Locale;
import java.util.Scanner;


public class Ejercicio36 implements IEjercicio {
    // Escribe un algoritmo que convierta un número binario a decimal.

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the binary number to convert to decimal: ");
        String binario = input.next().trim();

        double resultadoDecimal = 0.0;

        // Separar la parte entera de la fraccionaria
        String parteEntera;
        String parteDecimal = "";

        if (binario.contains(".")) {
            String[] partes = binario.split("\\.");
            parteEntera = partes[0];
            if (partes.length > 1) {
                parteDecimal = partes[1];
            }
        } else {
            parteEntera = binario;
        }

        // 1. Procesar la parte entera (de derecha a izquierda)
        int exponenteEntero = 0;
        for (int i = parteEntera.length() - 1; i >= 0; i--) {
            char bit = parteEntera.charAt(i);
            if (bit == '1') {
                resultadoDecimal += Math.pow(2, exponenteEntero);
            }
            exponenteEntero++;
        }

        // 2. Procesar la parte decimal (de izquierda a derecha)
        for (int i = 0; i < parteDecimal.length(); i++) {
            char bit = parteDecimal.charAt(i);
            if (bit == '1') {
                // exponente negativo: i = 0 -> 2^-1, i = 1 -> 2^-2, etc.
                resultadoDecimal += Math.pow(2, -(i + 1));
            }
        }

        System.out.println("The decimal number is: " + resultadoDecimal);
    }
}