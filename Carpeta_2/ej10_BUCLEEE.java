package elvideodiseotracosa;

import java.util.Scanner;

public class ej10_BUCLEEE {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println("Quiere hacerlo pero con while? Xd. Si es asi, ingrese 1 por favor");
		int decidir;
		Scanner xd = new Scanner(System.in);
		decidir = xd.nextInt();
		if(decidir == 1) {
			int j = 1;
			while(j <= 100) {
				System.out.println(j);
				j++;
			}
		}
	}
}
