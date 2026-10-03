package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner


public class Ejercicio29 implements IEjercicio {
    //   Escriba un algoritmo que dada una palabra diga si es palíndromo o no. Escribelo como una
    //función llamada esPalindromo que reciba una función la palabra y devuelva un booleano
    //true o false.

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the word to verify it: ");
        String word = input.nextLine();

        boolean isPalindrome = isPalindrome(word);

        if (isPalindrome) {
            System.out.println("The word is palindrome.");
        } else {
            System.out.println("The word is not palindrome.");
        }
    }

    boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }

        String reversed = "";
        for (int i = word.length()-1; i >= 0; i--) {
            word = word.toLowerCase();
            reversed += word.charAt(i);
        }

        if ( reversed.equals(word) ) {
            return true;
        } else {
            return false;
        }
    }
}