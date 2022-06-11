package Lista07Matriz;

import java.util.Arrays;
import java.util.Scanner;

public class TesteMatrizTrab02 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int numeroPessoas = 0;
		int qtdFilhos = 0;
		
		System.out.print("Entre com o numero de pessoas que serao entrevistadas: ");
		numeroPessoas = ent.nextInt();
		String[][][] numFilhos = new String[numeroPessoas][][];
		
		for(int i = 0; i < numFilhos.length; i++) {
			
			System.out.print("\nEntre com a quantidade de filho(s) da pessoa" + (i + 1) + ": ");
			qtdFilhos = ent.nextInt();
			numFilhos[i] = new String[qtdFilhos][];
			
			ent.nextLine();
			for(int j = 0; j < numFilhos[i].length; j++) {
				numFilhos[i][j] = new String[2];// Posição 2 pois é o nome e a idade
				
				for(int k = 0; k < numFilhos[i][j].length; k++) {
										
					if(k == 0) {
						System.out.print("\nDigite o nome do " + (j + 1)+ "º filho:");
						numFilhos[i][j][k] = ent.nextLine();
					}
					else {
 						System.out.print("Digite a idade do " + (j + 1)+ "º filho:");
						numFilhos[i][j][k] = ent.nextLine();
					}
					
				}
			}
		}
			
		System.out.println("\n");
		
		for(int i = 0; i < numFilhos.length; i++) {
			System.out.printf("Filhos da pessoa %d%n", i + 1 );						
			for(int j = 0; j < numFilhos[i].length; j++) {
				System.out.println(Arrays.toString(numFilhos[i][j]));
			}
			System.out.println();
		}
		
	ent.close();	
	
	}

}
