// Escribe un programa que recorra un array de enteros y encuentre el valor mínimo presente en el array. El tamaño y los números
// a contener pueden ser de tu elección.

public class EncontrandoElValorMinimo {
    public static void main(String[] args) {
        int[] array1 = {12,13,15,10,18};
        int minimo = array1[0];

        for(int i=1; i<array1.length;i++){

            if (array1[i]<minimo) {
                minimo =array1[i];
            }
        }

        System.out.println("El número mínimo es: " + minimo);
    }
}
