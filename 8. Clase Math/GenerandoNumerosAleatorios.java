// Escribe un programa que genere y muestre en pantalla un número aleatorio en el rango del 1 al 355  utilizando el método random() 
// de la clase Math. Puedes utilizar el método floor() para redondear el número aleatorio hacia abajo.

public class GenerandoNumerosAleatorios {
    public static void main(String[] args) {
        int numero = (int)(Math.random()*355 + 1);    
        
        System.out.println(numero);
    }
}
