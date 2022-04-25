package TallerJava;

/*
Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.
 */

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese valor del primer numero");
            Integer numberOne = Integer.parseInt(scanner.next());
            System.out.println("Ingrese valor del segundo numero");
            Integer numberTwo = Integer.parseInt(scanner.next());

            System.out.println(compareNumber(numberOne, numberTwo));
        } catch (NumberFormatException e) {
            System.out.println("Has ingresado texto, por favor verifica e ingresa solo numeros");
        }


    }

    public static String compareNumber(Integer numberA, Integer numberB) {
        if (numberA < numberB) {
            return "Numero mayor " + numberB;
        }
        if (numberA > numberB) {
            return "Numero mayor " + numberA;
        }
        return "Los numeros son iguales";
    }
}
