package TallerJava;
/*
Del texto, “La sonrisa sera la mejor arma contra la tristeza”
Reemplaza todas las a del String anterior por una e,
adicionalmente concatenar a esta frase una adicional que ustedes
quieran incluir por consola y las muestre luego unidas.
 */

public class Exercise9 {

    public static void main(String[] args) {

        String originalPhrase = "La sonrisa sera la mejor arma contra la tristeza";
        String secondPhrase;

        secondPhrase = originalPhrase.replace('a', 'e');

        System.out.println(secondPhrase + ".... suena mejor asi en frances!!!!");

    }
}
