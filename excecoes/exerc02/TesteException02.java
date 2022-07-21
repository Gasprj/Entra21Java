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
				System.out.print("Informe o 1� valor: ");
				x = ent.nextInt();
				System.out.print("Informe o 2� valor: ");
				y = ent.nextInt();
				r = x / y;
			} catch (InputMismatchException | ArithmeticException e) {
				System.out.println("\nDigite somente n�meros inteiros diferentes de 0.");
				ent.nextLine();
				continue;
			}
			
//			System.out.println("\nO resultado da divis�o � " + r + "\n");
//			if((x > 0 || x < 0) && (y > 0 || y < 0))
				break;
			
		}
		
		System.out.println("Fim!");
		ent.close();
		
	}

}
