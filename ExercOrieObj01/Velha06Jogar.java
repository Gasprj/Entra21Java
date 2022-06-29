package ExercOrieObj01;

import java.util.Scanner;

public class Velha06Jogar {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		Velha06 velha = new Velha06();
		
		while(true) {
			velha.cont++;
			
			velha.tabuleiro();
			velha.resultado();
			
			if(!velha.geraResult().equals("")) {
				System.out.println(velha.geraResult());
				break;
			}
				
			lacoW: while(true) {
				if(velha.cont % 2 == 1) {
					System.out.print("Informe a posição onde quer jogar (O): ");
					if(velha.jogada(ent.next().charAt(0)) == true) {
						System.out.println();
						break lacoW;
					}else
						System.out.println("\n== Jogada inválida ==\n");
				}else {
					System.out.print("Informe a posição onde quer jogar (X): ");
					if(velha.jogada(ent.next().charAt(0)) == true) {
						System.out.println();
						break lacoW;
					}else
						System.out.println("\n== Jogada inválida ==\n");
				}
				
			}

		}
			
		System.out.println("\nFim de jogo!");
		
		ent.close();
		
	}

}
