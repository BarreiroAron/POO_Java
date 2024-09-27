import java.util.Scanner;

public class ej38_Meses {
    public enum Mes {
        ENERO(1, 31),
        FEBRERO(2, 28),
        MARZO(3, 31),
        ABRIL(4, 30),
        MAYO(5, 31),
        JUNIO(6, 30),
        JULIO(7, 31),
        AGOSTO(8, 31),
        SEPTIEMBRE(9, 30),
        OCTUBRE(10, 31),
        NOVIEMBRE(11, 30),
        DICIEMBRE(12, 31);

        private final int orden;
        private final int dias;

        Mes(int orden, int dias) {
            this.orden = orden;
            this.dias = dias;
        }

        public int numero() {
            return orden;
        }

        public int getDias() {
            return dias;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número de días: ");
        int diasBuscados = scanner.nextInt();
        boolean encontrado = false;
        for (Mes mes : Mes.values()) {
            if (mes.getDias() == diasBuscados) {
                System.out.println("Mes: " + mes.name() + ", numero: " + mes.numero() + ", Días: " + mes.getDias());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún mes con " + diasBuscados + " días.");
        }

        scanner.close();
    }
}
