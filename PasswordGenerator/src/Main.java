import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud del arreglo de contraseñas: ");
        int arrayLength = sc.nextInt();
        System.out.println("Ingrese la longitud de las contraseñas: ");
        int passwordLength = sc.nextInt();
        Password[] passwords = new Password[arrayLength];
        boolean[] isStrong = new boolean[passwords.length];

        for(int i = 0; i < passwords.length; i ++){
            passwords[i] = new Password(passwordLength);
            System.out.println(passwords[i]);
            isStrong[i] = passwords[i].isStrong();
            String msg = isStrong[i] ? "Contraseña Fuerte" : "Contraseña Débil";
            System.out.println(msg);
        }
    }
}