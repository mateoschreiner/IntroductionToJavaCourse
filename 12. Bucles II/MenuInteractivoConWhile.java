// Crea un menú interactivo con 5 opciones para que el usuario elija, como por ejemplo:
// 1. Comprar producto.
// 2. Realizar devolución.
// 3. Ver mis pedidos.
// 4. Preguntas frecuentes.
// 5. Salir.
// Luego, solicita al usuario que elija una opción del menú mostrado en pantalla. El menú debe seguir apareciendo hasta que el usuario elija 
// la opción para salir del programa. En este ejercicio, no es necesario que las opciones del menú realicen acciones reales, simplemente muestra 
// un mensaje que indique qué opción eligió el usuario.

import java.util.Scanner;

public class MenuInteractivoConWhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu principal:");
            System.out.println("1. Comprar producto.");
            System.out.println("2. Realizar devolución.");
            System.out.println("3. Ver mis pedidos.");
            System.out.println("4. Preguntas frecuentes.");
            System.out.println("5. Salir");

            opcion = scan.nextInt();


        } while (opcion != 5);

        scan.close();

    }
}