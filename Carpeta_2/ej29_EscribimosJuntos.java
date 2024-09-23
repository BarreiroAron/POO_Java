import java.util.Scanner;
import java.util.ArrayList;

public class ej20_EscribimosJuntos {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	boolean infiniteCards = true;
    	 ArrayList<String> array = new ArrayList<>();
    	int moovedor = 0; String palabra;
    	while(infiniteCards) {
    		palabra = scanner.nextLine();
    		array.add(palabra);
    		moovedor++;
    		if(palabra.isEmpty()) {
    			infiniteCards = false;
    		}	
    	}
    	for(int i = 0; i < array.size(); i++) {
    	System.out.print(array.get(i));
    	}
    }
}
