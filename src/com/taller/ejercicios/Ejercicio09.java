package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio09 implements IEjercicio{
    // Escribe un algoritmo que imprima el área y el perímetro de un círculo.
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double r = input.nextDouble();
        double area = r * r * Math.PI;
        double perimeter = 2f * r * Math.PI;
        System.out.println("The area is: " + area + ". The perimeter is: " + perimeter);
    }
}
