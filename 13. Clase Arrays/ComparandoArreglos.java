// Escribe un programa que compare dos arreglos de enteros utilizando el método Arrays.equals(). El programa debe 
// imprimir si los arreglos son iguales o no.

import java.util.Arrays;

public class ComparandoArreglos {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(array1, array2)){
            System.out.println("Los Arreglos son iguales");
        } else {
            System.out.println("Los Arreglos son distintos");
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
