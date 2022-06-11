package Lista07Matriz;

import java.util.Arrays;

public class Exerc03 {
	public static void main(String[] args) {
		
		int[][] vet = new int[3][10];	
		
		for (int i = 0; i < vet[0].length; i++) {
			vet[0][i] = (int) (Math.random() * 100);
			vet[1][i] = (int) (Math.random() * 100);
			vet[2][i] = vet[0][i] + vet[1][i];
		}
	
		System.out.println(Arrays.toString(vet[0]));
		System.out.println(Arrays.toString(vet[1]) + "\n");
		System.out.println(Arrays.toString(vet[2]));
		
		for (int i = 0; i < vet[0].length; i++) {
			vet[2][i] = vet[0][i] - vet[1][i];
		}
		
		System.out.println(Arrays.toString(vet[2]));
		
		for (int i = 0; i < vet[0].length; i++) {
			vet[2][i] = vet[0][i] * vet[1][i];
		}
		
		System.out.println(Arrays.toString(vet[2]));
		
		for (int i = 0; i < vet[0].length; i++) {
			vet[2][i] = vet[0][i] / vet[1][i];
		}
		
		System.out.println(Arrays.toString(vet[2]));
			
	}
}
