package Lista07;

import java.util.Arrays;

public class Quest13B {
	public static void main(String[] args) {
		
		int[] vetA = new int[10];
		int[] vetB = new int[10];
		
		numAleat(vetA);
		inverter(vetA, vetB);
		show(vetA);
		show(vetB);
		
	}
	
	private static void numAleat (int[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 100);
		}
	}
	
	private static void inverter (int[] vet1, int[] vet2) {
		for (int i = 0; i < vet1.length; i++) {
			vet2[i] = vet1[vet1.length - (i + 1)];
		}
	}
	
	private static void show (int[] vetor) {
		System.out.println(Arrays.toString(vetor));
	}

}
