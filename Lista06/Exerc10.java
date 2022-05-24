package Lista06;

public class Exerc10 {
	public static void main(String[] args) {
		
	int num = 1000;
	int cont = 0;
	
	while(num < 2000) {
		num++;
		
			if (num % 11 == 5) {
				cont++;
				if (cont == 5)
				System.out.println(num);
			}	
	}
		
	}
}
