package Lista07Matriz;

import java.util.Scanner;

public class TesteMatrizTrab01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numeroPessoas = 0;
		int qtdFilhos = 0;
		
		System.out.print("Entre com o numero de pessoas que serao entrevistadas: ");
		numeroPessoas = scan.nextInt();
		String[][] nomesFilhos = new String[numeroPessoas] [];
		
		for(int i = 0; i < nomesFilhos.length; i++) {
			
			System.out.print("Entre com a quantidade de filho(s) da pessoa" + (i + 1) + ": ");
			qtdFilhos = scan.nextInt();
			nomesFilhos[i] = new String[qtdFilhos];
			
			System.out.println();
			scan.nextLine();
			for(int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.print("Digite o nome do " + (j+1)+ " filho:");
				nomesFilhos[i][j] = scan.nextLine();
			}
			System.out.println();
		}
		
		for(int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa" + (i+1) + " tem  " + nomesFilhos[i].length  + " filhos");
			for(int j = 0; j <nomesFilhos[i].length;j++ )
				System.out.println(nomesFilhos[i][j]);
			
			System.out.println();
		}
		
		scan.close();
	}

}
