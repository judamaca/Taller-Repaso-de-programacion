package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner


public class Ejercicio26 implements IEjercicio {
    // Escriba un algoritmo que, dado un texto largo, lo invierta. Escribalo como una función
    //llamada invertirTexto que reciba un parámetro que es el texto original y devuelva el texto
    //invertido.

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text to rewrite it: ");
        String xtext = input.nextLine();
        System.out.println("The text is: " + capitalizeFullText(xtext));

    }

    public String capitalizeFullText(String text) {
        if (text == null || text.trim().isEmpty()) {
            return text;
        }

        // 1. Dividimos el texto en un arreglo de palabras separadas por espacios
        String[] words = text.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        // 2. Recorremos cada palabra
        for (String word : words) {
            if (!word.isEmpty()) {
                // Primera letra a mayúscula + el resto en minúscula
                String capitalizedWord = word.substring(0, 1).toUpperCase()
                        + word.substring(1);

                // Añadimos la palabra y un espacio
                result.append(capitalizedWord).append(" ");
            }
        }

        // 3. Devolvemos el texto quitando el último espacio sobrante
        return result.toString().trim();
    }
}