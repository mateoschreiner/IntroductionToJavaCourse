// El método fill() de la clase Arrays cambia todos los elementos en un arreglo por un valor estático, desde el 
// índice start (por defecto 0) hasta el índice end (por defecto array.length) y devuelve el arreglo modificado. 
// Vamos a escribir un programa que solicite al usuario el tamaño para un arreglo y un número entero con el que 
// quiera rellenarlo. Luego crea el arreglo y utiliza Arrays.fill(). Finalmente, imprime el arreglo resultante.

import java.util.Arrays;
import java.util.Scanner;

public class RellenandoUnArreglo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo");
        int tamanoArreglo = scan.nextInt();

        int[] arreglo = new int[tamanoArreglo];

        System.out.println("Ingrese el número con el que quiera llenar el arreglo");
        int numero = scan.nextInt();

        Arrays.fill(arreglo, numero);
        System.out.println("El arreglo creado es: " + Arrays.toString(arreglo));

        scan.close();
    }
}
