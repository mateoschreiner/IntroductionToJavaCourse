import java.util.Scanner;

public class ProgramaIdentificadorDeNumeroParOImpar {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num1 = miScanner.nextInt();
        
        // String mensaje = (num1 % 2 == 0) ? "El número es par" : "El número es impar";
        System.out.println(num1 % 2 == 0 ? "El número es par" : "El número es impar");
        miScanner.close();
    }
    }