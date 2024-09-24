import java.util.Scanner;

public class ej33_LetrasCuatroYCinco {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String palabra = scanner.nextLine();
		System.out.println("La cuarta letra es: " + palabra.substring(3, 4));
		System.out.println("La quinta letra es: " + palabra.substring(4, 5));
	}
}
