// Escribe un programa que solicite al usuario ingresar su nombre y apellido por separado, y luego muestre en pantalla el nombre 
// completo utilizando el método concat() de la clase String.

import java.util.Scanner;

public class ConcatenacionDeCadena {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Por favor ingrese su nombre.");
       String nombre = scan.nextLine();
       System.out.println("Ingrese su apellido");
       String apellido = scan.nextLine();
       
       System.out.println(nombre.concat(" ").concat(apellido));
       scan.close();
    }
}
