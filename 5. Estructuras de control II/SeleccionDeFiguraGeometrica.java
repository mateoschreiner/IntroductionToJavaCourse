// Mediante una estructura switch, desarrollarás un programa que pida al usuario 
// ingresar un número del 1 al 3 para seleccionar una figura geométrica: 
// 1 para círculo, 2 para cuadrado y 3 para triángulo. Después, solicitará al 
// usuario los datos necesarios para calcular el área de la figura seleccionada. 
// Estos datos serán:
// Para el círculo: el radio.
// Para el cuadrado: el lado.
// Para el triángulo: la base y la altura.
// Finalmente, el programa mostrará en pantalla el área correspondiente a la 
// figura seleccionada.

import java.util.Scanner;

public class SeleccionDeFiguraGeometrica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el número de la figura geométrica deseada:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");

        int menu = scan.nextInt();
        float medida1;
        float medida2;

        switch (menu) {
            case 1:
                System.out.println("Eligió círculo, ingrese el radio");
                medida1 = scan.nextFloat();
                System.out.println("El área es: "+medida1*medida1*Math.PI);
                break;
            case 2:
                System.out.println("Eligio cuadrado, ingrese la dimensión de sus lados:");
                medida1 = scan.nextFloat();
                System.out.println("El área del cuadrado es: "+medida1*medida1);
                break;
            case 3:
                System.out.println("Eligio triángulo, ingrese la base y la altura:");
                medida1 = scan.nextFloat();
                medida2 = scan.nextFloat();
                System.out.println("El área del triángulo es: "+medida1*medida2/2);
                break;
        
            default:
                System.out.println("La opción ingresada no es correcta");
                break;
        }
        scan.close();

    }
}
