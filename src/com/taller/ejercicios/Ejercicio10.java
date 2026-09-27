package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio10 implements IEjercicio{
    // Escribe un algoritmo que calcule el área de un hexágono.
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("How long is one side of the hexagon?: ");
        double p = input.nextDouble();
        double a = (p * (Math.sqrt(3)))/2;
        p = p*6 ;
        double area = (p*a)/2;
        System.out.println("The area is: " + area);
        System.out.println(a);
    }
}
