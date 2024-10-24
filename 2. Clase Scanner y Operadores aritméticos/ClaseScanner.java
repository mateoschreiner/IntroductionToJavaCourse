// Para entender mejor el concepto de esta clase, practicarás con los siguientes ejercicios: 
// 1. Solicita al usuario que ingrese su nombre (cadena de texto), guárdalo en una variable e imprime el dato por consola..
// 2. Solicita al usuario que ingrese su edad (número), guárdalo en una variable e imprime el dato por consola..
// 3. Luego imprime en pantalla un mensaje que diga “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.

import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = scan.nextLine();

        System.out.println("Ingrese su edad");
        int edad = scan.nextInt();

        System.out.println("Su nombre es " + nombre + " y su edad es " + edad + ".");

        scan.close();
    }
}