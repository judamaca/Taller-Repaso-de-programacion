package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio05 implements IEjercicio{
    // Ejercicio05: Imprime la suma, resta, multiplicación, división y residuo de dos
    //números
    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the two numbers to perform the operation.: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println("El resultado de la suma es: "+ (n1+n2));
        System.out.println("El resultado de la resta es: "+ (n1-n2));
        System.out.println("El resultado de la multiplicación es: "+ (n1*n2));
        System.out.println("El resultado de la división es: "+ (n1/n2));

    }
}
