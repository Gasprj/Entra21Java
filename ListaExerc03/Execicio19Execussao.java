package ListaExerc03;

import java.util.Scanner;

public class Execicio19Execussao {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		Exercicio19 ex = new Exercicio19();
		System.out.print("Diga a quantidade de horas: ");
		ex.horas = ent.nextInt();
		
		int minut = ex.minutos();
		int seg = ex.segundos();
		
		System.out.printf("%nEssas horas contém %d minutos e %d segundos.", minut, seg);

		ent.close();
	}
}
