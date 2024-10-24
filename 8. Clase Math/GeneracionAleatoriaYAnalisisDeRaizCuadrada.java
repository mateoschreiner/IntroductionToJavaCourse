// Escribe un programa que cumpla con las siguientes condiciones:

// Pide al usuario que ingrese un número entre 1 y 30. Este número será almacenado en una variable llamada numeroLimite .
// Utiliza la clase Math para generar un número aleatorio entre 1 y el numeroLimite recibido del usuario.
// Utiliza el método Math.sqrt() para calcular la raíz cuadrada del número aleatorio generado y muéstralo en pantalla.
// Analiza si el número aleatorio generado es primo y muestra un mensaje en pantalla indicando si lo es o no.
// Finalmente, muestra el número aleatorio generado y su raíz cuadrada en pantalla.

import java.util.Scanner;

public class GeneracionAleatoriaYAnalisisDeRaizCuadrada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número entre 1 y 30");
        int numeroLimite = scan.nextInt();

        if (numeroLimite <= 30 && numeroLimite >= 1) {
            
            int numeroAleatorio = (int)(Math.random()*numeroLimite + 1);
            double raizNumero = Math.sqrt(numeroAleatorio);

            if (numeroAleatorio % 2 == 0) {
                System.out.println("El número es primo");
            } else {
                System.out.println("El número no es primo");
            }

            System.out.println("El número generado es: " + numeroAleatorio);
            System.out.println("La raíz cuadrada del número generado es: " + raizNumero); 

        } else {
            System.out.println("El número ingresado es incorrecto");
        }

        scan.close();
    }
}
