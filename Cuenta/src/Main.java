// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Cuenta");
        Cuenta cuenta1 = new Cuenta("Juan", 30000);
        Cuenta cuenta2 = new Cuenta("Alberto", 20000);

        System.out.println(cuenta1);
        System.out.println(cuenta2);

        cuenta1.ingresarDinero(20000);
        cuenta2.ingresarDinero(-2000);

        System.out.println(cuenta1);
        System.out.println(cuenta2);

        cuenta1.retirarDinero(500000);
        cuenta2.retirarDinero(2000);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}