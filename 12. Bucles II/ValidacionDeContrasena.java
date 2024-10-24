// Escribe un programa que solicite que ingreses una contraseña y la valide utilizando un bucle while. La contraseña correcta es "secreto". 
// Continuará pidiéndote que ingreses la contraseña hasta que sea correcta.

import java.util.Scanner;

public class ValidacionDeContrasena {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la contraseña");
        String userPass = scan.nextLine();

        while (!userPass.equals("secreto")) {
            System.out.println("Contraseña incorrecta, intente nuevamente");
            userPass = scan.nextLine();
        }

        System.out.println("Contraseña correcta");
            
        scan.close();
    }
}
