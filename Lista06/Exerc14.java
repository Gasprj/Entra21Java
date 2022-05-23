package Lista06;

import java.util.Scanner;

public class Exerc14 {
	public static void main(String[] args) {
	
	Scanner ent = new Scanner(System.in);

	int cont = 0;
	int qcd = 0;
	double valor = 0;
	double valorTot = 0;
	double media = 0;
	
	do {
		cont = 0;
		valorTot = 0;
		System.out.print("Informe a quantidade de CDs ou (0) para sair: ");
		qcd = ent.nextInt();
		
		if(qcd == 0)
			break;
		else if(qcd < 0)
			System.out.println("Valor inválido.\n");
		
		while(cont < qcd) {
			cont++;
			System.out.printf("Informe o valor do %dº = ", cont);
			valor = ent.nextDouble();
			valorTot += valor;
			media = valorTot / qcd;
			
			if(cont == qcd) {
			System.out.printf("Valor total pago: %.2f%n", valorTot);
			System.out.printf("Valor médio gasto por cd: %.2f%n%n", media);
			}
		}
		
	}while(qcd != 0);
	
	System.out.println("Até a próxima!");
	
	ent.close();	
		
	}
}
