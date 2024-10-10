// En esta actividad, escribirás un programa que solicite al usuario ingresar un 
// número del 1 al 7, que representará un día de la semana. Luego, el programa 
// mostrará en pantalla el nombre correspondiente a ese día. Utilizaremos la 
// estructura "switch" para implementar este programa.

import java.util.Scanner;

public class EjercicioDeDiasDeLaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7:");
        int num1 = scan.nextInt();

        switch (num1) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;


            default:
            System.out.println("El número ingresado es incorrecto");
                break;
        }
        scan.close();
    
    }
    
}