package Lista06;

import java.util.Scanner;

public class Exerc18 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		long paisA = (long) 0;
		long paisB = (long) 0;

		while(true) {
			System.out.println("Digite '-1' a qualquer momento para sair.");
			System.out.print("Informe a popula��o do 1� pa�s: ");
			paisA = ent.nextLong();
			
			if(paisA == -1)
				break;
			
			System.out.print("Informe a taxa de crescimento da popula��o do 1� pa�s: ");
			double txA = ent.nextDouble();
			
			if(txA == -1)
				break;
			
			System.out.print("Informe a popula��o do 2� pa�s: ");
			paisB = ent.nextLong();
			
			if(paisB == -1)
				break;
			
			System.out.print("Informe a taxa de crescimento da popula��o do 2� pa�s: ");
			double txB = ent.nextDouble();
			
			if(txB == -1)
				break;
			
			if(paisA > paisB) {
				System.out.println("\nA popula��o do 1� pa�s informado deve ser "
								 + "\nmenor que a popula��o do 2� pa�s informado.\n");
				continue;
			}else if(txA <= txB) {
				System.out.println("\nCom essas taxas de crescimento o resultado � imposs�vel.\n");
				continue;
			}
			
			for (int anos = 0; true;) {
				paisA *= (1 + txA);
				paisB *= (1 + txB);
				anos++;
							
//				System.out.println(anos + " - " + paisA + " - " + paisB);
		
				if(paisA > paisB) {
					System.out.printf("\nA popula��o do 1� pa�s informado ir� ultrapassar a "
									+ "\npopula��o do 2� pa�s informado ap�s %d anos.", anos);
					System.out.println("\n");
					break;
				}else if (paisA == paisB) {
					System.out.printf("\nA popula��o do 1� pa�s informado se igualar� � "
							+ "\npopula��o do 2� pa�s informado ap�s %d anos.", anos);
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
