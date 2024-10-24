// Escribe un programa que pida al usuario dos números enteros, representando la base y el exponente, y calcula el resultado de elevar la 
// base al exponente utilizando el método pow() de la clase Math. Muestra el resultado en pantalla.

import java.util.Scanner;

public class CalculandoLaPotencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese dos números enteros");
        double num1 = (double)scan.nextInt();
        double num2 = (double)scan.nextInt();
        int potencia;

        potencia = (int)Math.pow(num1, num2);
        System.out.println((int)num1 + " elevado " + (int)num2 + ", es igual a " + potencia);

        scan.close();
    }
}
