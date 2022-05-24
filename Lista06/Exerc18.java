package Lista06;

import java.util.Scanner;

public class Exerc18 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		long paisA = (long) 0;
		long paisB = (long) 0;

		while(true) {
			System.out.println("Digite '-1' a qualquer momento para sair.");
			System.out.print("Informe a população do 1º país: ");
			paisA = ent.nextLong();
			
			if(paisA == -1)
				break;
			
			System.out.print("Informe a taxa de crescimento da população do 1º país: ");
			double txA = ent.nextDouble();
			
			if(txA == -1)
				break;
			
			System.out.print("Informe a população do 2º país: ");
			paisB = ent.nextLong();
			
			if(paisB == -1)
				break;
			
			System.out.print("Informe a taxa de crescimento da população do 2º país: ");
			double txB = ent.nextDouble();
			
			if(txB == -1)
				break;
			
			if(paisA > paisB) {
				System.out.println("\nA população do 1º país informado deve ser "
								 + "\nmenor que a população do 2º país informado.\n");
				continue;
			}else if(txA <= txB) {
				System.out.println("\nCom essas taxas de crescimento o resultado é impossível.\n");
				continue;
			}
			
			for (int anos = 0; true;) {
				paisA *= (1 + txA);
				paisB *= (1 + txB);
				anos++;
							
//				System.out.println(anos + " - " + paisA + " - " + paisB);
		
				if(paisA > paisB) {
					System.out.printf("\nA população do 1º país informado irá ultrapassar a "
									+ "\npopulação do 2º país informado após %d anos.", anos);
					System.out.println("\n");
					break;
				}else if (paisA == paisB) {
					System.out.printf("\nA população do 1º país informado se igualará à "
							+ "\npopulação do 2º país informado após %d anos.", anos);
					System.out.println("\n");
					break;
				}
			}
			System.out.println("\n--------------------------------------------");
			System.out.println("	-NOVA ENTRADA DE DADOS-");
			System.out.println("--------------------------------------------\n");
		}
		
		System.out.println("\nTchau!");

		ent.close();	
			
	}

}
