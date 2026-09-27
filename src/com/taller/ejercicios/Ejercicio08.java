package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio08 implements IEjercicio{
    // Escribe un algoritmo que determine el IVA (19%) de una venta realizada, indicando el valor
    //original (precio bruto), el valor del IVA y el valor de la venta con IVA incluido.  Defínelo como
    //una función llamada calcularIVA donde el parámetro de entrada es el precio bruto y la salida
    //es el precio con IVA.

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the gross price of the product: ");
        float grossPrice = input.nextFloat();

        double finalPrice = calculateVAT(grossPrice);
        System.out.println("The final price is: " + finalPrice + ". The VAT amounts to: " + (grossPrice*0.19f));
    }

    private float calculateVAT(float a) {
        float price = a + (a*0.19f);
        return price;
        }
}
