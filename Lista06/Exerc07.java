package Lista06;

import java.util.Scanner;

public class Exerc07 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	double num = 0;
	int qn = 0;
	
	do{
		System.out.print("Digite um n�mero ou '0' para sair: ");
		num = ent.nextDouble();
		
		if(num > 100 && num < 200)
			qn++;
	}while(num != 0);
	
	String result = String.format("%nForam digitados %d n�meros entre 100 e 200.", qn);
	
	System.out.print(result);

	ent.close();
		
	}
}
