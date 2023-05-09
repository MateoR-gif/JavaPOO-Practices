public class Cuenta {

    private String titular;
    private double cantidad;
    //Constructores
    public Cuenta(String titular){
        this(titular, 0); //Sobrecarga
    }
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        if(cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad = cantidad;
        }
    }
    // Métodos
    /**
     * Description: Este método agrega dinero a la cuenta.
     * @param cantidad Será la cantidad a ingresar a la cuenta.
     * */
    public void ingresarDinero(double cantidad){
        if(cantidad >= 0){
            this.cantidad += cantidad;
        }
    }
    /**
     * Description: Este método retira dinero de la cuenta.
     * @param cantidad Será la cantidad a retirar de la cuenta.
     * */
    public void retirarDinero(double cantidad){
        if(cantidad > this.cantidad){
            this.cantidad = 0;
        }else{this.cantidad -= cantidad;};
    }

    /**
     * Description: Este método está sobreescribiendo al método toString de la clase
     * base Object de java, devuelve una cadena que describe al objeto.
     * */
    @Override
    public String toString(){
        return "La cuenta de: " + titular + " tiene: " + cantidad;
    }

    // Setters - Getters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
