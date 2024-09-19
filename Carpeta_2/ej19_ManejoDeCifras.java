package holaComoEstas;

import java.util.Scanner;

public class ej19_ManejoDeCifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero o palabra: ");
        String numero = scanner.nextLine();
        int numeroCifras = numero.length();
        System.out.println("El numero o palabra tiene " + numeroCifras + " cifras.");
    }
}
