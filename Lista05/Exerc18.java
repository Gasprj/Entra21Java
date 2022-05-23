package Lista05;

import java.util.Scanner;

public class Exerc18 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	String letra = "";
	
	while(!letra.equals("0")) {
		System.out.print("Informe uma letra ou (0) para sair: ");
		letra = ent.next();
		
		switch(letra.toLowerCase()) {
		case "a", "e", "i", "o", "u":
			System.out.println("É uma vogal.\n");
			break;
		case "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p"
		, "q", "r", "s", "t", "v", "w", "x", "y", "z":
			System.out.println("É uma consoante.\n");
			break;
		default:
			System.out.println("Não é letra.\n");
		}
	}
	
	System.out.println("Até logo!!!");

	ent.close();	
		
	}
}
