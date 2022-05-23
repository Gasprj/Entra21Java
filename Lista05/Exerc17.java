package Lista05;

import java.util.Scanner;

public class Exerc17 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);
	
	for(int dia = 9; dia != 0;) {
		System.out.print("Informe o número referente ao dia \nda semana ou (0) para sair:");
		dia = ent.nextInt();
		
		if(dia == 0)
			break;
		
		switch(dia) {
		case 1:
			System.out.println("Domingo\n");
			break;
		case 2:
			System.out.println("Segunda-feira\n");  
			break;
		case 3:
			System.out.println("Terça-feira\n");
			break;
		case 4:
			System.out.println("Quarta-feira\n");
			break;
		case 5:
			System.out.println("Quinta-feira\n");
			break;
		case 6:
			System.out.println("Sexta-feira\n");
			break;
		case 7:
			System.out.println("Sábado\n");
			break;
		default:
			System.out.println("Não existe\n");
		}	
	}
	
	System.out.println("Tchau!");

	ent.close();	
		
	}
}
