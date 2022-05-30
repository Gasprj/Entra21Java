package ListArray;

import java.util.Scanner;

public class Quest17 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Informe quantos clientes ser�o avaliados ou digite (0) para sair: ");
			int nCli = ent.nextInt();
			
			if(nCli == 0)
				break;
			
			String[] cliente = new String[nCli];
			int[] cd = new int[nCli];
			
			System.out.println();
			
			for (int i = 0; i < cliente.length; i++) {
				ent.nextLine();
				System.out.printf("Informe o nome do %d� cliente: ", i + 1);
				cliente[i] = ent.nextLine();
				System.out.print("Informe a quantidade de cds: ");
				cd[i] = ent.nextInt();
				
				System.out.println();
				
			}
			
			for (int i = 0; i < cliente.length; i++) {
				if(cd[i] >= 10)
					System.out.printf("O cliente %s tem direito � locar %d cd(s) gr�tis.%n", cliente[i], cd[i] / 10);
				else if(cd[i] < 10)
					System.out.printf("O cliente %s n�o possu� direito � loca��o gr�tis.%n", cliente[i]);
			}
			
			System.out.println();
		}
		
		System.out.println("Sistema encerrado.");
			
		ent.close();	
			
	}

}
