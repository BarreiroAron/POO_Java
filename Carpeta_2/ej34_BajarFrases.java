import java.util.Scanner;

public class ej34_BajarFrases {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Da una frase para poder bajarla");
		String palabra = scanner.nextLine();
		for(int i = 0; i < palabra.length(); i++) {
			 System.out.print(palabra.substring(i,i+1));
        	 if(palabra.charAt(i) == ' ') System.out.println("  ");
		}
	}
}
