package Lista06;

import java.util.Scanner;

public class Exerc09 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	String n = "";
	
	while(!n.equalsIgnoreCase("sair")) {
		System.out.print("Digite um n�mero inteiro ou sair: ");
		n = ent.next();
		
		if(n.equalsIgnoreCase("sair"))
			break;
		
		int num = Integer.parseInt(n);
		
		if(num == 2 || num == 3 || num == 5 || num == 7)
			System.out.println("Esse n�mero � primo.\n");
		else if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0)
			System.out.println("Esse n�mero � primo.\n");
		else
			System.out.println("Esse n�mero n�o � primo.\n");
	}

	System.out.println("\nAt� a pr�xima!");
	
	ent.close();	
		
	}
}
