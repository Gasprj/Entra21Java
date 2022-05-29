package Lista07;

public class Quest15 {
	public static void main(String[] args) {
		
		
		int[] vetA = new int[10];
		int div = 0;
		
		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = (int) (Math.random() * 100);
			div = vetA[i];
			
			System.out.printf("%dº valor do vetor A = %d", (i + 1), vetA[i]);
			System.out.printf("\nSeus divisores sâo: %d", vetA[i]);
			
			while(div != 1) {
				div--;
				
				if(vetA[i] % div == 0)
					System.out.print(", " + div);
			}
			System.out.println("\n");
		}
		
	}
}
