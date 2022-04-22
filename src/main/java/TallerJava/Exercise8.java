package TallerJava;

import java.util.Scanner;

/*
Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.
 */
public class Exercise8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa un dia de la semana y te dire si es laboral o no");
        String dayWeek = scanner.nextLine().toLowerCase();

        switch (dayWeek){
            case "lunes":
                System.out.println("dia laboral");
                break;
            case "martes":
                System.out.println("dia laboral");
                break;
            case "miercoles":
                System.out.println("dia laboral");
                break;
            case "jueves":
                System.out.println("dia laboral");
                break;
            case "viernes":
                System.out.println("dia laboral");
                break;
            case "sabado":
                System.out.println("dia NO laboral");
                break;
            case "domingo":
                System.out.println("dia NO laboral");
                break;
            default:
                System.out.println("Ingresaste un dia incorrecto");
                break;

        }
    }
}
