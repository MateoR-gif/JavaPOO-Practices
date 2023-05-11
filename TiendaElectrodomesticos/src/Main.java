// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        for (int i = 0; i < 5; i++) {
            electrodomesticos[i] = new Lavadora(200, 50);
        }
        for (int i = 5; i < 10; i++) {
            electrodomesticos[i] = new Television(200, 50);
        }

        double sumaTelevisores = 0;
        double sumaPrecioTelevisores = 0;
        double sumaLavadoras = 0;
        double sumaPrecioLavadoras = 0;

        for (Electrodomestico electrodomestico: electrodomesticos) {
            if(electrodomestico instanceof Lavadora){
                sumaLavadoras += 1;
                sumaPrecioLavadoras += electrodomestico.precioFinal();
            }
            if(electrodomestico instanceof Television){
                sumaTelevisores += 1;
                sumaPrecioTelevisores += electrodomestico.precioFinal();
            }
        }

        System.out.println("Número de televisores: " + sumaTelevisores);
        System.out.println("Total por los televisores: " + sumaPrecioTelevisores);
        System.out.println("Número de lavadoras: " + sumaLavadoras);
        System.out.println("Total por las lavadoras: " + sumaPrecioLavadoras);
    }
}