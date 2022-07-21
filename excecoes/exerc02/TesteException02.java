package excecoes.exerc02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteException02 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		double r = 0;
		int x = 0;
		int y = 0;

		System.out.println("Eu sei dividir.");

		while(true) {
			try {
				System.out.print("Informe o 1º valor: ");
				x = ent.nextInt();
				System.out.print("Informe o 2º valor: ");
				y = ent.nextInt();
				r = x / y;
			} catch (InputMismatchException | ArithmeticException e) {
				System.out.println("\nDigite somente números inteiros diferentes de 0.");
				ent.nextLine();
				continue;
			}
			break;
		}
		
		System.out.println("Fim!");
		ent.close();
		
	}

}
