package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio04 implements IEjercicio{
    // Ejercicio04: Imprime la suma de dos numeros
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the two numbers to add them together: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println("El resultado de sumar de la suma es: "+ (n1+n2));
    }
}
