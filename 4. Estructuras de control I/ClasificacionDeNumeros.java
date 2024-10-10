// En esta actividad, deberás escribir un programa que solicite al 
// usuario un número y determine si es positivo, negativo o cero. 
// El resultado se mostrará en pantalla.

import java.util.Scanner;

public class ClasificacionDeNumeros {
    public static void main(String[] args) {
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = numScanner.nextInt();

        if (num > 0) {
            System.out.println("El número es positivo");
        }else if (num < 0){
            System.out.println("El número es negativo");
        }else {
            System.out.println("El número es 0");
        }
        numScanner.close();
    }
}