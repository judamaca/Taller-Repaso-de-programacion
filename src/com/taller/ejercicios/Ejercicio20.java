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
        String user = "Martinelimpar";
        String password = "Martin123";
        String userLog = "";
        String passwordLog = "";

        do {
        System.out.println("Enter the user: ");
        userLog = input.next();

        if (userLog.equals(user)) {
            System.out.println("Correct user, now enter the password: ");

            do {
                passwordLog = input.next();
                if (passwordLog.equals(password)) {
                    System.out.println("Correct password, Welcome!: " + user);
                    break;
                } else {
                    System.out.println("Incorrect password, try again!");
                }
            } while (passwordLog.equals(password));
        } else {
            System.out.println("Incorrect password, try again!");
        }

        } while (!passwordLog.equals(password));
    }
}
