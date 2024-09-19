package elvideodiseotracosa;

import java.util.Scanner;

public class ej13_ComprarCostias {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("Introduzca cuantas cozas compro :v");
		int precio = 0, precioTotal = 0;
		int cositas = r.nextInt();
		for(int i = 0; i < cositas; i++) {
			precio = r.nextInt();
			precioTotal += precio;
			precio = 0;
		}
		System.out.println("Mira todo lo que gastaste man: " + precioTotal + " Hyper banca rota en plan brooo");
	   }
	}
