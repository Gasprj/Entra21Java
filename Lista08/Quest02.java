package Lista08;

import java.util.Scanner;

public class Quest02 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		int[][] mat = new int[3][3];
		int cont = 1;
		int par = 0;
		int impar = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("Digite o %d� valor: ", cont);
				mat[i][j] = ent.nextInt();
				cont++;
			}
		}
		
		System.out.println();
		
		for (int[] is : mat) {
			for (int is2 : is) {
				System.out.print(" " + is2 + " ");
				if(is2 %2 == 0)
					par++;
				else
					impar++;
			}
			System.out.println();
		}

		System.out.println("\nQuantidade de n�meros pares: " + par);
		System.out.println("Quantidade de n�meros impares: " + impar);
		
		ent.close();
		
	}

}
