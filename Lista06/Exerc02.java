package Lista06;

import java.util.Scanner;

public class Exerc02 {
	public static void main(String[] args) {
	
	Scanner ent = new Scanner(System.in);
	
	int numMult = 0;
	int numCart = 0;
	int hab = 0;
	double valorMult = 0;
	double totMult = 0;
	double totMultDet = 0;
	double ntotMult = 0;
	
	laco1: for(;numCart != -1;) {
		numMult = 0;
		totMult = 0;
		
		System.out.print("Digite o número da carteira de \nmotorista ou (-1) para sair: ");
		numCart = ent.nextInt();
		System.out.println();
		if(numCart == -1) {
			break;
		}
			
		for(;valorMult != -5968;) {
			System.out.print("Digite o valor das multas ou (-1) \npara uma nova entrada: ");
			valorMult = ent.nextInt();		
			if(valorMult >= 1) {
				numMult++;
				totMult += valorMult;
				totMultDet += valorMult;
				if(numMult > ntotMult) {
					ntotMult = numMult;
					hab = numCart;
				}
				
			}else {
				System.out.println("\nCarteira: " + numCart);
				System.out.println("Número de multas: " + numMult);
				System.out.println("Valor total das multas: " + totMult + "\n");	
			}
			if(valorMult == -1) {
				continue laco1;
			}
		}
		
	}
	
	System.out.printf("A carteira %d teve maior quantidade de multas", hab);
	System.out.printf("%nTotal arrecadado pelo detran: R$ %.2f", totMultDet);
	
	ent.close();
		
	}
}
