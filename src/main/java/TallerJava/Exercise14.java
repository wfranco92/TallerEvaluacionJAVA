package TallerJava;
/*
14.	Crear un programa que pida un numero por teclado y que imprima por pantalla
los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
 */

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("ingrese el numero (menor a 1000): ");
            number = scanner.nextInt();
        }while(number>1000);


        for(int i = number; i <= 1000; i+=2){
            System.out.print(i + "-");
        }
    }
}
