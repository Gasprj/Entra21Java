package ListArray;

import java.util.Arrays;
import java.util.Scanner;

public class Quest03 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	int[] vA = new int[10];
	int[] vB = new int[10];
	int[] vC1 = new int[10];
	int[] vC2 = new int[10];
	int[] vC3 = new int[10];
	int[] vC4 = new int[10];
	
	for (int i = 0; i < vA.length; i++) {
		System.out.printf("Digite o %d valor do vetor A: ", i + 1);
		vA[i] = ent.nextInt();
		
		System.out.printf("Digite o %d valor do vetor B: ", i + 1);
		vB[i] = ent.nextInt();
	
		vC1[i] = vA[i] + vB[i];
		vC2[i] = vA[i] - vB[i];
		vC3[i] = vA[i] * vB[i];
		vC4[i] = vA[i] / vB[i];
	}
	
	System.out.println();
	System.out.println(Arrays.toString(vC1));
	System.out.println();
	System.out.println(Arrays.toString(vC2));
	System.out.println();
	System.out.println(Arrays.toString(vC3));
	System.out.println();
	System.out.println(Arrays.toString(vC4));
	
	ent.close();	
		
	}
}
