package ListArray;

import java.util.Scanner;

public class Quest08 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	int[] vari = new int[10];
	int maior = 0;
	int igual = 0;
	int menor = 0;
	int cont = 0;
	
	for (int i = 0; i < vari.length; i++) {
		System.out.printf("Digite o %d valor: ", i + 1);
		vari[i] = ent.nextInt();	
		
		if (vari[i] > 15) { 
			maior += vari[i];
			++cont;
		}else if (vari[i] < 15) 
			menor += vari[i];
		else
			++igual;
	}
	
	System.out.print("\nSoma menores que 15 = " + menor);
	
	System.out.print("\nMédia maiores que 15 = " + (maior / cont));
	
	System.out.print("\nIguais à 15 = " + igual);

	ent.close();	
			
	}
}
