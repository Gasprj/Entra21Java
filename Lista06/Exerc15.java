package Lista06;

import java.util.Scanner;

public class Exerc15 {
	public static void main(String[] args) {
	
		Scanner ent = new Scanner(System.in);
		
		int cod = 0;
		int senha = 0;
		
		System.out.println("O código e a senha devem conter números inteiros e positivos.");
		
		do {
			System.out.print("Informe o código: ");
			cod = ent.nextInt();
			System.out.print("Informe a senha: ");
			senha = ent.nextInt();
			
			if(cod == senha)
				System.out.println("Informação inválida. A senha deve ser diferente do código.\n");	
			else if(cod < 0 || senha < 0) {
				cod = senha;
					System.out.println("Código ou senha inválido.\n");
				}
			
		} while (cod == senha); 
		
		System.out.println("Informação validada.");
		
		ent.close();	
		
	}
}
