package Lista05.ListaExt;

import java.util.Scanner;

public class Exerc04 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	int valor = 0;
	
	System.out.println("Responda sim ou não.");
	System.out.println("Telefonou para a vítima?");
	String r1 = ent.next();
	System.out.println("Esteve no local do crime?");
	String r2 = ent.next();
	System.out.println("Mora perto da vitima?");
	String r3 = ent.next();
	System.out.println("Devia para vitima?");
	String r4 = ent.next();
	System.out.println("Já trabalhou com a vitima?");
	String r5 = ent.next();
	
	if(r1.equalsIgnoreCase("sim")) {
		valor++;
	}
	if(r2.equalsIgnoreCase("sim")) {
		valor++;
	}
	if(r3.equalsIgnoreCase("sim")) {
		valor++;
	}
	if(r4.equalsIgnoreCase("sim")) {
		valor++;
	}
	if(r5.equalsIgnoreCase("sim")) {
		valor++;
	}
	
	String result = valor == 2 ? "\nIndividuo suspeito." : "\nIndividuo inocente.";
	result = valor == 3 || valor == 4 ? "\nIndividuo cumplice." : result;
	result = valor == 5 ? "\nIndividuo culpado." : result;
	
	System.out.println(result);
	
	ent.close();	
		
	}
}
