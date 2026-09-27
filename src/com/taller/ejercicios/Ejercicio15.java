package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio15 implements IEjercicio{
    // Escribe un algoritmo que lea un número y determine si es par o impar.
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to determine whether it is odd or even: ");
        int num = input.nextInt();
        if (num%2==0){
            System.out.println("The number "+num+" is even");
        } else {
            System.out.println("The number "+num+" is odd");
        }
    }
}
