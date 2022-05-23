package Lista05;

import java.util.Scanner;

public class Exerc15 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	System.out.print("Informe o tipo de carne: ");
	String carne = ent.nextLine();
	System.out.print("Informe quantos quilos: ");
	double kg = ent.nextDouble();
	double valor = 0;
	
	if(carne.equalsIgnoreCase("file duplo") && kg > 5) {
		valor = kg * 4.9;
		System.out.printf("Valor %.2f * 4.9 = %.2f", kg, valor);
	}else if(carne.equalsIgnoreCase("file duplo") && kg <= 5) {
		valor = kg * 5.8;
		System.out.printf("Valor %.2f * 5.8 = %.2f", kg, valor);
	}else if(carne.equalsIgnoreCase("alcatra") && kg > 5) {
		valor = kg * 5.9;
		System.out.printf("Valor %.2f * 5.9 = %.2f", kg, valor);
	}else if(carne.equalsIgnoreCase("alcatra") && kg <= 5) {
		valor = kg * 6.8;
		System.out.printf("Valor %.2f * 6.8 = %.2f", kg, valor);
	}else if(carne.equalsIgnoreCase("picanha") && kg > 5) {
		valor = kg * 6.9;
		System.out.printf("Valor %.2f * 6.9 = %.2f", kg, valor);
	}else if(carne.equalsIgnoreCase("picanha") && kg <= 5) {
		valor = kg * 7.8;
		System.out.printf("Valor %.2f * 7.8 = %.2f", kg, valor);
	}else
		System.out.println("Não temos essa carne");
	
	double desc = 0;
	
	for(char pag = '0';pag != '1' && pag != '2';) {
		System.out.print("\n\nInforme a forma de pagamento: "
				+ "\npara cartão digite (1), outros digite qualquer número: ");
		pag = ent.next().charAt(0);
		
		if(pag == '1') {
			desc = valor * 0.05;
			System.out.printf("%nObteve desconto de %.2f reais.", desc);
		}else if(pag == '2') {
			desc = 0;
		}else
			System.out.println("\nNão existe essa forma de pagamento");
	}
		
	double total = valor - desc;
	
	System.out.printf("%nTotal: %.2f", total);
	
	ent.close();
		
	}
}
