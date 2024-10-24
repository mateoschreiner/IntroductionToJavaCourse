// Desarrolla un programa que cree un array de tamaño 5 que almacene números enteros. Luego, suma los elementos ubicados en las posiciones 
// pares del array (es decir, las posiciones 0, 2 y 4) y muestra por consola el resultado de la suma. Utiliza exclusivamente las herramientas 
// aprendidas hasta el momento.

public class SumandoElementosEnPosicionesPares {
    public static void main(String[] args) {
        int[] array = {1, 6, 7, 9, 12};

        int suma = array[0] + array[2] + array[4];
        System.out.println("La suma de los índices pares es: " + suma);
    }
}
