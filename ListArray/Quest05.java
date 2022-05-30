package ListArray;

import java.util.Scanner;

public class Quest05 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		int[] vari = new int[10];
		int soma = 0;
		
		for (int i = 0; i < vari.length; i++) {
			System.out.printf("Digite o %d valor: ", i + 1);
			vari[i] = ent.nextInt();	
			
			if (vari[i] % 5 == 0) {
				soma += vari[i];
			}
		}
		
		System.out.println();
		
		for(int par: vari) {
			if (par % 5 == 0) {
				System.out.print(par + " ");
			}	
		}
		
		System.out.printf("%nSoma dos multiplos de 05 = %d", soma);

		ent.close();	
		
	}
}
