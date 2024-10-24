// Escribe un programa que te pida que ingreses un número entero y utilice un bucle while para calcular la cantidad de dígitos de ese número. 
// Por ejemplo, el número 4578 tiene 4 dígitos. El programa debe tener en cuenta que el 0 tiene una cifra y también contar las cifras de números 
// negativos.

import java.util.Scanner;

public class NumerosDeDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        int numero = scan.nextInt();
        int contadorCifras = 0;

        if (numero == 0){
            contadorCifras = 1;
        } else {
            while (numero >= 1 || numero <= -1) {
            numero = numero/10;
            contadorCifras++;
            }
        }


        System.out.println("El número ingresado tiene " + contadorCifras + " dígitos");



        scan.close();
    }
}
