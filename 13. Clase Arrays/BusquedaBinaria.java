// La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una lista ordenada de elementos. 
// La clase Arrays ya incluye su implementación mediante el método binarySearch(). Escribe un programa que realice 
// una búsqueda binaria en un arreglo ordenado de enteros utilizando el método Arrays.binarySearch(). El programa 
// debe imprimir el arreglo generado originalmente, solicitar al usuario el valor buscado e imprimir el índice del 
// valor buscado si está presente en el arreglo.

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array1 = new int[10];

        for(int i = 0; i < array1.length; i++){
            array1[i] = (int)(Math.random() * 100 + 1);
        }

        Arrays.sort(array1);

        System.out.println("El array original es: " + Arrays.toString(array1));
        
        System.out.println("Ingrese el valor buscado");
        int numUser = scan.nextInt();

        if (Arrays.binarySearch(array1, numUser) >= 0) {
            System.out.println("La ubicación es: " + Arrays.binarySearch(array1, numUser));
        } else {
            System.out.println("El número no esta en el arreglo");
        }


        scan.close();
    }
}
