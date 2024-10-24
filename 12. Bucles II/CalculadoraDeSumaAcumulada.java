// Crea un programa que solicite al usuario ingresar una serie de números enteros positivos. Utiliza un bucle do-while para ir acumulando 
// la suma de los números ingresados. Después de cada entrada de número, pregunta al usuario si desea ingresar otro número. Si el usuario 
// responde afirmativamente, continúa solicitando números; de lo contrario, muestra la suma acumulada de todos los números ingresados y termina 
// el programa.

import java.util.Scanner;

public class CalculadoraDeSumaAcumulada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        int num;
        String siNo;


        do {
            System.out.println("Ingrese un número");
            num = scan.nextInt();
            suma = suma + num;

            do {System.out.println("¿Desea seguir ingresando números? (s / n)");
            siNo = scan.next();
            siNo = siNo.toLowerCase();
            } while (!siNo.equals("s") && !siNo.equals("n"));

        } while (siNo.equals("s"));

        System.out.println("La suma acumulada es: " + suma);

        scan.close();
    }
}
