// Escribe un programa en el cual se cree una variable de tipo array que contenga cinco elementos de tipo entero, 
// ingresados por el usuario. El programa debe buscar el máximo e imprimir por consola el resultado utilizando solamente 
// las herramientas adquiridas hasta el momento.

import java.util.Scanner;

public class EncontrandoElMaximo {
    public static void main(String[] args) {
        int [] array1 = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 5 números enteros.");
        array1[0] = scan.nextInt();
        array1[1] = scan.nextInt();
        array1[2] = scan.nextInt();
        array1[3] = scan.nextInt();
        array1[4] = scan.nextInt();

        if (array1[0] > array1[1] && array1[0] > array1[2] && array1[0] > array1[3] && array1[0] > array1[4]) {
            System.out.println("El número más alto es: "+ array1[0]);
        } else if (array1[1] > array1[2] && array1[0] > array1[3] && array1[0] > array1[4]) {
            System.out.println("El número más alto es: "+ array1[1]);
        } else if (array1[2] > array1[3] && array1[0] > array1[4]) {
            System.out.println("El número más alto es: "+ array1[2]);
        } else if (array1[3] > array1[4]) {
            System.out.println("El número más alto es: "+ array1[3]);
        } else {
            System.out.println("El número más alto es: " + array1[4]);
        }

        scan.close();
    }
}
