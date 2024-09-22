package carpeta_2_Java;

import java.util.Scanner;

public class ej25_CalculadoraCientifica {
    public static void main(String[] args) {
        System.out.println("   ---------------");
        System.out.println("  | 1     2     3 |");
        System.out.println("  | 4     5     6 |");
        System.out.println("  | 7     8     9 |");
        System.out.println("   ---------------");
        System.out.println("Ingrese su cuenta.");
        System.out.println("Tenemos: +, -, *, /, ^, %, ");
        Scanner scanner = new Scanner(System.in);
        int ingresar = scanner.nextInt();
        char ingresarTres = scanner.next().charAt(0);
        Scanner scannerDos = new Scanner(System.in);
        int ingresarDos = scannerDos.nextInt();
         System.out.println("---------------------------------------------------------------------------");
        if(ingresarTres == '+') { System.out.println("El resultado es: " + (ingresar + ingresarDos)); }
        if(ingresarTres == '-') { System.out.println("El resultado es: " + (ingresar - ingresarDos)); }
        if(ingresarTres == '*') { System.out.println("El resultado es: " + (ingresar * ingresarDos)); }
        if(ingresarTres == '%') { System.out.println("El resultado es: " + (ingresar % ingresarDos)); }
        if(ingresarTres == '/') { System.out.println("El resultado es: " + (ingresar / ingresarDos)); }
        if(ingresarTres == '^') { 
        	for(int i = 0; i < ingresarDos; i++) {
        	ingresar = ingresar * ingresarDos;
        	}
        	System.out.println("El resultado es: " + (ingresar)); }
    }
}
