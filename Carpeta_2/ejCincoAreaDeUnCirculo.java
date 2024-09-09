import java.util.Locale;
import java.util.Scanner;

public class ejCincoAreaDeUnCirculo {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un radio");
        scanner.useLocale(Locale.US);
        double radio= scanner.nextDouble();
 
        double area = Math.PI * Math.pow(radio, 2);
 
        System.out.println("El area: "+ area);
    }
}
