package Lista07;

public class Quest12 {
	public static void main(String[] args) {
		
	int[] vetA = new int[10];
	
	for (int i = 0; i < vetA.length; i++) {
		vetA[i] = (int) (Math.random() * 100);
		
		if(vetA[i] %2 == 0)
			System.out.println(vetA[i]);
		else {
			System.out.println(vetA[i]);
			break;
		}
	}
	
	System.out.println("Fim!!!");

	}
}
