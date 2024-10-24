// En esta actividad, desarrollarás un programa que solicitará al usuario 
// ingresar una calificación numérica del 1 al 5. Luego, mostrará en pantalla 
// la calificación correspondiente en letras, utilizando la siguiente escala:
// 1: "Muy deficiente"
// 2: "Deficiente"
// 3: "Suficiente"
// 4: "Notable"
// 5: "Sobresaliente"

import java.util.Scanner;

public class ConversionDeCalificaciones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la calificación correcta:");
        int calificación = scan.nextInt();

        switch (calificación) {
            case 1:
                System.out.println("Muy deficiente");
                break;
            case 2:
                System.out.println("Deficiente");
                break;
            case 3:
                System.out.println("Suficiente");
                break;
            case 4:
                System.out.println("Notable");
                break;
            case 5:
                System.out.println("Sobresaliente");
                break;
            
        
            default:
                System.out.println("La calificación ingresada no es correcta");
                break;
        }
    scan.close();

    }
}
