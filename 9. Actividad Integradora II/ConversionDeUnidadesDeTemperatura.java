// Escribe un programa que cumpla con las siguientes condiciones:
// 1. Solicita al usuario ingresar una temperatura y una unidad de medida: Celsius (C) o Fahrenheit (F).
// 2. Convierte la temperatura a la otra unidad de medida y muestra el resultado en pantalla.

// De Celsius a Fahrenheit	                                    De Fahrenheit a Celsius
// [°F] = ([°C] × 9 ⁄ 5) + 32	                                [°C] = ([°F] − 32) × 5 ⁄ 9

// 3. El programa debe manejar al menos las siguientes situaciones:
// Si ingresa una unidad de medida inválida, mostrará un mensaje de error.
// Si ingresa una temperatura no válida, mostrará un mensaje de error.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversionDeUnidadesDeTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {

            System.out.print("Ingrese la temperatura: ");
            double temperatura = scan.nextDouble();
            System.out.print("\n Ingrese la unidad de medida (C/F): ");
            String unidad = scan.next().toUpperCase();
            double temperaturaFinal;

            if (unidad.equals("C")) {
                temperaturaFinal = (temperatura * 9/5) + 32;
                System.out.println(temperatura + "°" + unidad + " equivalen a " + temperaturaFinal + "°F" + "");
            } else if (unidad.equals("F")) {
                temperaturaFinal = (temperatura - 32) * 9/5;
                System.out.println(temperatura + "°" + unidad + " equivalen a " + temperaturaFinal + "°C" + "");
            } else {
                System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
        } catch (Exception e){
            System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
        }
                
        scan.close();
    }
}