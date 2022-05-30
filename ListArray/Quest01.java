package ListArray;

import java.util.Arrays;
import java.util.Scanner;

public class Quest01 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	int[] vA = new int[15];
	int[] vB = new int[15];
	
	for (int i = 0; i < vA.length; i++) {
		System.out.printf("Digite o %d valor: ", i + 1);
		vA[i] = ent.nextInt();
		
		vB[i] = vA[i] * vA[i];
	}
	
	System.out.println();
	System.out.println(Arrays.toString(vA));
	System.out.println();
	System.out.println(Arrays.toString(vB));

	ent.close();
	}
}
