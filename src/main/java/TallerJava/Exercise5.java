package TallerJava;

/*
Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
 */

import java.util.ArrayList;

public class Exercise5 {

    public static void main(String[] args) {
        int contador = 1;
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();
        while (contador <= 100){
            if(contador % 2 == 0){
                pares.add(contador);
                contador++;
                continue;
            }
            impares.add(contador);
            contador++;
        }
        contador = 0;
        System.out.println("\n Numeros pares ");
        while(contador < pares.size()){
            System.out.print(pares.get(contador) + "-");
            contador++;
        }
        contador = 0;
        System.out.println("\n Numeros impares ");
        while(contador < impares.size()){
            System.out.print(impares.get(contador) + "-");
            contador++;
        }
    }
}
