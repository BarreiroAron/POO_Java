package elvideodiseotracosa;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ej14_Proceso {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String a = JOptionPane.showInputDialog("Dame una variable");
            String b = JOptionPane.showInputDialog("Otra");
            String c = JOptionPane.showInputDialog("Una más jeje");
            
            // Supongamos que quieres convertir la entrada a un número entero
            // Esto podría lanzar una NumberFormatException si la entrada no es un número válido
            int numA = Integer.parseInt(a);
            int numB = Integer.parseInt(b);
            int numC = Integer.parseInt(c);

            // Ejemplo de operación que podría generar una excepción
            int suma = numA + numB + numC;
            System.out.println("La suma de los números es: " + suma);
            
        } catch (NumberFormatException e) {
            // Maneja el caso en que la conversión a entero falla
            JOptionPane.showMessageDialog(null, "Error: Debes ingresar números válidos.");
        } catch (Exception e) {
            // Maneja cualquier otra excepción
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
        }
    }
}
