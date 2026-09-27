package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio11 implements IEjercicio{
    //  Escribe un algoritmo que dados n números calcule el promedio de dichos números.
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to calculate the average for?:  ");
        int n  = input.nextInt();
        float sum = 0;
        for (int i=1;i<=n;i++){
            System.out.println("Enter the value of the number " + i + ".");
            float num  = input.nextFloat();
            sum = sum + num;
        }
        float prom = sum / n;
        System.out.println("The average is: " + prom);
    }
}
