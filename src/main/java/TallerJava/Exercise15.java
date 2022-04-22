package TallerJava;
/*
15.	Hacer un programa que muestre el siguiente menú de opciones
****** GESTION CINEMATOGRÁFICA ********
1-NUEVO ACTOR
2-BUSCAR ACTOR
3-ELIMINAR ACTOR
4-MODIFICAR ACTOR
5-VER TODOS LOS ACTORES
6- VER PELICULAS DE LOS ACTORES
7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
8-SALIR

EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI
EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.

 */

import java.util.Scanner;

public class Exercise15 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option;

        do {
            option = menu();

            switch (option) {
                case 1:
                    menu();
                    break;
                case 2:
                    menu();
                    break;
                case 3:
                    menu();
                    break;
                case 4:
                    menu();
                    break;
                case 5:
                    menu();
                    break;
                case 6:
                    menu();
                    break;
                case 7:
                    menu();
                    break;
                case 8:
                    System.out.println("Programa finalizado.......");
                    System.exit(0);
                    break;
                default:
                    System.out.println("OPCION INCORRECTO");
                    break;
            }
        }while(option !=8);
    }

    public static int menu(){


        System.out.println("****** GESTION CINEMATOGRÁFICA ********");
        System.out.println("1-NUEVO ACTOR");
        System.out.println("2-BUSCAR ACTOR");
        System.out.println("3-ELIMINAR ACTOR");
        System.out.println("4-MODIFICAR ACTOR");
        System.out.println("5-VER TODOS LOS ACTORES");
        System.out.println("6- VER PELICULAS DE LOS ACTORES");
        System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
        System.out.println("8-SALIR");

        return scanner.nextInt();

    }
}
