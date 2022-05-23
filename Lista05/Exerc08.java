package Lista05;

import java.util.Scanner;

public class Exerc08 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	System.out.print("Informe o tipo de combustível: ");
	String comb = ent.nextLine();
	System.out.print("Informe quantos litros: ");
	float litros = ent.nextFloat();
	
	float gasol = 2.53f;
	float etan = 2.09f;
	float dis = 1.92f;
	
	double valorPag = comb.equalsIgnoreCase("gasolina") ? litros * gasol : 0;
	valorPag = comb.equalsIgnoreCase("etanol") ? litros * etan : valorPag;
	valorPag = comb.equalsIgnoreCase("diesel") ? litros * dis : valorPag;
	
	if(comb.equalsIgnoreCase("etanol") && valorPag > 30) {
		System.out.println("\nParbéns! Você gahou uma troca de óleo!\n");
	}else
		System.out.println();
	
	System.out.printf("Valor total a ser pago: %.2f", valorPag);
	
	ent.close();	
		
	}
}
