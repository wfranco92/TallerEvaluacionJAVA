package TallerJava;

/*
Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
 */

public class Exercise1 {

    static String message;

    public static void main(String[] args) {

        int numberOne = 5;
        int numberTwo = 13;

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
