package ListArray;

import java.util.Arrays;
import java.util.Scanner;

public class Quest02 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	int[] vA = new int[10];
	int[] vB = new int[10];
	int[] vC = new int[10];
	
	for (int i = 0; i < vA.length; i++) {
		System.out.printf("Digite o %d valor do vetor A: ", i + 1);
		vA[i] = ent.nextInt();
		
		vB[i] = vA[i] * i;
		vC[i] = vA[i] % 2;
	}
	
	System.out.println();
	System.out.println(Arrays.toString(vA));
	System.out.println();
	System.out.println(Arrays.toString(vB));
	System.out.println();
	System.out.println(Arrays.toString(vC));

	ent.close();	
		
	}
}
