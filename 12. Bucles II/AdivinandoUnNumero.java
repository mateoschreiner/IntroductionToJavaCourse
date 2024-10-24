// Escribe un programa que genere un número aleatorio entre 1 y 20, y muestra por consola un mensaje pidiéndote que adivines ese número 
// utilizando un bucle do-while. El programa te indicará si el número que ingresas es mayor o menor que el número aleatorio, y seguirá 
// pidiéndote que adivines hasta que lo hagas correctamente.

import java.util.Scanner;

public class AdivinandoUnNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero  = (int)(Math.random()*20 + 1);
        int numeroUsuario;
        System.out.println(numero);

        do {
            System.out.println("Por favor ingrese un número entre 1 y 20");
            numeroUsuario = scan.nextInt();
        } while (numeroUsuario < 1 || numeroUsuario > 20);

        do {
            if (numeroUsuario > numero) {
                System.out.println("El número ingresado es mayor al número generado");
                System.out.println("Ingrese otro número");
                numeroUsuario = scan.nextInt();

            } else if (numeroUsuario < numero){
                System.out.println("El número ingresado es menor al número generado");
                System.out.println("Ingrese otro número");
                numeroUsuario = scan.nextInt();
            }
            

        } while (numeroUsuario != numero);

        System.out.println("El número ingresado es el correcto");

        scan.close();


    }
}
