package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio13 implements IEjercicio{
    // Ejercicio01: Imprime Hola + tu nombre
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to transfer to nn,nnn and I'll add it: ");
        String n = input.nextLine();
        String n2 = n.repeat(2);
        String n3 = n.repeat(3);
        int num1 = Integer.parseInt(n);
        int num2 = Integer.parseInt(n2);
        int num3 = Integer.parseInt(n3);
        int suma = num1 + num2 + num3;
        System.out.println("The numers are: " + num1 + ", " + num2 + ", " + num3 + ". The add equals: " + suma);
    }
}
