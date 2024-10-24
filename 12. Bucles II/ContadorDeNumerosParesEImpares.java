// Escribe un programa que solicite al usuario ingresar una serie de números enteros. Utiliza un bucle while para contar la cantidad de números 
// pares e impares ingresados hasta que el usuario decida terminar la entrada de números. Al finalizar, muestra la cantidad de números pares e 
// impares ingresados

import java.util.Scanner;

public class ContadorDeNumerosParesEImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contPares = 0;
        int contImpares = 0;
        int num = 1;

        while (num != 0) {
                       
            System.out.println("Ingrese un número distinto de 0 (Si quiere finalizar ingrese 0)");
            num = scan.nextInt();

            if(num != 0 && num % 2 == 0){
                contPares++;
            } else if (num != 0 && num % 2 != 0) {
                contImpares++;
            }
           
        }

        System.out.println("La cantidad de números pares es: " + contPares);
        System.out.println("La cantidad de números impares es: " + contImpares);
        System.out.println("Programa finalizado");


        scan.close();
    }
}
