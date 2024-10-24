// Escribe un programa que genere un array de 10 elementos de tipo entero. Inicializa cada elemento con un número aleatorio 
// menor a 100 y luego imprime todos los elementos del array en una única línea. Posteriormente, recorre el array para contar 
// los elementos pares y muestra el total en la consola.

import java.util.Random;

public class ContandoElementosPares {
    public static void main(String[] args) {
        int[] enteros = new int[10];
        Random random = new Random();

        for (int i = 0 ; i < enteros.length; i++){
            enteros[i] = random.nextInt(100) + 1;

            if (i< enteros.length -1) {
                System.out.print(enteros[i] + ", ");
            } else {
                System.out.println(enteros[i]);
            }
        }

        int contador = 0;

        for (double numero:enteros) {

            if (numero % 2 == 0){
                contador = contador + 1;
            }
        }
        

        System.out.println("El número de números pares es: "+ contador);


    }
}
