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
        }else{
            System.out.println("la diferencia en longitud es: " + differenceLength(firstWord, secondWord));
            System.out.println("la diferencia en letras de la segunda palabra es: " + differenceLetter(firstWord, secondWord));
        }
    }

    static int differenceLength(String first, String second){
        return Math.abs(first.length()-second.length());
    }

    static String differenceLetter(String first, String second){
        String difference = "";
        int lenght = first.length();
        if(first.length() < second.length()){    // se evalua cual cadena tiene mayor longitud, si es la segunda, se establce la longitud de iteracion del ultimo for
            lenght = second.length();               // si no lo es se empieza a llenar la primera palabra con "a" para poder comparar ambas cadenas y sean de la misma longotud
            for (int i = 0; i <= second.length()-first.length(); i++) {
                first +="a";
            }
        }else{
            for (int i = 0; i <= first.length()-second.length(); i++) {  // si la priemra cadena es mayor en longitud, se llena la segunda cadena con "-" para igualar longitudes y recorrer/comparar
                second +="-";
            }

        }
        for (int i = 0; i < lenght; i++) {
            if(first.charAt(i) != second.charAt(i))
            difference += second.charAt(i);
        }
        return difference;
    }
}
