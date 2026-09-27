package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio17 implements IEjercicio{
    //  Escribe un algoritmo que determine el IVA (19%) de una venta, si esta es mayor a 150.000
    //aplicar un descuento del 5%. Usa la función calcularIVA definida en la parte anterior.

    @Override
    public void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the sales amount to calculate the VAT: ");
        float grossPrice = input.nextFloat();
        Ejercicio08 otroEjercicio = new Ejercicio08();

        float resultado = otroEjercicio.calculateVAT(grossPrice);
        if (resultado > 150000) {
            System.out.println("You will get a 5% discount");
            resultado = (float) (resultado - (resultado*0.05f));
        }

        System.out.println("The final price is: "+resultado);
    }

}
