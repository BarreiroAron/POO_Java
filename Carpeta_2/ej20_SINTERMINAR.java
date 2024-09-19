package holaComoEstas;

import java.util.Scanner;

public class ej20_NumerosPrimos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero primo");
		int tuNumero = scanner.nextInt();
		for(int i = 2; i < 100; i++) {
		if(tuNumero % i == 0) {
			System.out.println("Tu numero ES primo");
		}
	}
	}
}
