package TallerJava;

/*
Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.
 */

import java.util.Scanner;

public class Exercise2 {

    static String message;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese valor del primer numero");
        int numberOne = scanner.nextInt();
        System.out.println("Ingrese valor del segundo numero");
        int numberTwo = scanner.nextInt();

        System.out.println(message = compareNumber(numberOne, numberTwo));

    }
    public static String compareNumber(int numberA, int numberB){
        if(numberA < numberB){
            return "Numero mayor " + numberB;
        }
        if(numberA > numberB){
            return "Numero mayor " + numberA;
        }
        return "Los numeros son iguales";
    }
}
