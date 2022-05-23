package Lista05;

import java.util.Scanner;

public class Exerc16 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		double n1 = 0;
		double n2 = 0;
		char op = '0';
		double result = 0;
		
		while(op != 's') {
			System.out.print("Digite a opera��o ou 's' para sair: ");
			op = ent.next().charAt(0);
			
			if(op == 's') {
				break;
			}
			
			System.out.print("Digite o primeiro n�mero: ");
			n1 = ent.nextDouble();
			System.out.print("Digite o segundo n�mero: ");
			n2 = ent.nextDouble();
			
			if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				result = op == '+' ? n1 + n2 : result;
				result = op == '-' ? n1 - n2 : result;
				result = op == '*' ? n1 * n2 : result;
				result = op == '/' ? n1 / n2 : result;
				result = op == '%' ? n1 % n2 : result;
				System.out.println("\nResultado: " + result + "");
				
				if(result >= 0) {
					System.out.println("Esse n�mero � positivo");
				}else 
					System.out.println("Esse n�mero � negativo");
				
				
				if(result % 2 == 0) {
					System.out.println("Esse n�mero � par\n");
				}else
					System.out.println("Esse n�mero � �mpar\n");
				
			}else
				System.out.println("\nOpera��o inv�lida.\n");
			
		}
		
		System.out.println("At� a pr�xima!");
		
		ent.close();	
		
	}
}
