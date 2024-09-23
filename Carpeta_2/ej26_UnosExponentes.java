import java.util.Scanner;

public class ej26_UnosExponentes {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero mayor que 1: ");
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println("necesito un numero mayor que 1");
        } else {
            int suma = n * (n + 1) / 2;
            System.out.println("da: " + suma);
        }
	}
}
