package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio01 implements IEjercicio{
    // Ejercicio01: Imprime Hola + tu nombre
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hola " + name);
    }
}
