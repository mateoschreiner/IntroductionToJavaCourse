// En esta actividad, escribirás un programa que solicite al usuario 
// un número y determine si es divisible por 5, por 3, por ambos o 
// por ninguno. El resultado se mostrará en pantalla.

import java.util.Scanner;

public class Divisibilidad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número para su evaluación:");
        float num = scan.nextFloat();

        if (num % 5 == 0 && num % 3 == 0) {
             System.out.println("El número es divisible por 5 y por 3.");
            } else if (num % 5 == 0) {
                System.out.println("El número es divisible por 5.");
            } else if (num % 3 == 0) {
            System.out.println("El número es divisible por 3.");
            } else {
                System.out.println("El número no es divisible ni por 5 ni por 3.");
            }



        scan.close();
    }
}
