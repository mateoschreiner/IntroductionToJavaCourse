// Implementando el uso de la estructura "switch expression", solicita al 
// usuario que elija entre una de las siguientes dos figuras geométricas:
// Opción 1: "Circulo"
// Opción 2: "Rectangulo"
// Según la figura seleccionada, deberás solicitar que ingrese los valores 
// necesarios para calcular el área o el perímetro de cada figura:
// Para el Círculo: Solicita el valor del radio, ya que PI es una constante.
// Para el Rectángulo: Solicita el valor de la base y de la altura.
// Dentro de la opción elegida, permite al usuario seleccionar si desea conocer el 
// área o el perímetro de dicha figura.
// Realiza los cálculos necesarios y muestra el resultado por consola junto con un
// mensaje adecuado.

import java.util.Scanner;

public class CalculadoraDeAreaYPerimetro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu principal");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");

        int menu = scan.nextInt();

        switch (menu) {
            case 1 -> {
                System.out.println("Eligió círculo, ingrese el radio:");
                float radio = scan.nextFloat();
                System.out.println("Desea calcular el área (1) o el perímetro (2)?");
                int menu2 = scan.nextInt();

                switch (menu2) {
                    case 1 -> System.out.println("El área del círculo es: "+radio*radio*Math.PI);
                    case 2 -> System.out.println("El perímetro del círculo es: "+radio*Math.PI);
                
                    default -> System.out.println("La opción ingresada es incorrecta");
                }

            }
            case 2 -> {
                System.out.println("Eligió rectángulo, ingrese la base y la altura");
                float base = scan.nextFloat();
                float altura = scan.nextFloat();
                System.out.println("Desea calcular el área (1) o el perímetro (2)?");
                int menu2 = scan.nextInt();

                switch (menu2) {
                    case 1 -> System.out.println("El área del rectángulo es: "+base*altura);
                    case 2 -> System.out.println("El perímetro del rectángulo es: "+2*base+2*altura);
                
                    default -> System.out.println("La opción ingresada es incorrecta");
                }
            } 
        
            default -> System.out.println("La opcion ingresada no es correcta");
        }
    scan.close();
    }
}
