package TallerJava.Exercise16;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        String name;
        Short age;
        String sex;
        Double weight;
        Double height;
        String[] message = {"por debajo de su peso ideal", "está en su peso ideal", "tiene sobrepeso",};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre");
        name = scanner.nextLine();
        System.out.println("Ingrese edad");
        age = Short.parseShort(scanner.nextLine());
        System.out.println("Ingrese sexo");
        sex = scanner.nextLine();
        System.out.println("Ingrese peso");
        weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese altura");
        height = Double.parseDouble(scanner.nextLine());

        Persona persona1 = new Persona(name, age, sex, weight, height);
        Persona persona2 = new Persona(name, age, sex);
        Persona persona3 = new Persona();

        persona2.setWeight(70.2);
        persona2.setHeight(1.72);

        persona3.setName("Orlando Bloom");
        persona3.setAge((short) 16);
        persona3.setSex("H");
        persona3.setWeight(77.5);
        persona3.setHeight(1.78);

        System.out.println("Persona 1 " + message[persona1.calcularIMC()]);
        System.out.println("Persona 2 " + message[persona2.calcularIMC()]);
        System.out.println("Persona 3 " + message[persona3.calcularIMC()]);

        System.out.println("Persona 1 " + (persona1.esMayorDeEdad() ? "Es mayor de edad" : "Es menor de edad"));
        System.out.println("Persona 2 " + (persona2.esMayorDeEdad() ? "Es mayor de edad" : "Es menor de edad"));
        System.out.println("Persona 3 " + (persona3.esMayorDeEdad() ? "Es mayor de edad" : "Es menor de edad"));

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());


    }
}
