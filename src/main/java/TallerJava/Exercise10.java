package TallerJava;
/*
Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
 */

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una frase para eliminar sus espacios y mostralo en consola");
        String [] arrayPhrase = scanner.nextLine().split(" ");

        for (String e: arrayPhrase){
            System.out.print(e);
        }
    }
}
