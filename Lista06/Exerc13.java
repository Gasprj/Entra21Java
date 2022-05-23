package Lista06;

import java.util.Scanner;

public class Exerc13 {
	public static void main(String[] args) {
	
	Scanner ent = new Scanner(System.in);

	int maior = 0;
	
	for(int num = 0; num != -1;) {
		System.out.print("Digite um número inteiro positivo ou (-1) para encerrar: ");
		num = ent.nextInt();
		
		if(num == -1)
			break;
			
		if(num < 0) 
			System.out.println("Número inválido. Digite outro.");
		
		if(num > maior)
			maior = num;
	}

	System.out.println("\nO maior número digitado foi " + maior);
	
	ent.close();	
		
	}
}
