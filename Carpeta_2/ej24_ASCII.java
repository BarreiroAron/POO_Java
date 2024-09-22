public class ej24_ASCII {
    public static void main(String[] args) {
        String[] array = new String[1];
        array[0] = "La lluvia en Sevilla es una maravilla";
        for (int i = 0; i < array[0].length(); i++) {
            char letraASCII = array[0].charAt(i);
            int ASCII = (int) letraASCII;
            System.out.print(ASCII + " ");
        }
    }
}
