package ListArray;

import java.util.Arrays;
import java.util.Scanner;

public class Quest11 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		int[] vet = new int[10];
		String result = "";
		int cont = 0;
		
		System.out.println("Digite os n�meros do vetor: ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = ent.nextInt();
			
			if(vet[i] == vet[vet.length - (i + 1)])
				cont++;
					
//			result = vet[i] == vet[vet.length - (i + 1)] ? "Esse vetor � pal�ndromo" : "Esse vetor n�o � pal�ndromo";			
		}

		if(vet.length % 2 == 0)
			result = cont == (vet.length / 2) ? "Esse vetor � pal�ndromo" : "Esse vetor n�o � pal�ndromo";			
		else if(vet.length % 2 == 1)	
			result = cont == (vet.length / 2) + 1 ? "Esse vetor � pal�ndromo" : "Esse vetor n�o � pal�ndromo";			
		
		System.out.println("\n" + Arrays.toString(vet));
		System.out.println(result);
		
		ent.close();		
	}
}
