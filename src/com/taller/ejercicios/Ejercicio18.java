package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio18 implements IEjercicio {
    //   Escribe un algoritmo que lea las cinco notas obtenidas por un estudiante y calcule su nota
    //final, sabiendo que las cada nota tiene el siguiente valor: n1 (15%), n2 (20%), n3 (15%), n4
    //(30%), n5 (20%). Si la nota obtenida es menor a 2,0 deberá indicarle al estudiante que no
    //puede habilitar, si la nota obtenida es menor a 3 deberá indicar que reprobó, si la nota es
    //mayor o igual a 3 deberá indicar que aprobó y si es mayor a 4,5 extenderá un mensaje de
    //felicitación al estudiante. Usa la función calcularPromedio definida en la parte anterior.

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);
        Ejercicio07 otroEjercicio = new Ejercicio07();

        System.out.println("Enter the sales amount to calculate the VAT: ");
        System.out.println("Enter the first grade, which accounts for 15%: ");
        double n1 = input.nextDouble();
        System.out.println("Enter the second grade, which accounts for 20%: ");
        double n2 = input.nextDouble();
        System.out.println("Enter the third grade, which accounts for 15%: ");
        double n3 = input.nextDouble();
        System.out.println("Enter the fourth grade, which accounts for 30%: ");
        double n4 = input.nextDouble();
        System.out.println("Enter the fifth grade, which accounts for 20%: ");
        double n5 = input.nextDouble();

        double finalResult = otroEjercicio.calculateProm(n1, n2, n3, n4, n5);
        System.out.println("The final result is: " + finalResult);

        if (finalResult < 2) {
            System.out.println("You failed the course. You cannot take the subject qualification exam.");
        } else if (finalResult >= 2 && finalResult < 3) {
            System.out.println("You failed the course. You can take the subject qualification exam.");
        } else if (finalResult >= 3 && finalResult < 4.5) {
            System.out.println("You passed the course.");
        } else {
            System.out.println("Congratulations! You passed the course with a great grade.");
        }
    }
}
