
package ListaExerc03;

import java.util.Scanner;

public class Exercicio15Execussao {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		Execicio15 ex = new Execicio15();
		System.out.print("Informe o número: ");
		ex.lado = ent.nextDouble();
		
		ex.area();
			

		ent.close();
	}
}
