package TallerJava;

/*
Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
 */

public class Exercise1 {
    public static void main(String[] args) {

        Integer numberOne = 15;
        Integer numberTwo = 13;

        System.out.println(compareNumber(numberOne, numberTwo));

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
