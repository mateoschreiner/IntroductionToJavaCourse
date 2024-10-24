// El programa debe crear un array de tamaño 3 que almacene números enteros. Luego, solicita un número al usuario y muestra 
// por consola si ese número está presente en el array o no. Es importante utilizar únicamente las herramientas aprendidas 
// hasta el momento, sin emplear bucles en el proceso.

import java.util.Scanner;

public class BuscandoUnElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int[] arrayNumeros = {1, 5, 9};

System.out.println("Ingrese un numero");
int num = sc.nextInt();

if(num == arrayNumeros[0]){
System.out.println("El numero ingresado se encuentra en la posicion 0");
} else if(num == arrayNumeros[1]){
System.out.println("El numero ingresado se encuentra en la posicion 1");
} else if(num == arrayNumeros[2]){
System.out.println("El numero ingresado se encuentra en la posicion 2");
} else {
System.out.println("El numero ingresado no se encuentra en el array");
}

sc.close();
}

}
