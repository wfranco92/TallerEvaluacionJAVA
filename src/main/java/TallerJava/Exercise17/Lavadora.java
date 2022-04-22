package TallerJava.Exercise17;

public class Lavadora extends Electrodomestico{
    private double carga;

    public Lavadora(){
        super();
        this.carga = 5;
    }

    public Lavadora(double price, double weight){
        super(price, weight);
        this.carga = 5;
    }

    public Lavadora(double carga){
        super();
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    protected double precioFinal(){
        if(getCarga() > 30){
            return  super.precioFinal() + 50;
        }
        return super.precioFinal();
    }
}
