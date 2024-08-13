import java.util.Scanner;

public class nombre {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	String guardarScanner = "";
	int numeroUno = 0, numeroDos = 0, resultado = 0;
	
	System.out.println("Ingresa tu nombre");
	guardarScanner = scanner.nextLine();

	System.out.println("Ingresa un numero para la suma:");
	numeroUno = scanner.nextInt();
	System.out.println("Ingresa el segundo para la suma:");
	numeroDos = scanner.nextInt();
	resultado = numeroUno + numeroDos;
	System.out.println("Tu resultado es: " + resultado);
	System.out.println(guardarScanner + " xd ");		
	}
}
