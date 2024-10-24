// En esta actividad, vas a desarrollar un programa que mostrará un menú 
// con las siguientes opciones:
// Opción 1: "Guardar"
// Opción 2: "Cargar"
// Opción 3: "Salir"
// El programa solicitará al usuario que ingrese un número del 1 al 3 
// para seleccionar una opción. 
// Utilizarás la estructura "switch" para implementar este programa y
// mostrar en pantalla el mensaje correspondiente a la opción seleccionada.

import java.util.Scanner;

public class SeleccionDeOpcion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu Principal");
        System.out.println("1. Guardar");
        System.out.println("2. Cargar");
        System.out.println("3. Salir");

       int opcion = scan.nextInt();
       switch (opcion) {
        case 1:
            System.out.println("Guardar");
            break;
        case 2:
            System.out.println("Cargar");
            break;
        case 3:
            System.out.println("Salir");
            break;

       
        default:
            System.out.println("La opción elegida no es correcta");

            break;
       } 
       scan.close();
    }
    
}
