

import java.util.Scanner;

public class ej14 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Ingrese tres numeros, a, b y c");
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	double discriminante = Math.pow(b, 2) - (4 * a * c);
	System.out.println("El discriminante es: " + discriminante);
	
	double x1 = ((b * (-1)) + Math.sqrt(discriminante)) / (c * a);
	double x2 = ((b * (-1)) - Math.sqrt(discriminante)) / (c * a);
	
	System.out.println("completo con + es: " + x1);
	System.out.println("completo con - es: " + x2);
}
}
