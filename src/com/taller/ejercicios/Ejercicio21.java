package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio21 implements IEjercicio{
    //    Escribe un algoritmo que dado un número entre 0 y 10, imprima el nombre del número.
    //Ejemplo: 1 ---> UNO

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 10:");
        int opcion = input.nextInt();
        switch (opcion) {
            case 1 -> System.out.println(opcion + " -> UNO");
            case 2 -> System.out.println(opcion + " -> DOS");
            case 3 -> System.out.println(opcion + " -> TRES");
            case 4 -> System.out.println(opcion + " -> CUATRO");
            case 5 -> System.out.println(opcion + " -> CINCO");
            case 6 -> System.out.println(opcion + " -> SEIS");
            case 7 -> System.out.println(opcion + " -> SIETE");
            case 8 -> System.out.println(opcion + " -> OCHO");
            case 9 -> System.out.println(opcion + " -> NUEVE");
            case 10 -> System.out.println(opcion + " -> DIEZ");
            default -> System.out.println("Opción inválida. Debe ser un número del 1 al 10.");
        }
    }
}
