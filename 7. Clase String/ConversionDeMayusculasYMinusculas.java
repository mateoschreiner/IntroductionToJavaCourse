// Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla la misma cadena,
// pero con todos los caracteres en mayúsculas o minúsculas. Utiliza los métodos toUpperCase() y toLowerCase() 
// de la clase String para realizar la conversión.

import java.util.Scanner;

public class ConversionDeMayusculasYMinusculas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = scan.nextLine();

        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());

        scan.close();
    }
}
