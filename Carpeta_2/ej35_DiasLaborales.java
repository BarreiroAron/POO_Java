import java.util.Scanner;
import java.util.ArrayList;

public class ej35_DiasLaborales {
	enum diasAguila {
		Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Que dia de la semana quiere pedir?");
        String escribime = scanner.nextLine();
        if(
        		escribime.equalsIgnoreCase(diasAguila.Lunes.name()) ||
                escribime.equalsIgnoreCase(diasAguila.Martes.name()) ||
                escribime.equalsIgnoreCase(diasAguila.Miercoles.name()) ||
                escribime.equalsIgnoreCase(diasAguila.Jueves.name()) ||
                escribime.equalsIgnoreCase(diasAguila.Viernes.name()) ) {
                System.out.println(escribime + " es un día laboral."); }
        else if(
        	escribime.equalsIgnoreCase(diasAguila.Sabado.name()) ||
        	escribime.equalsIgnoreCase(diasAguila.Domingo.name()) ) {
        	System.out.println(escribime + " No es un dia laboral."); }
    }
}
