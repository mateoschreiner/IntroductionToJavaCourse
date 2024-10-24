// Crea un programa en Java que declare y muestre un arreglo de enteros junto con sus índices. Luego, solicita al 
// usuario dos índices: un índice inicial y un índice final. Con estos dos índices, copia la parte del arreglo 
// original comprendida entre ellos (inclusive) en un nuevo arreglo utilizando el método Arrays.copyOfRange(). 
// Asegúrate de incluir validaciones para confirmar que el índice inicial es menor que el índice final y que ambos 
// índices están dentro del rango válido del arreglo original. Finalmente, imprime el nuevo arreglo por consola.

import java.util.Arrays;
import java.util.Scanner;

public class CopiandoParteDeUnArreglo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++){
            array1[i] = (int)(Math.random()*100+1);
            System.out.println( "El índice es: " + i + ": " + array1[i]);
        }

        int userInput1;
        int userInput2;
        do {
            System.out.println("Ingrese un número mayor o igual a 0");
            userInput1 = scan.nextInt();
        } while (userInput1 < 0 || userInput1 > array1.length - 1);

        do {
            System.out.println("Ingrese un número mayor al ingresado anteriormente y menor a " + array1.length);
            userInput2 = scan.nextInt();
        } while (userInput2 <= userInput1 || userInput2 > array1.length - 1);

        int[] copia = Arrays.copyOfRange(array1, userInput1, userInput2 + 1);
        System.out.println("El nuevo arregloe es: " + Arrays.toString(copia));

        scan.close();
    }
}
