// Escribe un programa en el cual se cree una variable de tipo array que contenga cuatro elementos de tipo entero. Estos 
// elementos deben ser ingresados por el usuario. El programa debe sumar y promediar los cuatro elementos de forma manual e 
// imprimir por consola el resultado, utilizando solamente las herramientas adquiridas hasta el momento.

import java.util.Scanner;

public class PromediandoElementos {
    public static void main(String[] args) {
        int[] array1 = new int[4];
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 4 números enteros.");
        array1[0] = scan.nextInt();
        array1[1] = scan.nextInt();
        array1[2] = scan.nextInt();
        array1[3] = scan.nextInt();

        int suma = array1[0] + array1[1] + array1[2] + array1[3];
        float prom = (float)suma / 4;

        System.out.println("La suma de los números ingresados es: " + suma + ". Y el promdedio de los números ingresados es: "+ prom);
        scan.close();

    }
}
