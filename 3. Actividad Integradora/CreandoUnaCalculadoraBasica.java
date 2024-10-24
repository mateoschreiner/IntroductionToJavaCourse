// Después de analizar el funcionamiento del programa requerido en el video proporcionado, tu tarea es escribir el código necesario para 
// cumplir con los siguientes puntos:
// 1. Solicita al usuario que ingrese dos números y almacena estos valores en variables previamente declaradas.
// 2. Declara una variable para almacenar el resultado de la operación. 
// 3. Permite al usuario elegir qué operación quiere realizar.
// 4. Muestra el resultado de la operación en la consola.

import java.util.Scanner;

public class CreandoUnaCalculadoraBasica {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int num1;
        int num2;
        int opcion;
        float resultado;

        System.out.println("CALCULADORA");
        System.out.println("Ingrese un número: ");
        num1 = miScanner.nextInt();

        System.out.println("Ingrese otro número: ");
        num2 = miScanner.nextInt();

        System.out.println("Elija qué operación quiere realizar");
        System.out.println("1 - suma");
        System.out.println("2 - resta");
        System.out.println("3 - multiplicación");
        System.out.println("4 - división");
        opcion = miScanner.nextInt();

        resultado = (opcion == 1) ? (num1 + num2) :
        (opcion == 2) ? (num1 - num2) :
        (opcion == 3) ? (num1 * num2) :
        (opcion == 4) && (num2 != 0) ? ((float)num1 / (float)num2) : 0;

        System.out.println("El resultado es " + resultado);

        miScanner.close();
    }
}