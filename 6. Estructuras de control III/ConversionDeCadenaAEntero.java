// Escribe un programa que solicite al usuario ingresar una cadena de caracteres que represente un número entero. 
// Utiliza el método Integer.parseInt() para convertir la cadena en un número entero. Implementa un bloque 
// "try-catch" para manejar la excepción en caso de que la cadena ingresada no pueda ser convertida en un 
// número entero. En caso de que se produzca la excepción, muestra un mensaje apropiado en la pantalla

import java.util.Scanner;

public class ConversionDeCadenaAEntero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número");

        try {
            String numeroString = scan.nextLine();
            int numero = Integer.parseInt(numeroString);
            System.out.println("El número ingresado es: "+ numero);

        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no puede ser convertido a un número");
        } catch (Exception e){
            System.out.println("Error");
        }
        scan.close();
    }
}
