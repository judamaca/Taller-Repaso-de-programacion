package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio19 implements IEjercicio{
    // Escribe una función que permita resolver una ecuación cuadrática de tipo ax2 + bx + c
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a whole number of seconds to convert it to HH:MM:SS");
        int seg = input.nextInt();
        int horas = seg / 3600;
        int minutos = (seg % 3600) / 60;
        int segundos = (seg % 60) % 60;

        System.out.println("The estimated time in the format HH:MM:SS is: " + horas + ":" + minutos + ":" + segundos);
    }
}
