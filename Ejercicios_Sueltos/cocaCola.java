import java.util.Scanner;

public class cocaCola {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        int clave = 0;
        int anios = 0;

        while (true) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Bienvenido!! Necesito que ingrese su nombre por favor!");
            nombre = scanner.nextLine();

            System.out.println("Ingrese la clave del departamento, por favor.");
            clave = scanner.nextInt();

            System.out.println("Ahora ingrese su monto de años trabajados, por favor.");
            anios = scanner.nextInt();

            if ((clave == 1 || clave == 2 || clave == 3) && anios >= 1) {
                break;
            } else { System.out.println("Repita todo de nuevo por favor..."); }
        }

        // Determinar días de vacaciones
        int diasVacaciones = 0;

        switch (clave) {
            case 1:
                if (anios <= 1) {
                    diasVacaciones = 6;
                } else if (anios >= 2 && anios <= 6) {
                    diasVacaciones = 14;
                } else if (anios >= 7) {
                    diasVacaciones = 20;
                }
                break;
            case 2:
                if (anios <= 1) {
                    diasVacaciones = 7;
                } else if (anios >= 2 && anios <= 6) {
                    diasVacaciones = 15;
                } else if (anios >= 7) {
                    diasVacaciones = 22;
                }
                break;
            case 3:
                if (anios <= 1) {
                    diasVacaciones = 10;
                } else if (anios >= 2 && anios <= 6) {
                    diasVacaciones = 20;
                } else if (anios >= 7) {
                    diasVacaciones = 30;
                }
                break;
            default:
                System.out.println("No se puede esta clave");
                return;
        }

        System.out.println("El empleado " + nombre + " tiene que recibir " + diasVacaciones + " dias de vacaciones debido a " + anios + " años de servicio y clave " + clave);
    }
}
