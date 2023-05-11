import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    // atributes
    private int length;
    private String password;
    // constructors
    public Password(){
        this(8); // Overcharge
    }

    public Password(int length){
        this.length = length;
        generatePassword();
    }

    // methods
    /**
     * Description: This method proves that the Password is Strong
     * (takes no params).
     * */
    public boolean isStrong(){
        String regex = "^(?=(.*[A-Z]){2})(?=(.*[a-z]){1})(?=(.*\\d){5}).*$";
        Pattern pattern = Pattern.compile(regex); // Compila la expresión regular
        Matcher matcher = pattern.matcher(this.password);
        return matcher.matches();
    }
    /**
     * Description: This method provides a random password
     * (takes no params).
     * */
    private void generatePassword(){
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_-+={}[]\\|:;\"'<>,.?/";

        String allChars = uppercase + lowercase + numbers + symbols;

        Random rand = new Random();

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < this.length; i++) {
            int randomIndex = rand.nextInt(allChars.length());
            char randomChar = allChars.charAt(randomIndex);
            password.append(randomChar);
        }

        this.password = password.toString();
    }
    @Override
    public String toString(){
        return "Contraseña generada: " + this.password;
    }
    public int getLength() {
        return length;
    }

    public String getPassword() {
        return password;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
