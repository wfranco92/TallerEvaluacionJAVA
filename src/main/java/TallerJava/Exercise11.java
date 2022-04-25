package TallerJava;
/*
Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
 */

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer a = 0;
        Integer e = 0;
        Integer i = 0;
        Integer o = 0;
        Integer u = 0;

        System.out.println("Ingresa una frase");
        String phrase = scanner.nextLine();

        for (int j = 0; j < phrase.length(); j++) {
            char letter = phrase.charAt(j);

            if (letter == 'a') {
                a++;
                continue;
            }
            if( letter == 'e'){
                e++;
                continue;
            }
            if( letter == 'i'){
                i++;
                continue;
            }
            if( letter == 'o'){
                o++;
                continue;
            }
            if( letter == 'u'){
                u++;
            }
        }

        System.out.println("La longitud de la frase es de " + phrase.length() + " caracteres");
        System.out.println("Cantidad de a :" + a);
        System.out.println("Cantidad de e :" + e);
        System.out.println("Cantidad de i :" + i);
        System.out.println("Cantidad de o :" + o);
        System.out.println("Cantidad de u :" + u);


    }
}
