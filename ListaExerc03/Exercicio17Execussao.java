package ListaExerc03;

import java.util.Scanner;

public class Exercicio17Execussao {
	public static void main(String[] args) {
	
	Scanner ent = new Scanner(System.in);

	Exercicio17 ex = new Exercicio17();
	System.out.print("DIga seu nome: ");
	ex.nome = ent.nextLine();
	System.out.print("Informe sua idade: ");
	ex.idade = ent.nextInt();
	
	int tempo = ex.anosVividos();
	
	System.out.printf("%n%s já viveu aproximadamente %d anos.", ex.nome, tempo);

	ent.close();	
	}
}
