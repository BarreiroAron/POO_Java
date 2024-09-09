
import javax.swing.JOptionPane;

public class ejOchoASCIICode {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Introduce una letra para convertirlo en un numero de la tabla ASCII");
        //Este showInputDialog es como un alert de un html. 
        //No funciona en online java :C   
        if(texto != null && texto.length() == 1) {
        	char caracter = texto.charAt(0);
        	int codigo = (int) caracter;
        	
        	System.out.println(codigo);
        } else {
        	System.out.println("No vale ese xd");
        }
    }
}
