package TallerJava.Exercise16;

public class Persona {
    private String name;
    private Short age;
    private final String dni;
    private String sex;
    private Double weight;
    private Double height;

    public Persona() {
        this.name = "";
        this.age = 0;
        this.dni = generarDNI();
        this.sex = "H";
        this.weight = 0.0;
        this.height = 0.0;

        comprobarSexo(this.sex);
    }

    public Persona(String name, short age, String sex){
        this.name = name;
        this.age = age;
        this.dni = generarDNI();
        this.sex = sex;
        this.weight = 0.0;
        this.height = 0.0;

        comprobarSexo(this.sex);
    }

    public Persona(String name, short age, String sex, Double weight, Double height) {
        this.name = name;
        this.age = age;
        this.dni = generarDNI();
        this.sex = sex;
        this.weight = weight;
        this.height = height;

        comprobarSexo(this.sex);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int calcularIMC(){
        int value = 1;

        double idealWeight = (weight)/(Math.pow(height, 2));

        if(idealWeight < 20){
            value = 0;
        }

        if(idealWeight > 25){
            value = 2;
        }

        return value;
    }

    public boolean esMayorDeEdad(){
        if(age >= 18){
            return true;
        }
        return false;
    }

    private void comprobarSexo(String sex){
        if(!(this.sex.equals("H"))){
            setSex("H");
        }
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age +
                ", dni=" + dni +
                ", sex=" + sex +
                ", weight=" + weight +
                ", height=" + height;
    }

    private String generarDNI(){

        int number;
        char letter;

        number = numberDNI();
        letter = letterDNI(number);

        return String.valueOf(number) + letter;

    }

    private int numberDNI(){
        return (int) (Math.random()*100000000);
    }

    private char letterDNI(int number){

        int mod = number % 23;

        final char [] letters = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        return letters[mod];

    }

}
