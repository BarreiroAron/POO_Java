
import javax.swing.JOptionPane;

public class ej7_ASCIICode {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Introduce un código de la tabla ASCII");
        //Este showInputDialog es como un alert de un html. 
        //No funciona en online java :C   
        int codigo = 0;
        for (int i = 0; i < texto.length(); i++) { //tampooc funciona en online.java
            char c = texto.charAt(i); //tampoco funciona en online.java
            int digito = c - '0';
            codigo = codigo * 10 + digito;
        }
        char caracter = (char) codigo;
        System.out.println(caracter);
    }
}
