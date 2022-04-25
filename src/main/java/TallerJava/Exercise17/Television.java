package TallerJava.Exercise17;

public class Television extends Electrodomestico{
    private Double resolucion;
    private boolean sintonizadorTDT;

    public Television(){
        super();
        this.resolucion = 20.0;
        this.sintonizadorTDT = false;
    }

    public Television(double price, double weight){
        super(price, weight);
        this.resolucion = 20.0;
        this.sintonizadorTDT = false;
    }

    public Television(double resolucion, boolean sintonizadorTDT){
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    protected Double precioFinal() {
        Double aumentResolucion = super.precioFinal();
        Double aumentSintonizador = 0.0;
        if (getResolucion() > 40) {
            aumentResolucion += super.precioFinal() + (this.getBasePrice() * 30) / 100;
        }
        if (isSintonizadorTDT()) {
            aumentSintonizador += super.precioFinal() + 50;
        }
        return aumentResolucion + aumentSintonizador;
    }
}
