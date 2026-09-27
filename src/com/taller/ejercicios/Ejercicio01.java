package com.taller.ejercicios;

import com.taller.interfaces.IEjercicio; // 1. Importas la interfaz
import java.util.Scanner;       // 2. Importas el Scanner

public class Ejercicio01 implements IEjercicio{
    // Ejercicio01: Imprime Hola Mundo
    @Override
    public void ejecutar() {
        System.out.println("Hello world");
    }
}
