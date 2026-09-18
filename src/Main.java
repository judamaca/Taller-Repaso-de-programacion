import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        // Ejercicio12: Imprime Hola + tu nombre
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        */


        /*
        // Ejercicio 12: Calcula la distancia entre dos puntos (x1,y1) y (x2,y2)
        System.out.println("Ingresa en el siguiente orden las coordenadas (todas positivas): x1, y1, x2, y2");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("La distancia entre los dos puntos es: " + distancia);
        */

        /*
        // Ejercicio 13: Recibe n, imprime n,nn,nnn y los suma
        System.out.println("Ingresa el numero con el cual quieres pasar a nn,nnn y lo sumaremos: ");
        String n = input.nextLine();
        String n2 = n.repeat(2);
        String n3 = n.repeat(3);
        int num1 = Integer.parseInt(n);
        int num2 = Integer.parseInt(n2);
        int num3 = Integer.parseInt(n3);
        int suma = num1 + num2 + num3;
        System.out.println("Los numeros son: " + num1 + ", " + num2 + ", " + num3 + ". La suma es: " + suma);
        */


        // Ejercicio 14: Conversión de segundos a HH:MM:SS
        System.out.println("Ingresa una cantidad de segundos para devolvertelo en formato HH:MM:SS");
        int seg = input.nextInt();
        int min = seg / 60;
        



    }
}
