package TallerJava.Exercise17;

public class App {

    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        Double precioTelevisores = 0.0;
        Double precioLavadoras = 0.0;
        Double precioElectrodomesticos = 0.0;

        electrodomesticos[0] = new Lavadora();
        electrodomesticos[1] = new Electrodomestico();
        electrodomesticos[2] = new Electrodomestico();
        electrodomesticos[3] = new Lavadora();
        electrodomesticos[4] = new Television();
        electrodomesticos[5] = new Lavadora();
        electrodomesticos[6] = new Lavadora();
        electrodomesticos[7] = new Electrodomestico();
        electrodomesticos[8] = new Electrodomestico();
        electrodomesticos[9] = new Television();

        for (Electrodomestico elec: electrodomesticos){

            precioElectrodomesticos += elec.precioFinal();

            if(elec instanceof Television){
                precioTelevisores += elec.precioFinal();
                continue;
            }
            if(elec instanceof Lavadora){
                precioLavadoras += elec.precioFinal();
            }

        }
        System.out.println("precio Televisores " + precioTelevisores);
        System.out.println("precio Lavadoras " + precioLavadoras);
        System.out.println("precio Electrodomesticos " + precioElectrodomesticos);
    }

}
