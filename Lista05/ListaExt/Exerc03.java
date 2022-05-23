package Lista05.ListaExt;

import java.util.Scanner;

public class Exerc03 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		int ano = 0;
		
		do{
			System.out.print("Informe o ano ou (0) para sair: ");
			ano = ent.nextInt();
			
			if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
				System.out.println("Esse ano � bissexto.\n");
			}else
				System.out.println("Esse ano n�o � bissexto.\n");
		
		} while (ano != 0);
		
		System.out.println("At� a pr�xima!!!");
				
		ent.close();
	}
}
