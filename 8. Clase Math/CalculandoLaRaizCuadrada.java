// Escribe un programa que pida al usuario un número positivo y calcule su raíz cuadrada utilizando el método sqrt() de la clase Math. 
// Si el número ingresado es negativo, muestra un mensaje adecuado en pantalla.

import java.util.Scanner;

public class CalculandoLaRaizCuadrada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número positivo");
        double numero = scan.nextDouble();

        if (numero < 0) {
            System.out.println("No se puede calcular la raíz al ser un número negativo");
        } else {
            double raiz = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es " + raiz);
        }

        scan.close();
    }
}
