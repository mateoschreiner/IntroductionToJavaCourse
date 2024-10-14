// Escribe un programa que solicite al usuario ingresar una frase y dos números enteros, que representen un 
// índice inicial y un índice final. Utiliza el método substring() de la clase String para extraer la subcadena 
// que se encuentra entre los índices ingresados por el usuario, y muestra la subcadena resultante en pantalla.

import java.util.Scanner;

public class ExtraccionDeSubcadena {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = scan.nextLine();

        System.out.println("Ingrese dos números entre 0 y " + frase.length());
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if ((num1 < 0) || (num1 > frase.length()-1) || (num2 < 0) || (num2 > frase.length()-1)) {
            System.out.println("El número ingresado es incorrecto");
        } else if (num1 < num2) {
            System.out.println(frase.substring(num1, num2));
        } else if (num2 < num1) {
            System.out.println(frase.substring(num2, num1));
        }




        scan.close();
    }
}
