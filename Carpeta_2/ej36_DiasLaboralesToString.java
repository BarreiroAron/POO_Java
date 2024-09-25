import java.util.Scanner;

public class ej36_DiasLaboralesToString {
    enum diasAguila {
        Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo;

        @Override
        public String toString() {
            switch (this) {
                case Lunes:
                case Martes:
                case Miercoles:
                case Jueves:
                case Viernes:
                    return name() + " Es un dia laboral";
                case Sabado:
                case Domingo:
                    return name() + " No es un dia laboral";
                default:
                    return name();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pida un dia de la semana");
        String escribime = scanner.nextLine();

        try {
            diasAguila dia = diasAguila.valueOf(escribime);
            System.out.println(dia.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("No se puede");
        }
    }
}
