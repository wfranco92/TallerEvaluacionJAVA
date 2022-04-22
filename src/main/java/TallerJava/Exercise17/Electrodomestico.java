package TallerJava.Exercise17;

import java.util.HashMap;
import java.util.Map;

public class Electrodomestico {

    protected double basePrice;
    protected String color;
    protected char energyConsumption;
    protected double weight;

    public Electrodomestico(){
        this.basePrice = 100;
        this.color = "blanco";
        this.energyConsumption = 'F';
        this.weight = 5;
    }

    public Electrodomestico(double price, double weight){
        this.basePrice = price;
        this.color = "blanco";
        this.energyConsumption = 'F';
        this.weight = weight;
    }

    public Electrodomestico(double price, String color, char energyConsumption, double weight){
        this.basePrice = price;
        this.color = comprobarColor(color);
        this.energyConsumption = comprobarConsumoEnergetico(energyConsumption);
        this.weight = weight;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public double getWeight() {
        return weight;
    }

    private char comprobarConsumoEnergetico(char letter){
        char [] letterConsum = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char a: letterConsum){
            if(a == letter){
                return a;
            }
        }
        return 'F';
    }

    private String comprobarColor(String color){

        String [] arrayColors = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String word: arrayColors){
            if(word.equals(color.toLowerCase())){
                return word;
            }
        }
        return "blanco";
    }

    protected double precioFinal(){

        return getBasePrice() + priceAumentByConsume() + priceAumentByWeight();
    }

    private double priceAumentByConsume() {

        Map<Character, Double> priceAumentByConsume = new HashMap<>();
        priceAumentByConsume.put('A', 100.0);
        priceAumentByConsume.put('B', 80.0);
        priceAumentByConsume.put('C', 60.0);
        priceAumentByConsume.put('D', 50.0);
        priceAumentByConsume.put('E', 30.0);
        priceAumentByConsume.put('F', 10.0);

        double aument = 0;
        for (char value : priceAumentByConsume.keySet()) {
            if (value == getEnergyConsumption()) {
                aument += priceAumentByConsume.get(value);
                break;
            }
        }
        return aument;
    }

    private double priceAumentByWeight(){

        double aument = 0;
        double rangeWeight = getWeight();
        if(rangeWeight <= 19){
            aument += 10;
        }else if(rangeWeight >= 20 && rangeWeight <= 49){
            aument += 50;
        }else if(rangeWeight >=50  && rangeWeight <= 79){
            aument += 80;
        }else{
            aument += 100;
        }
        return aument;
    }

}


