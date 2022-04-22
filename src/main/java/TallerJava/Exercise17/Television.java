package TallerJava.Exercise17;

public class Television extends Electrodomestico{
    private double resolucion;
    private boolean sintonizadorTDT;

    public Television(){
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double price, double weight){
        super(price, weight);
        this.resolucion = 20;
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
    protected double precioFinal(){
        double aumentResolucion = super.precioFinal();
        double aumentSintonizador = 0;
        if(getResolucion() > 40){
            aumentResolucion += super.precioFinal() + (this.getBasePrice()*30)/100;
        }
        if(isSintonizadorTDT()){
            aumentSintonizador += super.precioFinal() + 50;
        }
        return aumentResolucion + aumentSintonizador;
    }
}
