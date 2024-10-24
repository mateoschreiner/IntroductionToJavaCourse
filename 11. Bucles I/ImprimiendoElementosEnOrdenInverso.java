// Escribe un programa que recorra un array de enteros y los imprima en orden inverso, comenzando desde el último elemento.. 
// El tamaño y los números  a contener pueden ser de tu elección.

public class ImprimiendoElementosEnOrdenInverso {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6};

        for (int i=numeros.length - 1; i >= 0 ;i--){

            System.out.println("El elemento es: " + numeros[i]);
        }
        
    }
}
