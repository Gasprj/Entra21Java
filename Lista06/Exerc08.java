package Lista06;

import java.util.Scanner;

public class Exerc08 {
	public static void main(String[] args) {
	
	Scanner ent = new Scanner(System.in);

	int limInf = 0;
	int limSup = 0;
	int soma = 0;

	System.out.print("Informe o limite inferior: ");
	limInf = ent.nextInt();
	System.out.print("Informe o limite superior: ");
	limSup = ent.nextInt();
	
	System.out.print("Soma: ");
	while(limInf < limSup) {
		limInf++;
		if((limInf % 2 == 0) && limInf != limSup) {
			soma += limInf;
		System.out.print(limInf + " ");
		}
	}

	System.out.println("\nSoma: " + soma);
	
	ent.close();	
		
	}
}
