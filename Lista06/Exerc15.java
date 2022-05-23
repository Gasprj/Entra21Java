package Lista06;

import java.util.Scanner;

public class Exerc15 {
	public static void main(String[] args) {
	
		Scanner ent = new Scanner(System.in);
		
		int cod = 0;
		int senha = 0;
		
		System.out.println("O c�digo e a senha devem conter n�meros inteiros e positivos.");
		
		do {
			System.out.print("Informe o c�digo: ");
			cod = ent.nextInt();
			System.out.print("Informe a senha: ");
			senha = ent.nextInt();
			
			if(cod == senha)
				System.out.println("Informa��o inv�lida. A senha deve ser diferente do c�digo.\n");	
			else if(cod < 0 || senha < 0) {
				cod = senha;
					System.out.println("C�digo ou senha inv�lido.\n");
				}
			
		} while (cod == senha); 
		
		System.out.println("Informa��o validada.");
		
		ent.close();	
		
	}
}
