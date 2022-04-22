package TallerJava;

import java.util.Scanner;

/*
Lee un número por teclado que pida el precio de un producto (puede tener decimales)
y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 */
public class Exercise4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double IVA = 21;
        double finalPrice;
        System.out.println("Ingrese el precio del producto: ");
        double priceProduct = scanner.nextDouble();

        finalPrice = priceProduct + (priceProduct * IVA / 100);

        System.out.println("El producto mas IVA tiene un precio de: " + finalPrice);
    }
}
