// Genera un array de 20 elementos de tipo float, inicializándolo con los números de tu elección. Luego, suma todos los 
// elementos del array y calcula su promedio. Finalmente, muestra por consola tanto el resultado de la suma como el promedio 
// de los elementos.Te sugerimos implementar el uso de la sintaxis de for-each.

public class CalculandoElPromedio {
    public static void main(String[] args) {
        float[] notas = {5,8,9,7,6,10,5,7,8,9,3,4,8,5,6,6,8,2,7,9};
        float total = 0;
        for (float nota : notas){
            total = total + nota;
        }
        float prom = total / notas.length;
        System.out.println("El promedio de notas es: " + prom);
        
    }
}
