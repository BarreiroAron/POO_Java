import java.util.Scanner;

public class ejDosNumeroMasGrande {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos numeros por faovr: ");
        
        int numeroUno = scanner.nextInt();
        int numeroDos = scanner.nextInt();
        if(numeroUno > numeroDos) {
            System.out.println("EL PRIMER NUMERO ES MAYOR CHAVALES");
        } else if (numeroUno == numeroDos) {
            System.out.println("SON LOS DOS IGUALES CHAVALES");
        } else {
            System.out.println("EL DOS NUMERO ES MAS GRANDE CHAVALON");
        }
    }
}
