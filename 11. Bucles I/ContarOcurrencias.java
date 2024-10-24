// Escribe un programa que cree un array de 50 elementos de tipo carácter, inicializándolo con una frase elegida. Luego, 
// solicita al usuario un carácter objetivo y cuenta cuántas veces aparece ese carácter en el array. Finalmente, imprime el 
// resultado por consola.
// Por ejemplo, si el array contiene la siguiente frase:
// a	p	r	e	n	d	i	e	n	d	o		j	a	v	a
// y el usuario ingresa el carácter 'd', el programa debería devolver la siguiente salida:
// El carácter "d" aparece 2 veces.
// Si el usuario ingresa el carácter 'z', el programa debería devolver la siguiente salida:
// El carácter "z" no aparece en la frase.

import java.util.Scanner;

public class ContarOcurrencias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce una frase");
        String userInput = scan.nextLine();

        if (userInput.length()<50) {
            System.out.println("La frase ingresada no es correcta. Debe tener al menos 50 caracteres");
        }
        
        char[] arrayFrase = new char[50];
        for (int i = 0; i<50; i++) {
            arrayFrase[i] = userInput.charAt(i);
        }

        System.out.println("Introduce la letra a buscar");
        char letraUser = scan.next().charAt(0);

        int cont = 0;

        for (char i : arrayFrase){
            if(i == letraUser){
                cont++;
            }
        }

        if (cont>1) {
            System.out.println("La letra: (" + letraUser + ") aparece " + cont + " veces!");
        } else if (cont > 0 && cont < 2) {
            System.out.println("La letra: (" + letraUser + ") aparece " + cont + " vez");
        } else {
            System.out.println("La letra: (" + letraUser + ") no aparece en la frase");
        }

        scan.close();

    }
}
