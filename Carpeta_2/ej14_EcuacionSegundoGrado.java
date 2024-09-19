import java.util.Scanner;
import javax.swing.JOptionPane;

public class ej14_EcuacionSegundoGrado {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String a = JOptionPane.showInputDialog("Dame una variable");
            String b = JOptionPane.showInputDialog("Otra");
            String c = JOptionPane.showInputDialog("Una más jeje");
            
            int numA = Integer.parseInt(a);
            int numB = Integer.parseInt(b);
            int numC = Integer.parseInt(c);

            int suma = numA + numB + numC;
            System.out.println("La suma de los numeros es: " + suma);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debes ingresar numeros");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error " + e.getMessage());
        }
    }
}
