package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.text.NumberFormat;
import java.util.Locale;


public class Ejercicio40 implements IEjercicio {
    // Un BOING 747 tiene una capacidad de carga para equipaje de aproximadamente 18.000 kg.
    // onfeccione un algoritmo que controle la recepción de equipajes para este avión, sabiendo: -
    // Un bulto no puede exceder la capacidad de carga del avión ni tampoco exceder los 500
    // Kg.  -
    // El valor por kilo del bulto es : - de 0 a 25 Kg. cero pesos - de 26 a 300 Kg. 1500 pesos por
    // kilo de equipaje. - de 301 a 500 Kg. 2500 pesos por kilo de equipaje
    // Para un vuelo cualquiera se pide:
    //      a. Número total de bultos ingresados para el vuelo
    //      b. Peso del bulto más pesado y del más liviano
    //      c. Peso promedio de los bultos
    //      d. Ingreso en pesos y en dólares por concepto de carga.
    // Construya una tabla de seguimiento con no menos de 15 bultos para realizar la prueba del
    // algoritmo.

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the aircraft baggage handling system");

        ArrayList<Float> packs = new ArrayList<>();
        int option = -1;

        // Loop runs until the user selects option 0 to exit
        while (option != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add a package");
            System.out.println("2. Total number of bags checked in for the flight");
            System.out.println("3. Weight of the heaviest and lightest packages");
            System.out.println("4. Average weight of packages");
            System.out.println("5. Revenue in pesos and dollars from freight");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            option = input.nextInt();

            float totalPW = 0;
            float totalReveneu = 0;
            float average = totalPW/packs.size();

            switch (option) {
                case 1 -> {
                    float paketWeight = 1;
                    System.out.println("Executing Task 1...");
                    while (paketWeight != -1) {
                        System.out.println("--- Add a package (Enter the number -1 to exit)");
                        paketWeight = input.nextFloat();
                        totalPW += paketWeight;
                        if (paketWeight != -1) packs.add(paketWeight);

                        if (paketWeight > 500) {
                            System.out.println("Pakets can't be greater than 500");
                        } else if (paketWeight < 26 && paketWeight >= 0) {
                            System.out.println("Pakets's fee is 0");
                        } else if (paketWeight >= 26 && paketWeight < 301) {
                            System.out.println("Pakets's fee is: " + formatToPrice(paketWeight*1500));
                            totalReveneu = totalReveneu + paketWeight*1500;
                        } else if (paketWeight >= 301 && paketWeight <= 500) {
                            System.out.println("Pakets's fee is: " + formatToPrice(paketWeight*2500));
                            totalReveneu = totalReveneu + paketWeight*2500;
                        } else {
                            System.out.println("Enter a valid weight between 0 and 500");
                        }
                        System.out.println("Item successfully added");
                    }
                    average = totalPW/packs.size();
                }
                case 2 -> {
                    System.out.println("Executing Task 2...");
                    System.out.println("Total number of bags checked in for the flight is: " + packs.size());
                }
                case 3 -> {
                    System.out.println("Executing Task 3...");
                    Collections.sort(packs);
                    System.out.println("The weight of the heaviest package is: " + packs.get(packs.size() - 1));
                    for (int i = 0; i < packs.size() - 1; i++) {
                        if (packs.get(i) != 0) {
                            System.out.println("The weight of the lightest package is: " + packs.get(i));
                            i = packs.size();
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Executing Task 4...");
                    System.out.println("The average weight of the packages is: " + average);
                }
                case 5 -> {
                    System.out.println("Executing Task 5...");
                    System.out.println("The revenue in pesos from freight is: " + formatToPrice(totalReveneu));
                    System.out.println("The revenue in dollars from freight is: " +  formatToPrice(totalReveneu/3329));
                }
                case 0 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid option.");
            }
        }
    }
    public String formatToPrice(float amount) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        return currencyFormatter.format(amount);
    }

}