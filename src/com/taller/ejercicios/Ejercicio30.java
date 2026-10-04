package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner


public class Ejercicio30 implements IEjercicio {
    //    Escribe una función que calcule el área de cualquier polígono.

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the option number depending on whether it is a regular or irregular polygon: \n1. Regular polygon \n2. Irregular polygon \n");
        int option = input.nextInt();
        float area = 0;


        switch (option) {
            case 1: {
                System.out.println("Enter the perimeter: ");
                float p = input.nextInt();
                System.out.println("Enter the apothem: ");
                float a = input.nextInt();
                area = (p * a) / 2;
                System.out.println("The area is " + area);

                break;
            }
            case 2: {
                System.out.println("We haven't developed this part of the program yet.");
                break;
            }
        }
    }
}