package ListArray;

import java.util.Scanner;

public class Quest04 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		int[] vA = new int[10];
		int cont = 0;
		
		for (int i = 0; i < vA.length; i++) {
			System.out.printf("Digite o %d valor: ", i + 1);
			vA[i] = ent.nextInt();	
		}
		
		System.out.println();
		
		for(int par: vA) {
			if (par % 2 == 0) {
				++cont;
				System.out.print(par + " ");
			}	
		}
		System.out.printf("%nExistem %d números pares.", cont);

		ent.close();	
		
	}
}
