// En esta actividad, practicarás el uso de operaciones aritméticas en Java. A través de la realización de diversas operaciones entre números, 
// fortalecerás tu conocimiento sobre las operaciones básicas disponibles en el lenguaje, como la suma (+), resta (-), multiplicación (*), 
// división (/) y módulo (%).

// Realizarás operaciones tanto con valores predeterminados como con valores ingresados por el usuario por teclado.

// Aplica lo aprendido resolviendo los siguientes ejercicios:
// 1. Declara dos variables, y asígnales un valor a cada una de ellas.
// 2. Realiza las 5 operaciones básicas posibles en Java y muestra el resultado en consola. Te animamos a mostrar el resultado dentro de un texto 
// para que se vea ordenado el resultado, Ej: La suma de las 2 variables es : “[resultado]”;
// 3. Posteriormente, pide al usuario que ingrese dos números, guardarlos en variables previamente declaradas, realiza la suma de los números y 
// muestra el resultado en la consola.

import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 25;

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        double modulo = num1 % num2;

        System.out.println("La suma de las dos variables es " + suma);
        System.out.println("La resta de las dos variables es " + resta);
        System.out.println("La multiplicación de las dos variables es " + multiplicacion);
        System.out.println("La división de las dos variables es " + division);
        System.out.println("El módulo de las dos variables es " + modulo);

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese dos númros");
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        System.out.println("La suma de ambos números es: " + (num1 + num2));

        scan.close();
    }
}
