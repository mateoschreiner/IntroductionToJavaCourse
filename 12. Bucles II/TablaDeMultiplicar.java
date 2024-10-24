// Escribe un programa que solicite al usuario un número entero y muestre la tabla de multiplicar de ese número utilizando un bucle while. 
// El programa debe seguir solicitando números hasta que el usuario ingrese un valor igual a cero, en cuyo caso debería salir del bucle.

import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número para conocer su tabla de multiplicar");
        int numero = scan.nextInt();

        while (numero != 0) {
            for (int i = 0; i < 11; i++){
                System.out.println(numero + " x " + i + " = " + numero*i);
            }
            System.out.println("Ingrese un número para conocer su tabla de multiplicar");
            numero = scan.nextInt();

            }

            System.out.println("Programa finalizado");

            scan.close();
            
        }

        
    }

