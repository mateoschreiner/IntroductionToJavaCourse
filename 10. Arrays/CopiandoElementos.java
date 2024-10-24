// Desarrolla un programa que inicie creando un array de 3 enteros, con valores predeterminados. Posteriormente, genera 
// una copia del mismo con una extensión de 2 elementos adicionales.
// Solicita al usuario que ingrese dos números para ser almacenados en las nuevas posiciones del array.
// Finalmente, muestra por consola el contenido del nuevo array.
// Es esencial emplear exclusivamente las herramientas aprendidas hasta el momento, evitando el uso de bucles en el proceso.

import java.util.Scanner;

public class CopiandoElementos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] array1 = {6,5,8};
        int [] array2 = new int[5];
        array2[0] = array1[0];
        array2[1] = array1[1];
        array2[2] = array1[2];

        System.out.println("Ingrese 2 números.");
        array2[3] = scan.nextInt();
        array2[4] = scan.nextInt();

        System.out.println("El array es: " + array2[0] + ", " + array2[1] + ", " + array2[2] + ", " + array2[3] + ", " + array2[4]);
        scan.close();

    }
}
