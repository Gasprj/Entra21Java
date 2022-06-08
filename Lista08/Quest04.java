package Lista08;

import java.util.Scanner;

public class Quest04 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		String[][] agenda = new String[31][24];
		int dia = 0;
		int hora = 0;
		
		while(true) {
			System.out.print("Informe 'A' para acessar informações na agenda,\n "
					+ "'I' para incluir ou 'F' para fechar a agenda: ");
			char ch = ent.next().charAt(0);
			
			if(ch == 'f' || ch == 'F')
				break;
			
			else if (ch == 'i' || ch == 'I') {
					System.out.print("\nInforme o dia: ");
					dia = ent.nextInt();
					
					if(dia > 0 && dia <= agenda.length) {
						System.out.print("Informe a hora(somente hora exata, das 0 às 23 horas): ");
						hora = ent.nextInt();
						
						if(hora >= 0 && hora <= 23) {
							ent.nextLine();
							System.out.printf("%nAgenda dia %d, %d horas...%nEscreva o compromisso: ",dia, hora);
							agenda[dia - 1][hora] = ent.nextLine();
							System.out.println();
						}else
							System.out.println("\nHora incorreta.\nVoltando ao inicio.\n");
						
					}else
						System.out.println("\nDia inválido.\nRepita a ação.\n");
					
			}else if (ch == 'a' || ch == 'A') {
					System.out.print("\nInforme o dia: ");
					dia = ent.nextInt();
					
					if(dia > 0 && dia <= agenda.length) {
						System.out.print("Informe a hora(somente hora exata, das 0 às 23 horas): ");
						hora = ent.nextInt();
						
						if(hora >= 0 && hora <= 23) {
							System.out.printf("%nAgenda dia %d, %d horas...%nImprindo informações...%n",dia, hora);
							System.out.println("_________________________________________________________________________________________________________________");
							System.out.println("Compromisso agendado: " + agenda[dia - 1][hora]);
							System.out.println("_________________________________________________________________________________________________________________\n");
						}else
							System.out.println("\nHora incorreta.\nVoltando ao inicio.\n");
						
					}else
						System.out.println("\nDia inválido.\nRepita a ação.\n");
				
			}else
				System.out.println("\nInformação inválida...\nTente novamente.\n");
		}
		
		System.out.println("\nAgenda fechada.");
		
		ent.close();
		
		
	}

}
