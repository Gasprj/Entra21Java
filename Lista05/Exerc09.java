package Lista05;

import java.util.Scanner;

public class Exerc09 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	String fruta = "";
	double valor = 0;
	double total = 0;
	
	do {
		System.out.print("Informe a fruta: ");
		fruta = ent.next();
		
		if(fruta.equalsIgnoreCase("sair")) {
			break;
		}
		
		System.out.print("Informe o valor unitário da fruta: ");
		valor= ent.nextDouble();
	
		if(fruta.equalsIgnoreCase("laranja")) {
			total = valor *60;
		}else if (fruta.equalsIgnoreCase("limão")) {
			total = valor * 80;
		}else if (fruta.equalsIgnoreCase("morango")) {
			total = valor * 20;
		}else
			System.out.println("Não temos essa fruta");
		
		System.out.printf("Total a ser pago pela caixa: %.2f%n%n", total);
		
	}while (!fruta.equalsIgnoreCase("sair"));
	
	System.out.println("Até a próxima.");

	ent.close();	
		
	}
}
