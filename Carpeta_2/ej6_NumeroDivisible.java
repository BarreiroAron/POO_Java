import java.util.Scanner;

public class ej6_NumeroDivisible {
    public static void main(String[] args) {
	Scanner numero = new Scanner(System.in);
	
	System.out.println("Elija un numero");
	int numeroIngresar = numero.nextInt();
	System.out.println("El numero ingresado es " + numeroIngresar);
	int divisible = numeroIngresar % 2;
	if(divisible == 0) {
		System.out.println("Es par");
	} else {
		System.out.println("Es impar xd");
	}
    }
}
