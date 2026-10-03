package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner


public class Ejercicio27 implements IEjercicio {
    //  Escriba un algoritmo que, dado un texto largo, determine la penúltima palabra del texto

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text to find the second-to-last word: ");
        String text = input.nextLine();


        if (text == null || text.trim().isEmpty()) {
            System.out.println("No text found");
        }

        // 1. Limpiamos espacios a los lados y dividimos el texto por espacios
        String[] words = text.trim().split("\\s+");

        // 2. Si el texto tiene al menos 2 palabras, la penúltima está en la posición (longitud - 2)
        if (words.length >= 2) {
            System.out.println("The word is: " + words[words.length - 2]);
        } else {
            System.out.println("The text doesn't have enough words");
        }
    }
}