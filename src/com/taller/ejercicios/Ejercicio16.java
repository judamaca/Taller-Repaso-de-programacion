package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio16 implements IEjercicio{
    //  Escribe un algoritmo que lea un número y determine si es positivo o negativo.
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to determine whether it is positive or negative: ");
        int num = input.nextInt();
        if (num>0){
            System.out.println("The number is positive");
        } else if (num<0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}
