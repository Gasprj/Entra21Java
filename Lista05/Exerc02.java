package Lista05;

import java.util.Scanner;

public class Exerc02 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	System.out.print("Informe o número: ");
	double d = ent.nextDouble();
	
	String result = d > 0 ? "Esse número é positivo" : "Esse número é neutro";
	result = d < 0 ? "Esse número é negativo" : result;
	
	System.out.println("\n" + result);

	ent.close();	
		
	}
}
