package Lista05;

import java.util.Scanner;

public class Exerc01 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	System.out.print("Informe o n�mero: ");
	double d = ent.nextDouble();
	
	String result = d % 2 == 0 ? "Esse n�mero � par" : "Esse n�mero � �mpar";
	System.out.println("\n" + result);
	
	ent.close();	
		
	}
}
