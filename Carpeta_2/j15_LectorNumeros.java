package dea;

import java.util.Scanner;

public class ej15_LectorNumeros {
	public static void main(String[] args) {
		System.out.println("Ingresa un numero mas bajo que un 0");
		Scanner scanner = new Scanner(System.in);
		int numero = 1;
		do{
		numero = scanner.nextInt();
			if(numero == 0) {
				System.out.println("Ke jode0");
			} else if(numero > 0) {
				System.out.println("MENOOOOOOOOOOOOOOOOOOR");
			} else {
				System.out.println("eso brad");
			}
		} while(numero >= 0);
	}
}
