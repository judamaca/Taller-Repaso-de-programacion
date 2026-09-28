package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio19 implements IEjercicio{
    // Escribe una función que permita resolver una ecuación cuadrática de tipo ax2 + bx + c
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coefficient next to the x squared: ");
        float a = input.nextFloat();
        System.out.println("Enter the coefficient next to the x: ");
        float b = input.nextFloat();
        System.out.println("Enter the coefficient that does not have an x: ");
        float c = input.nextFloat();

        float[] roots = calculateRoots(a, b, c);
        if (roots !=  null){
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
    public float[] calculateRoots(float a, float b, float c) {
        float disc = (b*b)-4*(a*c);

        if  (disc < 0) {
            return null;
        }

        float root1 = (-b + (float) Math.sqrt(disc)) / (2f * a);
        float root2 = (-b - (float) Math.sqrt(disc)) / (2f * a);
        return new float[]{root1, root2};
    }
}
