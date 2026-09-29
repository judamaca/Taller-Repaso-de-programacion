package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio23 implements IEjercicio{
    //     Escribe un algoritmo que dados 3 números, determine si los números se están
    //incrementando, disminuyendo o ninguno de lo anterior. Por ejemplo: 1 , 4, 19 --> está
    //incrementando ; 33, 10 ,1 --> está disminuyendo; 3 , 18 , 10 --> Ni se incrementa ni se
    //disminuyendo

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = input.nextInt();

        if (num3 >= num2 && num2 >= num1) {
            System.out.println("The numbers are rising");
        } else if (num1 >= num2 && num2 >= num3) {
            System.out.println("The numbers are decreasing");
        } else {
            System.out.println("The numbers are neither decreasing nor increasing.");
        }
    }
}
