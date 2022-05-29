package Lista07;

import java.util.Arrays;

public class Quest14 {
	public static void main(String[] args) {
		
		
		int[] vetA = new int[10];
		int[] vetB = new int[10];
		int[] vetC = new int[20];
		
		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = (int) (Math.random() * 100);
			vetB[i] = (int) (Math.random() * 100);
			
			vetC[i] = vetA[i];
			vetC[vetB.length + i] = vetB[i];
		}
		
		System.out.println("Vetor A = " + Arrays.toString(vetA));
		System.out.println("Vetor B = " + Arrays.toString(vetB));
		System.out.println("Vetor C = " + Arrays.toString(vetC));
			
		
	}
}
