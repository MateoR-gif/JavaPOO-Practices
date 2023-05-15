public class Television extends Electrodomestico{
    // constants
    private static final double DEF_PULGADAS = 20;
    private static final boolean DEF_SINTONIZADOR = false;

    // attributes
    private double pulgadas;
    private boolean sintonizadorTDT;

    // constructors
    public Television(){
    this(DEF_PRECIOBASE, DEF_COLOR, DEF_CONSUMOENERGETICO, DEF_PESO, DEF_PULGADAS, DEF_SINTONIZADOR);
    }
    public Television(double precioBase, double peso){
        this(precioBase, DEF_COLOR, DEF_CONSUMOENERGETICO, peso, DEF_PULGADAS, DEF_SINTONIZADOR);
    }
    public Television(double precioBase, String color, char consumoEnergetico, double peso, double pulgadas, boolean sintonizadorTDT){
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // methods
    @Override
    public double calcPrecioFinal(){
        double precioAñadido = super.calcPrecioFinal();
        if(pulgadas > 40){
            precioAñadido += precioBase * 0.3;
        }
        if(sintonizadorTDT){
            precioAñadido += (precioAñadido * 0.3) + 50;
        }
        return precioAñadido;
    }

    // getters
    public double getResolucion(){
        return this.pulgadas;
    }

    public boolean getSintonizador(){
        return this.sintonizadorTDT;
    }
}
