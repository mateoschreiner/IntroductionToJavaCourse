// Escribe un programa en el cual se cree una variable de tipo array que contenga tres elementos de tipo entero.
// El programa debe sumar los tres elementos de forma manual e imprimir por consola el resultado utilizando solamente 
// las herramientas adquiridas hasta el momento.

public class SumandoElementos {

    public static void main(String[] args) {
        int [] array1 = {5,8,6};
        int suma = (array1[0] + array1 [1] + array1 [2]);
        System.out.println("La suma de elementos es: " + suma);
    }
}