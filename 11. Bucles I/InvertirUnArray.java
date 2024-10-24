// Escribe un programa que recorra un array de enteros y lo invierta, es decir, que el primer elemento se convierta en el último y viceversa, 
// luego imprime el array resultante por consola.  El tamaño y los números  a contener pueden ser de tu elección.
// IMPORTANTE: Debes invertir de forma permanente el orden de los elementos. Analiza si necesitas hacer uso de elementos auxiliares para 
// concluir el ejercicio. 

public class InvertirUnArray {
    public static void main(String[] args) {
        int[] enteros = {1,2,3,4,5};
        int[] control = new int[enteros.length];

        for (int i = 0; i<enteros.length; i++) {
            control[i] = enteros[i];
        }

        for (int i = 0; i<enteros.length; i++){
            enteros[i] = control[enteros.length-1-i];
            System.out.print(enteros[i] + " ");
        }
    }
}
