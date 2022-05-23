package Lista05.ListaExt;

import java.util.Scanner;

public class Exerc02 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	System.out.print("Preço do 1º produto:");
	float p1 = ent.nextFloat();
	System.out.print("Preço do 2º produto:");
	float p2 = ent.nextFloat();
	System.out.print("Preço do 3º produto:");
	float p3 = ent.nextFloat();
	
	String result = p1 < p2 && p1 < p3 ?  "\nCompre o produto 01." : "\nCompre qualquer um.";
	result = p2 < p1 && p2 < p3 ? "\nCompre o produto 02." : result;
	result = p3 < p1 && p3 < p2 ? "\nCompre o produto 03." : result;
	result = p3 == p1 && p3 < p2 ? "\nCompre o produto 01 ou o 03." : result;
	result = p3 < p1 && p3 == p2 ? "\nCompre o produto 02 ou o 03." : result;
	result = p2 == p1 && p2 < p3 ? "\nCompre o produto 01 ou o 02." : result;

	System.out.println(result);
	
	ent.close();	
		
	}
}
