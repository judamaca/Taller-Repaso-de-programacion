package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio22 implements IEjercicio{
    //    Escribe un algoritmo que dado un número entre 0 y 10, imprima el nombre del número.
    //Ejemplo: 1 ---> UNO

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number to count its digits: ");

        do {
            num = input.nextInt();
            if (num > 100000) {
                System.out.println("The numer is greater than 100,000");
            } else if (num < 0) {
                num = -num;
                int cantidad = (num + "").length();
                num = -num;
                System.out.println("The number of digits in the number is: " + cantidad);
                break;
            } else if (num >= 0) {
                int cantidad = (num + "").length();
                System.out.println("The number of digits in the number is: " + cantidad);
                break;
            }
                System.out.println("Enter a numer again");
            } while (num > 100000);
        }
    }
