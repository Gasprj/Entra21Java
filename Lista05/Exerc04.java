package Lista05;

import java.util.Scanner;

public class Exerc04 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	System.out.print("\nInforme o código do produto: ");
	int codigo = ent.nextInt();
	
	switch(codigo) {
	case 1:
		System.out.println("\nAlimento não-percível.");
		break;
	case 2, 3, 4:
		System.out.println("\nAlimento percível.");
		break;
	case 5, 6:
		System.out.println("\nVestuário.");
		break;
	case 7:
		System.out.println("\nHigiene pessoal.");
		break;
	case 8, 9, 10, 11, 12, 13, 14, 15:
		System.out.println("\nLimpeza e utensílios domésticos.");
		break;
	default:
		System.out.println("\nCódigo inválido.");
	}

	ent.close();
		
	}

}
