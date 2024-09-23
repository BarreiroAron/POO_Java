import java.util.Scanner;

public class ej27_Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean verdad = true; int contador = 0; int suma = 0;
		while(verdad) {
		System.out.println("Ingrese su cantidad de numeros");
		int numero = scanner.nextInt();
		suma += numero;
		contador++;
		if(numero == -1) { verdad = false; }
		}
		System.out.println("Okei, tenemos la cantidad de numeros que ingresaste = ");
		System.out.println(contador-1);
		System.out.println("Y su suma");
		System.out.println(suma+1);
	}
}
