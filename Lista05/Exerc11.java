package Lista05;

import java.util.Scanner;

public class Exerc11 {
	public static void main(String[] args) {
	
	Scanner ent = new Scanner(System.in);
	
	double n1 = 0;
	double n2 = 0;
	char op = '0';
	
	while(op != 's') {
		System.out.print("Digite a operação ou 's' para sair: ");
		op = ent.next().charAt(0);
		
		if(op == 's') {
			break;
		}
		
		System.out.print("Digite o primeiro número: ");
		n1 = ent.nextDouble();
		System.out.print("Digite o segundo número: ");
		n2 = ent.nextDouble();
		
		double result = op == '+' ? n1 + n2 : 0;
		result = op == '-' ? n1 - n2 : result;
		result = op == '*' ? n1 * n2 : result;
		result = op == '/' ? n1 / n2 : result;
		result = op == '%' ? n1 % n2 : result;
		
		System.out.println("\nResultado: " + result + "\n");
	}
	
	System.out.println("Até a próxima!");
	
	ent.close();
		
	}
}
