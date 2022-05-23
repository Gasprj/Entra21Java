package Lista05;

import java.util.Scanner;

public class Exerc05 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	System.out.print("Informe o código do produto: ");
	int idade = ent.nextInt();
	
	switch(idade) {
	case 1, 2, 3, 4:
		System.out.println("\nSem categoria.");
		break;
	case 5, 6, 7:
		System.out.println("\nCategoria infantil A.");
		break;
	case 8, 9, 10:
		System.out.println("\nCategoria infantil B.");
		break;
	case 11, 12, 13:
		System.out.println("\nCategoria juvenil A.");
		break;
	case 14, 15, 16, 17:
		System.out.println("\nCategoria juvenil B.");
		break;
	default:
		System.out.println("\nCategoria adulto.");
	}

	ent.close();	
		
	}
}
