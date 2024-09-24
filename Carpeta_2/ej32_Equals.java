package casa;

import java.util.Scanner;

public class ej31_Equals {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Introduzca una frase");
	String palabraUno = scanner.nextLine();
	System.out.println("Otra maaas");
	String palabraDos = scanner.nextLine();
	if(palabraUno.equals(palabraDos)) {
		System.out.println("Son iguales");
	} else {
		System.out.println("No son iguales");
	}
	}
}
