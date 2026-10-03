package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner


public class Ejercicio28 implements IEjercicio {
    //   Realizar un algoritmo que, dado dos textos, determine si el segundo contiene el primero
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first text (substring to search for): ");
        String firstText = input.nextLine();

        System.out.print("Enter the second text (main text): ");
        String secondText = input.nextLine();

        // Check if the second text contains the first one
        boolean containsSubstring = containsSubstring(firstText, secondText);

        if (containsSubstring) {
            System.out.println("Result: The second text DOES contain the first text.");
        } else {
            System.out.println("Result: The second text DOES NOT contain the first text.");
        }
    }
    /* Determines whether the main text contains the given substring.
     Converts both strings to lowercase for case-insensitive matching.
     */
    private boolean containsSubstring(String substring, String mainText) {
        if (substring == null || mainText == null) {
            return false;
        }
        // Perform case-insensitive search using .contains()
        return mainText.toLowerCase().contains(substring.toLowerCase());
    }
}