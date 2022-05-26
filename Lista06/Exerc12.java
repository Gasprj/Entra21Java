package Lista06;

import java.math.BigDecimal;

public class Exerc12 {
	public static void main(String[] args) {
		
	int cont = 1;
	long num = (long) 1;
	
	System.out.println("casa 1 = 1");
	while(cont < 64) {
		cont++;
		num *= 2;
		
		System.out.println("casa " + cont + " = " + num);
		if(cont == 64)
		System.out.printf("%nO monge receberá " + BigDecimal.valueOf(num) + " grãos.");
	}
		
	}
}
