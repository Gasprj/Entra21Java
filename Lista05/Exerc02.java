package Lista05;

import java.util.Scanner;

public class Exerc02 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	System.out.print("Informe o n�mero: ");
	double d = ent.nextDouble();
	
	String result = d > 0 ? "Esse n�mero � positivo" : "Esse n�mero � neutro";
	result = d < 0 ? "Esse n�mero � negativo" : result;
	
	System.out.println("\n" + result);

	ent.close();	
		
	}
}
