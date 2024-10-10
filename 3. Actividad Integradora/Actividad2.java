import java.util.Scanner;

public class Actividad2 {
public static void main(String[] args) {
Scanner miScanner = new Scanner(System.in);
int num1;
int num2;
int opcion;
float resultado;
System.out.println("CALCULADORA");
System.out.println("Ingrese un número: ");
num1 = miScanner.nextInt();
System.out.println("Ingrese otro número: ");
num2 = miScanner.nextInt();
System.out.println("Elija qué operación quiere realizar");
System.out.println("1 - suma");
System.out.println("2 - resta");
System.out.println("3 - multiplicación");
System.out.println("4 - división");
opcion = miScanner.nextInt();
resultado = (opcion == 1) ? (num1 + num2) :
(opcion == 2) ? (num1 - num2) :
(opcion == 3) ? (num1 * num2) :
(opcion == 4) && (num2 != 0) ? ((float)num1 / (float)num2) : 0;
System.out.println("El resultado es " + resultado);
}
}