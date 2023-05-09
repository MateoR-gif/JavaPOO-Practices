import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        char sexo;
        double peso;
        double altura;


        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("Su sexo es (H o M): ");
        sexo = sc.next().charAt(0);
        System.out.println("Ingrese su peso: ");
        peso = sc.nextDouble();
        System.out.println("Ingrese su altura: ");
        altura = sc.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }
}