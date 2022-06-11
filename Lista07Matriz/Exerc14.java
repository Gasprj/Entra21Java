package Lista07Matriz;

import java.util.Arrays;

public class Exerc14 {
	public static void main(String[] args) {
		
		int[][] vet = new int [3][20];	
		
		for (int i = 0; i < (vet[0].length / 2); i++) {
			vet[0][i] = (int) (Math.random() * 100);
			vet[1][i] = (int) (Math.random() * 100);
			vet[2][i] = vet[0][i];
			vet[2][i + 10] = vet[1][i];
		}
	
		System.out.println(Arrays.toString(vet[0]));
		System.out.println(Arrays.toString(vet[1]));
		System.out.println(Arrays.toString(vet[2]));
			
	}
}
