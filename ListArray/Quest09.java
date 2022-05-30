package ListArray;

import java.util.Scanner;

public class Quest09 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);


		int[] vari = new int[10];
		int cont = 0;
		
		for (int i = 0; i < vari.length; i++) {
			System.out.printf("Digite a %dª idade: ", i + 1);
			vari[i] = ent.nextInt();	
			
			if (vari[i] > 35) {
				++cont;
			}
		}
		
		System.out.printf("%nExistem %d pessoas com mais de 35 anos.", cont);

		ent.close();
	}
}
