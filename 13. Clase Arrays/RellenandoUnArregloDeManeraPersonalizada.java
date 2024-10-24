// Escribe un programa en Java que realice lo siguiente:

// 1. Solicita al usuario un tamaño para un arreglo.
// 2. Luego, pídele que ingrese un número con el que desea rellenar el array.
// 3. Solicita el índice hasta el cual quiere rellenar el array con el número anterior.
// 4. El array deberá ser rellenado con el número proporcionado hasta el índice ingresado por el usuario.

// Asegúrate de validar lo siguiente:

// 1. La primera vez que se pide al usuario un número para rellenar el arreglo, el índice inicial debe ser 0.
// 2. Si el índice ingresado no es el índice del último elemento del arreglo, el programa debe continuar pidiendo 
// al usuario nuevos números e índices para rellenar el arreglo.
// 3. El índice siempre debe ser menor que el tamaño total del arreglo.

// Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice ingresado debe ser mayor que el 
// último índice ingresado; a su vez, se debe rellenar el array con el nuevo número desde el índice anterior hasta 
// el nuevo índice.

// Por último, el programa debe imprimir por consola el arreglo completo.

import java.util.Arrays;
import java.util.Scanner;

public class RellenandoUnArregloDeManeraPersonalizada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo");
        int tamano = scan.nextInt();

        int i = 0;
        int indice;
        int[] array1 = new int[tamano];
        
        do {
        
        System.out.println("Ingrese un número con el que desee llenar el arreglo");
        int numero = scan.nextInt();
              
        do {
            System.out.println("Ingrese el índice hasta el cual quiere llenarlo");
             indice = scan.nextInt();
        } while (indice > tamano || indice < 0 || indice < i);

        Arrays.fill(array1, i, indice + 1, numero);

        i = indice + 1;

        } while (i < tamano);


        System.out.println(Arrays.toString(array1));

        scan.close();
    }
}
