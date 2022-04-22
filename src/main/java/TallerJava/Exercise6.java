package TallerJava;
/*
Realiza el ejercicio anterior usando un ciclo for.
 */

import java.util.ArrayList;

public class Exercise6 {

    public static void main(String[] args) {
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();

        for (int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                pares.add(i);
                continue;
            }
            impares.add(i);
        }

        System.out.println("\n Numeros pares ");
        for (int i = 1; i < pares.size(); i++){
            System.out.print(pares.get(i) + "-");
        }

        System.out.println("\n Numeros impares ");
        for (Integer element: impares){
            System.out.print(element +"-");
        }
    }
}
