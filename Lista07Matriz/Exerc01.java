package Lista07Matriz;

import java.util.Arrays;

public class Exerc01 {
	public static void main(String[] args) {
		
		int[][] vet = new int[2][10];	
			
			for (int j = 0; j < vet[0].length; j++) {
				vet[0][j] = (int) (Math.random() * 100);
				vet[1][j] = (int) Math.pow(vet[0][j], 2);
			}
		
			System.out.println(Arrays.toString(vet[0]));
			System.out.println(Arrays.toString(vet[1]));
				
	}
}
