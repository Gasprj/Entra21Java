package Lista06;

import java.util.Scanner;

public class Exerc05 {
	public static void main(String[] args) {
			
		Scanner ent = new Scanner(System.in);

		int num = 0;
		
		do {
			System.out.print("Informe um n�mero ou '0' para sair: ");
			num = ent.nextInt();
			int result = 0;
			int n1 = 0;
			
			while(result < num) {
				n1++;
				result = n1 * (n1 + 1) * (n1 + 2);
				
		//		System.out.println(n1 + " " + result);
			}
			
			if(result == num) { 
				System.out.println("Esse n�mero � triangular.");
				System.out.println("Ele � resultado da opera��o: "
						+ "" + n1 + " * " + (n1 + 1) + " * " + (n1 + 2) + "\n");
			}else if (result != num) 
				System.out.println("Esse n�mero n�o � triangular.\n");
			
		}while (num != 0);
		
		System.out.println("At� logo!!");

		ent.close();	
			
	}
}

