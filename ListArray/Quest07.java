package ListArray;

import java.util.Scanner;

public class Quest07 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	int[] vari = new int[10];
	int par = 0;
	int impar = 0;
	
	for (int i = 0; i < vari.length; i++) {
		System.out.printf("Digite o %d valor: ", i + 1);
		vari[i] = ent.nextInt();	
		
		if (vari[i] % 2 == 1) {
			++impar;
		}else if (vari[i] % 2 == 0) {
			++par;
		}
	}
	
	System.out.print("\nPercentual dos pares = " + ((par * 100) / vari.length) + "%.");
	
	System.out.print("\nPercentual dos ímpares = " + ((impar * 100) / vari.length) + "%.");

	ent.close();	
		
	}
}
