public abstract class Electrodomestico implements PrecioCalculable{
    // constants
    protected static final double DEF_PRECIOBASE = 100;
    protected static final String DEF_COLOR = "blanco";
    protected static final double DEF_PESO = 5;
    protected static final char DEF_CONSUMOENERGETICO = 'F';
    // attributes
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    // constructors
    /**
     * Description: Construir un objeto de la clase Electrodomestico
     * */
    public Electrodomestico(){
        this(DEF_PRECIOBASE, DEF_COLOR, DEF_CONSUMOENERGETICO, DEF_PESO);
    }
    /**
     * Description: Construir un objeto de la clase Electrodomestico
     * @param precioBase -> precioBase del electrodoméstico;
     * @param peso -> peso del electrodoméstico;
     * */
    public Electrodomestico(double precioBase, double peso){
        this(precioBase, DEF_COLOR, DEF_CONSUMOENERGETICO, peso);
    }
    /**
     * Description: Construir un objeto de la clase Electrodomestico
     * @param precioBase -> precioBase del electrodoméstico;
     * @param color -> color del electrodoméstico;
     * @param consumoEnergetico -> consumo energético ('A', 'B', ... 'E', 'F');
     * @param peso -> peso del electrodoméstico;
     * */
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    //methods
    private void comprobarConsumoEnergetico(char letra){
        char[] nivelesConsumo = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char nivel : nivelesConsumo) {
            if (nivel == letra){
                this.consumoEnergetico = letra;
                return;
            }
        }
        this.consumoEnergetico = DEF_CONSUMOENERGETICO;
    }
    private void comprobarColor(String color){
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        String lowerColor = color.toLowerCase();
        for (String colorLista : colores) {
            if(colorLista.equals(lowerColor)){
                this.color = lowerColor;
                return;
            }
        }
        this.color = DEF_COLOR;
    }
    @Override
    public double calcPrecioFinal(){
        double precioAñadido = 0;
        switch (consumoEnergetico){
            case 'A':
                precioAñadido += 100;
                break;
            case 'B':
                precioAñadido += 80;
                break;
            case 'C':
                precioAñadido += 60;
                break;
            case 'D':
                precioAñadido += 50;
                break;
            case 'E':
                precioAñadido += 30;
                break;
            case 'F':
                precioAñadido += 10;
                break;
        }
        if(peso >= 0 && peso <= 19){
            precioAñadido += 10;
        } else if (peso >= 20 && peso <= 49) {
            precioAñadido += 50;
        } else if (peso >= 50 && peso <= 79) {
            precioAñadido += 80;
        } else if (peso >= 80) {
            precioAñadido += 100;
        }
        return precioBase + precioAñadido;
    }

    // getters
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
}
