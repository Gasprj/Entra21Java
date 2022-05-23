package Lista06;

public class Exerc03 {
	public static void main(String[] args) {
		
		int n = 1000;
	
		while(n <= 2000) {
			n++;
			if(n % 11 == 5) {
				System.out.println(n);
			}
		}
		
	}
}
