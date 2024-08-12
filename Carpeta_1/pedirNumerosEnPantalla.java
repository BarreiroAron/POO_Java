import java.util.Scanner;

public class pedirNumerosEnPantalla {
    public static void main(String[] args) {
        for(int i = 1; i >= 1; i++) {
        Scanner scanner = new Scanner(System.in);
        int numeros = scanner.nextInt();
        if(numeros >= 100) { System.out.println("Numero mayor a 100"); break; }
        }
    }
}
