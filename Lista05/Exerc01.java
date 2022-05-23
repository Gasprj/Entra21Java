package Lista05;

import java.util.Scanner;

public class Exerc01 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	System.out.print("Informe o número: ");
	double d = ent.nextDouble();
	
	String result = d % 2 == 0 ? "Esse número é par" : "Esse número é ímpar";
	System.out.println("\n" + result);
	
	ent.close();	
		
	}
}
