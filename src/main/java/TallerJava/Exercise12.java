package TallerJava;
/*
12.	Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
 */

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord;
        String secondWord;

        System.out.println("Ingrese primera palabra");
        firstWord = scanner.nextLine();
        System.out.println("Ingrese segunda palabra");
        secondWord = scanner.nextLine();

        if(firstWord.equals(secondWord)){
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("la diferencia en longitud es: " + differenceLength(firstWord, secondWord));
            System.out.println("la diferencia en letras de la segunda palabra es: " + differenceLetter(firstWord, secondWord));
        }
    }

    static int differenceLength(String first, String second) {
        return Math.abs(first.length() - second.length());
    }

    /**
     * metodo estatico para verificar la diferencia first con respecto a second.
     * No se utiliza libreria String.util y se crea un metodo manual. Si las cadenas tienen longitud diferente. A traves de un condicional
     * y de un ciclo FOR, e evalua la diferencia y se igualan las longitudes de los parametors con caracteres de relleno. Lo anterior para que cuando se compare
     * caracter a caracter de la cadena, no arroje una excepcion NullPointerExcepcion, en la palabra mas corta.
     *
     * @param first  primera palabra para comparar
     * @param second segunda palabra para comparar con respecto  a first
     * @return String con la cadena de caracteres de diferencia
     */
    static String differenceLetter(String first, String second) {
        StringBuilder difference = new StringBuilder();
        int lenght = first.length();
        if (first.length() < second.length()) {
            lenght = second.length();
            //int contador = second.length() - first.length();
            for (int i = 0; i <= lenght ; i++) {
                first += " ";
            }
        } else {
            for (int i = 0; i <= lenght ; i++) {
                second += " ";
            }
        }
        for (int i = 0; i < lenght; i++) {
            if (first.charAt(i) != second.charAt(i)) {
                difference.append(second.charAt(i));
                if(second.charAt(i) == ' '){
                    difference.append(first.charAt(i));
                }
            }
        }
        return difference.toString();
    }
}
