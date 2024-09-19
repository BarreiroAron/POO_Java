package holaComoEstas;

import java.util.Scanner;

public class ej18_RandomNums {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese dos numeros: ");
		int numUno = scanner.nextInt();
		int numDos = scanner.nextInt();
		for(int i = 0; i < 10; i++) {
		int numAleatorio=(int)Math.floor(Math.random()*(numUno - numDos)+ numDos);
		System.out.println("Tu numero aleatorio es: " + numAleatorio);
		}
	}
}
