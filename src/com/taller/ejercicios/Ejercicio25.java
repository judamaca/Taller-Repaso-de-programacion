package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

import static java.awt.SystemColor.text;

public class Ejercicio25 implements IEjercicio{
    // Escriba un algoritmo que, dado un texto largo, lo invierta. Escribalo como una función
    //llamada invertirTexto que reciba un parámetro que es el texto original y devuelva el texto
    //invertido.

    @Override
    public void ejecutar() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text to reverse it: ");
        String xtext = input.nextLine();
        System.out.println("The text is: " + reverseText(xtext));

    }
    private String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
