package elvideodiseotracosa;

import java.util.Scanner;

public class ejNueveIVA {
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Elija un numero por faovr");
	    double numero = scanner.nextInt();
	    double numeroIVA = numero * 1.21;
	    System.out.println("El valor de " + numero + " + el IVA de 21% es: " + numeroIVA);
	}
}
