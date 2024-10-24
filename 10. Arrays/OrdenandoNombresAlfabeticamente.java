// Desarrolla un programa que pida al usuario ingresar 4 nombres. Estos nombres serán ordenados alfabéticamente y 
// posteriormente impresos en la consola. Es esencial emplear exclusivamente las herramientas aprendidas hasta el momento.

import java.util.Scanner;

public class OrdenandoNombresAlfabeticamente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] array1 = new String[4];
        System.out.println("Ingrese 4 nombres");
        array1[0] = scan.nextLine();
        array1[1] = scan.nextLine();
        array1[2] = scan.nextLine();
        array1[3] = scan.nextLine();

        char car1 = array1[0].toUpperCase().charAt(0);
        char car2 = array1[1].toUpperCase().charAt(0);
        char car2 = array1[2].toUpperCase().charAt(0);
        char car3 = array1[3].toUpperCase().charAt(0);
        
        int pal1;
        int pal2;
        int pal3;

        switch (car1) {
            case "A" => pal1 = 1;
            case "B" => pal1 = 2;

                
                   
            default:
                break;
        }
            
        }

    }
}
