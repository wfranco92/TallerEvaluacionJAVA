package TallerJava;
/*
Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
 */

import java.util.Scanner;

public class Exercise7 {


    public static void main(String[] args) {

        Integer number;

        Scanner scanner = new Scanner(System.in);

        try {
            do {
                System.out.println("Ingrese el numero a evaluar: ");
                number = Integer.parseInt(scanner.next());
            } while (number < 0);
            System.out.println("el numero correcto ingresado es: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Has ingresado texto, por favor verifica e ingresa solo numeros");
        }

    }
}
