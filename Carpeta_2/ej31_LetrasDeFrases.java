import java.util.Scanner;

public class ej31_LetrasDeFrases {
	public static void main(String[] args) {
	System.out.println("Introduzca una frase");
	Scanner scanner = new Scanner(System.in);
	String palabra = scanner.nextLine();
	System.out.println("La palabra tiene (Incluyendo espacios) " + palabra.length() + " letras.");
	}
}
