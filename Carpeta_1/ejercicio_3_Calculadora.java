import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        System.out.println("   ---------------");
        System.out.println("  | 1     2     3 |");
        System.out.println("  | 4     5     6 |");
        System.out.println("  | 7     8     9 |");
        System.out.println("   ---------------");
        System.out.println("Ingrese dos numeros para la cuenta");
        Scanner scanner = new Scanner(System.in);
        int ingresar = scanner.nextInt();
        
        Scanner scannerDos = new Scanner(System.in);
        int ingresarDos = scannerDos.nextInt();
        
        System.out.println("Ingrese un numero para elegir que cuenta quiere hacer: (1 + ), (2 - ), (3 * ), (4 / )");
        char ingresarTres = scanner.next().charAt(0);
         System.out.println("---------------------------------------------------------------------------");
        if(ingresarTres == '+') { System.out.println("El resultado es: " + (ingresar + ingresarDos)); }
        if(ingresarTres == '-') { System.out.println("El resultado es: " + (ingresar - ingresarDos)); }
        if(ingresarTres == '*') { System.out.println("El resultado es: " + (ingresar * ingresarDos)); }
        if(ingresarTres == '/') { System.out.println("El resultado es: " + (ingresar / ingresarDos)); }
    }
}
