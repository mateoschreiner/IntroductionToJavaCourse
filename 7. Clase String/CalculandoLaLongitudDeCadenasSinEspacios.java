// En esta actividad, se solicita al usuario ingresar una cadena de texto y calcular su longitud, pero esta vez sin contar 
// los espacios en blanco. Para lograr esto, se utilizará el método length() de la clase String y se realizará un proceso 
// adicional para excluir los espacios de la cuenta.

import java.util.Scanner;

public class CalculandoLaLongitudDeCadenasSinEspacios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = scan.nextLine();

        System.out.println(frase.length());

        frase = frase.replace(" ", "");
        System.out.println(frase.length());
        
        scan.close();

    }
}
