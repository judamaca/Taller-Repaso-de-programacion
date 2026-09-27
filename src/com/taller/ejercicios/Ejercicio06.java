package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio06 implements IEjercicio{
    // Ejercicio06: Escribe un algoritmo que lea un número decimal e imprima su parte entera y su parte
    //decimal por aparte.
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal number using a comma: ");
        double n1 = input.nextDouble();
        System.out.println("The integer part of the numer is: " + (int) n1);
        System.out.println("The decimal part of the numer is: " + (n1 - (int) n1));



    }
}
