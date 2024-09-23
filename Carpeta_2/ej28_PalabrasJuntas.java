import java.util.Scanner;
import javax.swing.JOptionPane;

public class ej28_PalabrasJuntas {
    public static void main(String[] args) {
    	JOptionPane.showMessageDialog(null, "Introduce una frase: ");
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.nextLine();  
        System.out.println(palabra);
        StringBuilder palabraNueva = new StringBuilder();
        for(int i = 0; i < palabra.length(); i++) {
        	if(palabra.charAt(i) != ' ') {
        		palabraNueva.append(palabra.charAt(i));
        	}
        }
    	System.out.println(palabraNueva.toString());
    }
}
