// Escribe un programa que  pida al usuario un número entero y muestra en pantalla su valor absoluto utilizando el método abs() de la clase Math.

import java.util.Scanner;

public class CalculandoElValorAbsoluto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        int entero = scan.nextInt();

        entero = Math.abs(entero);
        System.out.println("El valor absoluto del número ingresado es: " + entero);

        scan.close();
    }
}