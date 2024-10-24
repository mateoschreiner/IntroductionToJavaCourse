// Escribe un programa que solicite al usuario que ingrese una contraseña y verifique si cumple con los siguientes criterios para considerarse 
// segura:
// 1. La contraseña debe tener al menos 8 caracteres.
// 2. La contraseña debe contener al menos una letra mayúscula y una letra minúscula.
// 3. La contraseña debe contener al menos un número.
// 4. La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).
// El programa debe mostrar un mensaje indicando si la contraseña es segura o no, según los criterios establecidos. Puedes utilizar métodos 
// de la clase String para verificar cada uno de los criterios.

import java.util.Scanner;

public class ValidacionDeContrasena {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Ingrese una contraseña");
        String pass = scan.nextLine();

        if (pass.length() >= 8) {

            if (pass.matches(".*[A-Z].*") && pass.matches(".*[a-z].*")) {

                if (pass.matches(".*[0-9].*")) {
                    
                    if (pass.matches(".*[^a-zA-Z0-9].*")) {
                        System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
                    } else {
                        System.out.println("Contraseña no segura. Debe tener al menos un carácter especial.");
                    }

                } else {
                    System.out.println("Contraseña no segura. Debe tener al menos un número.");
                }

            } else {
                System.out.println("Contraseña no segura. Debe tener al menos una mayúscula y una minúscula.");
            }

        } else {
            System.out.println("Contraseña no segura. Debe tener al menos 8 caracteres.");
        }

        scan.close();
    }
}
