package Lista06;

import java.math.BigDecimal;

public class TesteBig {
	public static void main(String[] args) {
		
		int cont = 0;
		BigDecimal num = new BigDecimal(1);
		BigDecimal mult = new BigDecimal(2);
		BigDecimal res;
		
		System.out.println("casa 1 = 1");
		while(cont < 64) {
			cont++;
			res = num.multiply(mult);
			num = res;
			
			System.out.println("casa " + cont + " = " + num);
			if(cont == 64)
			System.out.print("\nO monge receberá " + num + " grãos.");
		}
		
		
	}

}
