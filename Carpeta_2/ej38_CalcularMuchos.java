import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class ej38_CalcularMuchos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese todos los numeros que quiera: ");
		
		double menorNumero = 0; 
		double mayorNumero = 0; double suma = 0; 
		double sumaNegativa = 0; double sumaPositiva = 0;
		double mayor= -1000000; double menor = ' '; double numero = 1000000;
		
        ArrayList<String> lista = new ArrayList<>();
		while(true) {
			numero = scanner.nextDouble();
			if(numero == -1) break;
			suma = suma + numero;
			if(numero >= 0)   sumaPositiva =+ numero;
			if(numero <= 0)   sumaNegativa =+ numero;
			if(numero > mayor) mayor = numero;
			if(numero < menor) menor = numero;
		}
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero menor es: " + menor);
		System.out.println("La suma de TODOS los numeros es: " + suma + 1);
		System.out.println("La suma de todos los numeros positivos es: " + sumaPositiva);
		System.out.println("La suma de todos los numeros negativos es: " + sumaNegativa);
	}
}
