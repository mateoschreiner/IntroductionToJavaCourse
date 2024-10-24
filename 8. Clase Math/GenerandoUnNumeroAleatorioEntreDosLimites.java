// Escribe un programa que pida al usuario ingresar dos números enteros: un límite inferior y un límite superior. Luego, utiliza el método 
// random() de la clase Math para generar y mostrar en pantalla un número aleatorio dentro del rango especificado por los límites ingresados.

import java.util.Scanner;

public class GenerandoUnNumeroAleatorioEntreDosLimites {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el límite inferior");
        int limiteInferior = scan.nextInt();
        System.out.println("Ingrese el límite superior");
        int limiteSuperior = scan.nextInt() + 1;

        int numero = (int)(limiteInferior + Math.random()*(limiteSuperior-limiteInferior));
        System.out.println("El número generado es: " + numero);

        scan.close();
    }
}