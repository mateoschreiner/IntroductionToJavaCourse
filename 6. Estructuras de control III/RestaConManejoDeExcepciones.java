// Escribe un programa que solicite al usuario ingresar dos números. Luego, realiza la resta del primer número 
// menos el segundo número. Implementa un bloque "try-catch" para manejar las excepciones que puedan surgir en 
// caso de que el usuario no ingrese números. En caso de que se produzca una excepción, muestra un mensaje 
// apropiado en pantalla. Si no se produce ninguna excepción, muestra el resultado de la resta.

import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaConManejoDeExcepciones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos números para realizar la resta de los mismos");

        try {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int resta = num1-num2;

            System.out.println("La resta de los números ingresados es: "+ resta);

        } catch (InputMismatchException e) {
            System.out.println("Alguno de los valores ingresados no corresponde a un número");
        } catch (Exception e){
            System.out.println("Error");
        }

        scan.close();
    }
}
