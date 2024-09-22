public class ej22_Vocales {
    public static void main(String[] args) {
        int contador = 0;
        String[] array = new String[1];
        array[0] = "La lluvia en Sevilla es una maravilla";

        for (int i = 0; i < array[0].length(); i++) {
            char detect = array[0].toLowerCase().charAt(i);
            if (detect == 'a' || detect == 'e' || detect == 'i' || detect == 'o' || detect == 'u') {
                contador++;
            }
        }
        System.out.println("Vocales: " + contador);
    }
}
