package TallerJava.Exercise17;

public class Lavadora extends Electrodomestico{
    private Double carga;

    public Lavadora(){
        super();
        this.carga = 5.0;
    }

    public Lavadora(double price, double weight){
        super(price, weight);
        this.carga = 5.0;
    }

    public Lavadora(double carga){
        super();
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    protected Double precioFinal() {
        if (getCarga() > 30) {
            return super.precioFinal() + 50;
        }
        return super.precioFinal();
    }
}
