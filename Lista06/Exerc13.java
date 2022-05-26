package Lista06;

import java.util.Scanner;

public class Exerc13 {
	public static void main(String[] args) {
	
	Scanner ent = new Scanner(System.in);

	int maior = 0;
	
	System.out.print("Digite um n�mero inteiro positivo ou (-1) para encerrar: ");
	for(int num = 0;;) {
		num = ent.nextInt();
		
		if(num == -1)
			break;
			
		if(num < 0) 
			System.out.println("N�mero inv�lido. Digite outro.");
		
		if(num > maior)
			maior = num;
	}

	System.out.println("\nO maior n�mero digitado foi " + maior);
	
	ent.close();	
		
	}
}
