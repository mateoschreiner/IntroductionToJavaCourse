// Escribe un programa que pida al usuario ingresar una palabra y un carácter, y determine si el carácter 
// ingresado se encuentra en la palabra utilizando el método indexOf() de la clase String. Muestra un mensaje 
// adecuado en pantalla indicando si el carácter se encuentra o no en la palabra.

import java.util.Scanner;

public class BusquedaDeCaracteres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = scan.nextLine();
        System.out.println("Ingrese un caracter");
        char caracter = scan.next().charAt(0);

        int posicion = palabra.indexOf(caracter);

        if (posicion != -1) {
            System.out.println("El caracter se encuentra en la palabra en la posición " + posicion);
        } else {
            System.out.println("El caracter no se encuentra en la palabra");
        }

        scan.close();
    }
}
