// En este ejercicio, usarás los operadores de comparación y lógicos en Java.
// Interactuarás con el usuario para comparar dos números ingresados y evaluar
// diversas condiciones utilizando operadores como mayor que, distinto que y divisible
// por dos. De esta manera, comprenderás cómo funcionan y cuál es su sintaxis, así
// como su aplicación en la lógica de programación. Además, realizarás
// comparaciones adicionales utilizando operadores lógicos para evaluar condiciones
// combinadas. Al finalizar el ejercicio, podrás determinar si se cumplen ciertas
// condiciones lógicas establecidas.

// 1. Pide al usuario que ingrese dos números, y:
// a. Compara si el primer número ingresado es mayor al segundo
// número ingresado. Muestra el resultado en consola.
// b. Verifica si el primer número ingresado es distinto al segundo número
// ingresado . Muestra el resultado en consola.
// c. Verifica si el primer número ingresado es divisible por 2 . Muestra el
// resultado en consola.

// 2. Pide al usuario que ingrese otros 2 números, y realiza las siguientes
// validaciones:
// a. Si el número 1 es mayor al número 2 y si el número 3 es mayor al
// número 4.
// b. Si el número 1 es mayor al número 2 o si el número 3 es mayor al
// número 4.

import java.util.Scanner;

public class UsandoLosOperadoresDeComparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            // Pide al usuario que ingrese dos números
        System.out.print("Por favor ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Por favor ingresa el segundo número: ");
        int num2 = scanner.nextInt();

            // Compara si el primer número ingresado es mayor que el segundo
        String mayor = (num1 > num2) ? "mayor" : "no mayor";
        System.out.println("El primer número es " + mayor + " que el segundo.");

            // Verifica si el primer número ingresado es distinto al segundo número ingresado
        String diferente = (num1 != num2) ? "diferente" : "igual";
        System.out.println("El primer número es " + diferente + " al segundo.");

            // Verifica si el primer número ingresado es divisible por 2
        String divisible = (num1 % 2 == 0) ? "divisible" : "no divisible";
        System.out.println("El primer número es " + divisible + " por 2.");

            // Pide al usuario que ingrese otros dos números
        System.out.print("Por favor ingresa el tercer número: ");
        int num3 = scanner.nextInt();

        System.out.print("Por favor ingresa el cuarto número: ");
        int num4 = scanner.nextInt();

            // Valida si el número 1 es mayor que el número 2 y si el número 3 es mayor que el número 4
        String mayor1 = (num1 > num2) ? "mayor" : "no mayor";
        String mayor3 = (num3 > num4) ? "mayor" : "no mayor";
        System.out.println("El número 1 es " + mayor1 + " que el número 2 y el número 3 es " + mayor3 + " que el número 4.");

            // Valida si el número 1 es mayor que el número 2 o si el número 3 es mayor que el número 4
        String mayorO = ((num1 > num2) || (num3 > num4)) ? "mayor" : "no mayor";
        System.out.println("El número 1 es " + mayorO + " que el número 2 o el número 3 es " + mayorO + " que el número 4.");
    
            // Cerrar el scanner para evitar fugas de memoria
        scanner.close();
    }
}
