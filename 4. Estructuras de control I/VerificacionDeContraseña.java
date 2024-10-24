// En este ejercicio, escribirás un programa que pida al usuario una 
// contraseña y verificará si coincide con una contraseña predefinida.
// Si la contraseña ingresada es correcta, se mostrará un mensaje de
// "Acceso concedido". En caso contrario, se mostrará un mensaje de 
// "Acceso denegado".

import java.util.Scanner;

public class VerificacionDeContraseña {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String pass = "hola";
        System.out.println("Ingrese la contraseña");
        String passUser = scan.nextLine();
        
        if (passUser.equals(pass)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        scan.close();
    }
}
