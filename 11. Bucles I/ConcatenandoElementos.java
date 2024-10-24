// Crea un array del tamaño que prefieras que contenga elementos de tipo cadena. Luego, concatena los elementos en una sola 
// cadena, separados por espacios, e imprime el resultado por consola.

public class ConcatenandoElementos {
    public static void main(String[] args) {
        String[] paises = {"Argentina", "Brasil", "Uruguay", "Chile", "Ecuador", "Bolivia", "Colombia", "Paraguay", "Venezuela", "Perú"};
        String paisesAmerica = "";

        for (String cadena : paises) {
            if (cadena == paises[0]) {
                paisesAmerica = paisesAmerica + cadena;
                
            } else {
                paisesAmerica = paisesAmerica + " " + cadena;
            }
        }
        
        System.out.println(paisesAmerica);
    }
}
