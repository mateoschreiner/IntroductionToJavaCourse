// Desarrolla un programa que solicite al usuario ingresar dos palabras. Utiliza el método equals() de la clase
// String para comparar si las dos palabras son iguales. Muestra un mensaje apropiado en pantalla indicando
// si las palabras son iguales o diferentes.

import java.util.Scanner;

public class ComparacionDeCadenas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra1 = scan.next();
        System.out.println("Ingrese otra palabra (puede ser igual o distinta)");
        String palabra2 = scan.next();

        // boolean comparacion = palabra1.toLowerCase().equals(palabra2.toLowerCase());
        boolean comparacion = palabra1.equalsIgnoreCase(palabra2);
        
        if (comparacion) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras son distintas");
        }

        scan.close();
    }
}
