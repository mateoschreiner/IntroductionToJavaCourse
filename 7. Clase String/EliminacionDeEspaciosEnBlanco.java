// Crea un programa que solicite al usuario ingresar una frase con espacios en blanco al principio y al final. Utiliza el método trim() 
// de la clase String para eliminar los espacios en blanco y luego muestra la frase resultante en pantalla.

import java.util.Scanner;

public class EliminacionDeEspaciosEnBlanco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase con espacios en blanco al principio y al final");
        String frase = scan.nextLine();

       
        System.out.println(frase.trim());
        
        scan.close();
    }
}
