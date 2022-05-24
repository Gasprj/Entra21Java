package Lista06;

import java.util.Scanner;

public class Exerc01 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	int i = 0;
	int soma = 0;
	int prod = 1;
	
	for(;true;) {
		System.out.println("Digite um número positivo \nou (-1) para sair: ");
		i = ent.nextInt();
		
		if( i == -1) {
			break;
		}
		
		if(i % 2 == 0) {
			soma += i;
		}else if(i % 2 ==1) {
			prod *= i;
		}
		
	}
	System.out.println("\nSoma dos pares: " + soma);
	System.out.println("Produto dos ímpares: " + prod);
	
		
	ent.close();
	}
}
