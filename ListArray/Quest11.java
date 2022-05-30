package ListArray;

import java.util.Arrays;
import java.util.Scanner;

public class Quest11 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		int[] vet = new int[10];
		String result = "";
		int cont = 0;
		
		System.out.println("Digite os números do vetor: ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = ent.nextInt();
			
			if(vet[i] == vet[vet.length - (i + 1)])
				cont++;
					
//			result = vet[i] == vet[vet.length - (i + 1)] ? "Esse vetor é palíndromo" : "Esse vetor não é palíndromo";			
		}

		if(vet.length % 2 == 0)
			result = cont == (vet.length / 2) ? "Esse vetor é palíndromo" : "Esse vetor não é palíndromo";			
		else if(vet.length % 2 == 1)	
			result = cont == (vet.length / 2) + 1 ? "Esse vetor é palíndromo" : "Esse vetor não é palíndromo";			
		
		System.out.println("\n" + Arrays.toString(vet));
		System.out.println(result);
		
		ent.close();		
	}
}
