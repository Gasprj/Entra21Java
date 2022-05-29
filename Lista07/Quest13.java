package Lista07;

import java.util.Arrays;

public class Quest13 {
	public static void main(String[] args) {
		
		
		int[] vetA = new int[10];
		int[] vetB = new int[10];
		
		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = (int) (Math.random() * 100);
			
			vetB[vetA.length - (i + 1)] = vetA[i];	
		}
		
		System.out.println("Vetor A = " + Arrays.toString(vetA));
		System.out.println("Vetor B = " + Arrays.toString(vetB));
		
	}
}
