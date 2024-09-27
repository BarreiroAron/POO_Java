import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ej39_RelojTiempoReal {
    public static void main(String[] args) {
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (true) {
            //hora actual
            LocalTime horaActual = LocalTime.now();
            System.out.print("\r" + horaActual.format(formatoHora));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
