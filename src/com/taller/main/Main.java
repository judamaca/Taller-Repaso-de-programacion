package com.taller.main;

import com.taller.interfaces.IEjercicio;
import com.taller.ejercicios.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Registrar todos los ejercicios
        Map<Integer, IEjercicio> taller = new HashMap<>();
        taller.put(1, new Ejercicio01());
        taller.put(2, new Ejercicio02());
        taller.put(3, new Ejercicio03());
        taller.put(4, new Ejercicio04());
        taller.put(5, new Ejercicio05());
        taller.put(6, new Ejercicio06());
        taller.put(7, new Ejercicio07());
        taller.put(8, new Ejercicio08());
        taller.put(9, new Ejercicio09());
        taller.put(10, new Ejercicio10());
        taller.put(11, new Ejercicio11());
        taller.put(12, new Ejercicio12());
        taller.put(13, new Ejercicio13());
        taller.put(14, new Ejercicio14());
        taller.put(15, new Ejercicio15());
        taller.put(16, new Ejercicio16());
        taller.put(17, new Ejercicio17());
        taller.put(18, new Ejercicio18());
        taller.put(19, new Ejercicio19());
        taller.put(20, new Ejercicio20());
        taller.put(21, new Ejercicio21());
        taller.put(22, new Ejercicio22());
        taller.put(23, new Ejercicio23());
        taller.put(24, new Ejercicio24());
        taller.put(25, new Ejercicio25());
        taller.put(26, new Ejercicio26());


        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        // 2. Menú de ejecución limpio
        while (opcion != 0) {
            System.out.println("\n=== Workshop with 40 exercises ===");
            System.out.print("Enter the number to be executed (0 to exit the program): ");
            opcion = scanner.nextInt();

            if (taller.containsKey(opcion)) {
                System.out.println("\n--- Performing the exercise " + opcion + " ---");

                // ESTA LÍNEA EJECUTA EL CÓDIGO DE CUALQUIER EJERCICIO
                taller.get(opcion).ejecutar();

                System.out.println("\n-----------------------------------");
            } else if (opcion != 0) {
                System.out.println("Invalid option or exercise not yet created.");
            }
        }

        System.out.println("Leaving the workshop. Good job!");
        scanner.close();
    }
}