// Escribe un programa que pida al usuario que ingrese dos números enteros y 
// realice la división del primer número entre el segundo número. Implementa un 
// bloque "try-catch" para manejar la excepción en caso de que se intente realizar 
// una división por cero. En caso de que ocurra la excepción, muestra un mensaje 
// apropiado en la pantalla.



import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        

        try {

            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int resultado;
            resultado = num1 / num2;
            System.out.println("El resultado es: "+resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: No es posible dividir por 0");
        } catch (InputMismatchException e) {
            System.out.println("Error, el valor ingresado no es un número");
        } catch (Exception e){
            System.out.println("Error");
        }
        scan.close();
    }
}