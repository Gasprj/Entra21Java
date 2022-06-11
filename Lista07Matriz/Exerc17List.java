package Lista07Matriz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc17List {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		List<Exerc17> lista = new ArrayList<>();
		char enc = '0';

		while(true) {
			System.out.print("Nova entrada? (s -> sim / n -> não) ");
			enc = ent.next().charAt(0);
			
			if(enc == 'n')
				break;
			
			ent.nextLine();
			
			System.out.println("Informe o nome e a quantidade de cds alugados:");
			lista.add(new Exerc17(ent.nextLine(), ent.nextInt()));
			
		}
		
		System.out.println();
		
		for (Exerc17 list : lista) {
			System.out.println(list);
		}
		
		ent.close();
	}

}
