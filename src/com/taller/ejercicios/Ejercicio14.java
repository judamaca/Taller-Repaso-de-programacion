package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio14 implements IEjercicio{
    // Ejercicio 14: Conversión de segundos a HH:MM:SS
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
