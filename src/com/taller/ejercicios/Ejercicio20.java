package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio20 implements IEjercicio{
    //   Escribe un algoritmo que, dado un usuario y una contraseña predefinida (por ejemplo
    //usuario=”carlos" y contraseña=”1234”, le permita a un usuario digital su usuario y
    //contraseña y comparar si corresponde al usuario y contraseña predefinida..

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
