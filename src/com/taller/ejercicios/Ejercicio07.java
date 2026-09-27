package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio07 implements IEjercicio{
    // Escribe un algoritmo que lea las cinco notas obtenidas por un estudiante y calcule su nota
    //final, sabiendo que las cada nota tiene el siguiente valor: n1 (15%), n2 (20%), n3 (15%),
    //n4(30%), n5 (20%). Defínelo como una función llamada calcularPromedio donde los
    //parámetros de entrada son las 5 notas y la salida es la nota final.
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

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

        double finalResult = calculateProm(n1, n2, n3, n4, n5);
        System.out.println("The final result is: " + finalResult);
    }

    public double calculateProm(double a, double b, double c, double d, double e) {
        double prom = (a*0.15) + (b*0.2) + (c*0.15) + (d*0.3) + (e*0.2);
        return prom;
        }
}
