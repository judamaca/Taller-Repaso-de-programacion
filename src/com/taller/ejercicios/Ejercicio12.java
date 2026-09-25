package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio12 implements IEjercicio{
    // Ejercicio01: Imprime Hola + tu nombre
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa en el siguiente orden las coordenadas (todas positivas): x1, y1, x2, y2");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }
}
