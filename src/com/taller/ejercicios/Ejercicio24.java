package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio24 implements IEjercicio{
    //      Escribe un algoritmo que lea un número del día de la semana (entre 1 y 7) e indique el
    //nombre del día. Por ejemplo: 1 ---> Lunes ; 5 ---> Viernes

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the day: ");
        int day = input.nextInt();

        switch (day) {
            case 1: System.out.println("Monday");
            case 2: System.out.println("Tuesday");
            case 3: System.out.println("Wednesday");
            case 4: System.out.println("Thursday");
            case 5: System.out.println("Friday");
            case 6: System.out.println("Saturday");
            case 7: System.out.println("Sunday");
        }
    }
}
