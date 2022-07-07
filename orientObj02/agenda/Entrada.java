package orientObj02.agenda;

import java.util.Scanner;

public class Entrada {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		System.out.print("Nome da agenda: ");
		Agenda agenda = new Agenda(ent.nextLine());
		
		System.out.println("\nAdicionar contatos...");
		
		Contato c1 = new Contato();
		System.out.print("Nome: ");
		c1.setNome(ent.nextLine());
		System.out.print("Telefone: ");
		c1.setTelefone(ent.nextInt());
		System.out.print("Email: ");
		c1.setEmail(ent.next());
		
		Contato c2 = new Contato();
		ent.nextLine();
		System.out.print("\nNome: ");
		c2.setNome(ent.nextLine());
		System.out.print("Telefone: ");
		c2.setTelefone(ent.nextInt());
		System.out.print("Email: ");
		c2.setEmail(ent.next());
		
		Contato c3 = new Contato();
		ent.nextLine();
		System.out.print("\nNome: ");
		c3.setNome(ent.nextLine());
		System.out.print("Telefone: ");
		c3.setTelefone(ent.nextInt());
		System.out.print("Email: ");
		c3.setEmail(ent.next());
	
		agenda.setContato(0, c1);
		agenda.setContato(1, c2);
		agenda.setContato(2, c3);
		
		agenda.exibirContatos();
		
		ent.close();
	}

}
