package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz

import java.util.Scanner;


public class Ejercicio34 implements IEjercicio {
    //      Escribe un algoritmo que le solicite al usuario un número entero positivo, si el usuario digita
    //un valor no permito, le debe volver a pedir el número. Una vez ingrese un valor válido deberá
    //imprimir dicho valor..

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);
        int realNum = 57;
        int num = 0;

        System.out.println("Enter a integer positive number: ");

        do {
            num = input.nextInt();
            if (num==realNum) {
                System.out.println("Congratulations! You found it.");
                break;
            }
            System.out.println("The number is incorrect. Enter other integer positive number: ");
        } while (num!=realNum);
    }
}