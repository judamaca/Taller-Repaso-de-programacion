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
        taller.put(12, new Ejercicio12());
        taller.put(13, new Ejercicio13());




        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        // 2. Menú de ejecución limpio
        while (opcion != 0) {
            System.out.println("\n=== TALLER DE 40 EJERCICIOS ===");
            System.out.print("Ingresa el número del ejercicio a ejecutar (0 para salir): ");
            opcion = scanner.nextInt();

            if (taller.containsKey(opcion)) {
                System.out.println("\n--- Ejecutando Ejercicio " + opcion + " ---");

                // ESTA LÍNEA EJECUTA EL CÓDIGO DE CUALQUIER EJERCICIO
                taller.get(opcion).ejecutar();

                System.out.println("\n-----------------------------------");
            } else if (opcion != 0) {
                System.out.println("Opción no válida o ejercicio aún no creado.");
            }
        }

        System.out.println("Saliendo del taller. ¡Buen trabajo!");
        scanner.close();
    }
}