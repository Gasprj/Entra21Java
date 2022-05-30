package ListArray;

import java.util.Scanner;

public class Quest06 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	int[] vari = new int[10];
	int soma = 0;
	int cont = 0;
	
	for (int i = 0; i < vari.length; i++) {
		System.out.printf("Digite o %d valor: ", i + 1);
		vari[i] = ent.nextInt();	
		
		if (vari[i] % 2 == 1) {
			soma += vari[i];
			++cont;
		}
	}
	
	System.out.println();
	
	for(int par: vari) {
		if (par % 2 == 1) {
			System.out.print(par + " ");
		}	
	}
	
	System.out.print("\nMédia dos ímpares = " + (soma / cont));

	ent.close();	
		
	}
}
