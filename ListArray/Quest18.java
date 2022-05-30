package ListArray;

import java.util.Arrays;

public class Quest18 {
	public static void main(String[] args) {
		
		int[] vetX = new int[10];
		int cont = 0;
		
			for (int i = 100;; i++) {
				int calc = 0;
				
				for (int j = i; j > 0; j--) {
					if(i % j == 0) 
						calc++; 
				}		
						
				if(calc == 2) {
					vetX[cont] = i;
					cont++;
				}			
						
				if(vetX.length == cont)
					break;
				
			}
			
			System.out.println(Arrays.toString(vetX));
		
	}

}
