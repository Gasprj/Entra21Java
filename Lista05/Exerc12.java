package Lista05;

import java.util.Scanner;

public class Exerc12 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	System.out.print("Informe a primeira nota: ");
	double n1 = ent.nextDouble();
	System.out.print("Informe a segunda nota: ");
	double n2 = ent.nextDouble();
	System.out.print("Informe a terceira nota: ");
	double n3 = ent.nextDouble();
	System.out.print("Informe a média dos exercícios: ");
	double exerc = ent.nextDouble();
	
	double somTot = n1 + (n2 * 2) + (n3 * 3) + exerc;
	double medTot = somTot / 7;
	
	System.out.println("Média de aproveitamento: " + medTot);
	
	if (medTot >= 9 && medTot <= 10) {
		System.out.println("Conceito A.");
	}else if (medTot >= 7.5 && medTot < 9) {
		System.out.println("Conceito B.");
	}else if (medTot >= 6 && medTot < 7.5) {
		System.out.println("Conceito C.");
	}else if (medTot >= 0 && medTot < 6) {
		System.out.println("Conceito D.");
	}else
		System.out.println("Média inexistente.");
	
	

	ent.close();	
		
	}
}
