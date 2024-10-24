// Escribe un programa en el que declares una variable de tipo array que contenga 10 elementos de tipo entero. 
// Inicializa el arreglo con valores aleatorios entre 1 y 100, imprime por consola el arreglo inicial y luego 
// ordenalo en forma descendente utilizando el método Arrays.sort(). Finalmente, imprime los elementos ordenados 
// en la consola.

import java.util.Arrays;

public class OrdenarEnFormaDescendente {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        
        
        for (int i = 0; i < array1.length; i++) {
           array1[i] = (int)(Math.random()*100+1);
        }

        System.out.println(Arrays.toString(array1));

        Arrays.sort(array1);

        for (int i = 0 ; i < array1.length/2; i++){
            int temp = array1[i];
            array1[i] = array1[array1.length -1 - i];
            array1[array1.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(array1));
    }
}