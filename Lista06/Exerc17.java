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
				System.out.printf("A popula��o do pa�s 'A' ir� ultrapassar \na popula��o do pa�s 'B' ap�s %d anos.", anos);
				break;
			}else if (paisA == paisB) {
				System.out.printf("A popula��o do pa�s 'A' ir� se igualar \n� popula��o do pa�s 'B' ap�s %d anos.", anos);
				break;
			}
		}
	
	}

}
