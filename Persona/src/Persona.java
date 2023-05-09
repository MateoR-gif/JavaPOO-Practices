import java.util.Random;

public class Persona {
    // constants
    private final static char SEXO_DEF = 'H';
    public static final int INFRAPESO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;
    // atributes
    private String nombre;
    private char sexo;
    private int DNI;
    private int edad;
    private double peso;
    private double altura;
    // constructors
    public Persona(){
        this("", 0, 'H', 0, 0);
    }
    public Persona(String nombre, int edad, char sexo){
        this(nombre, edad, sexo, 0, 0);
    }
    /**
     * @param nombre
     * @param edad
     * @param sexo
     * @param peso
     * @param altura
     * */
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.DNI = generaDNI();
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;

        comprobarSexo();
    }

    // methods
    public int calcularIMC(){
        double alturaCuadrada = Math.pow(altura, 2);
        double IMC = peso / alturaCuadrada;
        if(IMC < 20){
            return INFRAPESO;
        } else if (IMC > 25) {
            return SOBREPESO;
        }
        return PESO_IDEAL;
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    private void comprobarSexo(){
        if(this.sexo != 'H' && this.sexo != 'M'){
            this.sexo = SEXO_DEF;
        }
    }

    private int generaDNI(){
        Random random = new Random();
        int randomDNI = 100000000 + Math.abs(random.nextInt()) * 900000000;
        return randomDNI;
    }
    @Override
    public String toString() {
        String sexo;
        String msg = "";
        int IMC = calcularIMC();
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }

        switch (IMC){
            case PESO_IDEAL:
                msg = "Estás en perfecta forma";
                break;
            case INFRAPESO:
                msg = "Estás flaco, flaco";
                break;
            case SOBREPESO:
                msg = "Estás gordo, gordo";
                break;
        }

        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n"
                + msg + "\n";
    }
    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
