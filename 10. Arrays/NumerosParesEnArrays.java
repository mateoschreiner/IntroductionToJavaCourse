// Escribe un programa en el que se cree una variable de tipo array que contenga seis elementos de tipo entero. El programa 
// debe contar la cantidad de elementos pares presentes en el array y mostrar el resultado por consola utilizando solo las 
// herramientas aprendidas hasta el momento.

public class NumerosParesEnArrays {

    public static void main(String[] args) {
        int [] array1 = {5,25,15,68,98,12};
        int contador = 0;

        if (array1[0]%2 == 0) {
            contador++;
        } 
        
        if (array1[1]%2 == 0) {
            contador++;
        } 
        
        if (array1[2]%2 == 0) {
            contador++;
        } 
        
        if (array1[3]%2 == 0) {
            contador++;
        }
        
        if (array1[4]%2 == 0) {
            contador++;
        }
        
        if (array1[2]%2 == 0) {
            contador++;
        }

        System.out.println("El número de elementos pares es: " + contador);
    }
}