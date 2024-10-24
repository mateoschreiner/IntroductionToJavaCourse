// Escribe un programa que pida al usuario un número decimal y muestra en pantalla su valor redondeado utilizando el método round() 
// de la clase Math.

import java.util.Scanner;

public class RedondeoDeNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número decimal");
        float numero = scan.nextFloat();

        int redondeado = Math.round(numero);
        System.out.println("El número redondeado es: " + redondeado);

        scan.close();
    }
}
