package Lista05;

import java.util.Scanner;

public class Exerc03 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	System.out.print("Informe seu sexo (masculino ou feminino): ");
	String sex = ent.nextLine();
	
	System.out.print("Informe sua altura: ");
	double alt = ent.nextDouble();
	
	double pesIdeal = 0;
	
	if (sex.equalsIgnoreCase("masculino")) {
		pesIdeal = (72.7 * alt) - 58;
	}else if (sex.equalsIgnoreCase("feminino")) {
		pesIdeal = (62.1 * alt) - 44.7;
	}else {
		System.out.println("\nSexo inexistente.");
	}
	
	System.out.printf("%nSeu peso idela é %.2f kg", pesIdeal);
	
	ent.close();	
		
	}
}
