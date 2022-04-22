package TallerJava;

import java.util.Scanner;

/*
Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
 (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
 */
public class Exercise3 {
    public static void main(String[] args) {

        double area;
        Scanner scanner = new Scanner(System.in);
        final Double PI = Math.PI;
        System.out.println("Ingresa la longitud del radio: ");
        double radio = scanner.nextDouble();

        area = PI * (Math.pow(radio, 2));
        System.out.println("el area del circulo es: " + area);

    }
}
