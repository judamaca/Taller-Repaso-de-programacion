package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio03 implements IEjercicio{
    // Ejercicio03: Imprime el cuadrado de un numero
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int n = input.nextInt();
        System.out.println("El resultado es: " +(int)Math.pow(n, 2));
    }
}
