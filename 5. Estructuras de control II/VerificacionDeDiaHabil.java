// En este ejercicio, crearás un programa que pedirá al usuario ingresar un número
// del 1 al 7, representando un día de la semana. El programa determinará si 
// ese día es hábil o no. Se mostrará el resultado en pantalla. 
// Se considera que los días hábiles son del 1 al 5 (de lunes a viernes). 
// Utilizaremos la estructura "switch" para implementar este programa. 
// ( Ten en cuenta que los días hábiles son del 1 al 5 (de lunes a viernes).)

import java.util.Scanner;

public class VerificacionDeDiaHabil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7 que corresponde a cada día de la semana:");
        int num1 = scan.nextInt();

        switch (num1) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Es un día hábil");
                break;
            case 6:
            case 7:
                System.out.println("Es un día no hábil");
                break; 
        
            default:
                System.out.println("El número ingresado no corresponde a un día de la semana.");
                break;
        }
    
        scan.close();
    }
}
