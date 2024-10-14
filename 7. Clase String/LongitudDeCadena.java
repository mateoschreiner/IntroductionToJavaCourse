// Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla su 
// longitud utilizando el método length() de la clase String.

import java.util.Scanner;

public class LongitudDeCadena{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Por favor ingrese una oración.");
    String texto = scan.nextLine();

    System.out.println("El largo de la cadena es: " + texto.length());
    scan.close();
}
}

