package dea;

import javax.swing.*;
import java.util.Scanner;

public class ej16_Contraseña {
    public static void main(String[] args) {
        String contraseña = "elAmige";
        String palabraContraseña;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            palabraContraseña = JOptionPane.showInputDialog("Ingrese la contraseña");
            if (!palabraContraseña.equals(contraseña)) {
                JOptionPane.showMessageDialog(null, "No es esa");
            } else {
                JOptionPane.showMessageDialog(null, "¡Muy bien! Entrando . . .");
                i = 20; 
            }
        }
        scanner.close();
    }
}
