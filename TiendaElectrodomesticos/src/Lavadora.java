public class Lavadora extends Electrodomestico{
    // constants
    private static double DEF_CARGA = 5;

    // attributes
    private double carga;

    // constructors
    public Lavadora() {
        this(DEF_PRECIOBASE, DEF_COLOR, DEF_CONSUMOENERGETICO, DEF_PESO, DEF_CARGA);
    }

    public Lavadora(double precioBase, double peso) {
        this(precioBase, DEF_COLOR, DEF_CONSUMOENERGETICO, peso, DEF_CARGA);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    // methods
    @Override
    public double calcPrecioFinal(){
        double precioAñadido = super.calcPrecioFinal();
        if(carga > 30){
            precioAñadido += 50;
        }
        return precioAñadido;
    }

    // getters
    public double getCarga() {
        return carga;
    }
}
