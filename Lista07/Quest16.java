package Lista07;

import java.util.Arrays;

public class Quest16 {
	public static void main(String[] args) {
		
		
		Integer[] vetA = new Integer[20];
		
		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = (int) ((Math.random() * 100) - (Math.random() * 100));
			
			if(vetA[i] > 0) {
				vetA[i] = vetA[i];
				System.out.print(vetA[i] + " ");
			}else if(vetA[i] <= 0)
				vetA[i] = null;
		}
		
		System.out.println("\n");
		
		for (Integer repres : vetA) {
			if(repres != null)
			System.out.println(repres);
		}
		
		System.out.println("\n" + Arrays.toString(vetA));
		
	}
}
