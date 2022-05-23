package Lista06;

public class Exerc17 {
	public static void main(String[] args) {
		
		int anos = 0;
		long paisA = (long) 80000;
		long paisB = (long) 200000;
		double txA = 1.03;
		double txB = 1.015;
		
		while (true) {
			paisA *= txA;
			paisB *= txB;
			anos++;
			
//			System.out.println(anos + " - " + paisA + " - " + paisB);
			
			if(paisA > paisB) {
				System.out.printf("A população do país 'A' irá ultrapassar \na população do país 'B' após %d anos.", anos);
				break;
			}else if (paisA == paisB) {
				System.out.printf("A população do país 'A' irá se igualar \nà população do país 'B' após %d anos.", anos);
				break;
			}
		}
	
	}

}
