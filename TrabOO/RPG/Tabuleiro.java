package OriObj.TrabOO.RPG;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tabuleiro {
	public static void main(String[] args) {
	
		Scanner ent = new Scanner(System.in);
		List<Jogador> jogador = new ArrayList<Jogador>();
		int[][] tabuleiro = new int[8][8];
		String nome = "";
		int numJogadores;
		char personagem = 0;
	
		
		
		principal:
		while(true) {
	//	Escolha do número de jogadores.
			while(true) {
				System.out.print("(limite máximo 04 jogadores)\n(limite mínimo 02 jogadores)\n"
						+ "Informe o número de jogadores ou digite '0' para sair: ");
				numJogadores = ent.nextInt();
				
				if(numJogadores >= 2 && numJogadores <= 4)
					break;
				if(numJogadores == 0)
					break principal;
			}
			
	//	Escolha dos personagens.
			do {
				numJogadores--;
				System.out.print("\nEscolha seu personagem.\n 'V' para Viking ou 'M' para Monstro: ");
				personagem = ent.next().charAt(0);
				
				ent.nextLine(); // Correção do comando 'nextLine'.
				
				if((personagem == 'v' || personagem == 'V') && numJogadores == 3) {
					System.out.print("\nDigite o nome do seu pesonagem: ");
					nome = ent.nextLine();
					Viking v1 = new Viking("Viking " + nome, 80, 2, 4);
					v1.x = 0;
					v1.y = 0;
					jogador.add(v1);
					tabuleiro[v1.y][v1.x] = 1;
				}else if((personagem == 'v' || personagem == 'V') && numJogadores == 2) {
					System.out.print("\nDigite o nome do seu pesonagem: ");
					nome = ent.nextLine();
					Viking v2 = new Viking("Viking " + nome, 80, 2, 4);
					v2.x = 0;
					v2.y = 7;
					jogador.add(v2);
					tabuleiro[v2.y][v2.x] = 2;
				}else if((personagem == 'v' || personagem == 'V') && numJogadores == 1) {
					System.out.print("\nDigite o nome do seu pesonagem: ");
					nome = ent.nextLine();
					Viking v3 = new Viking("Viking " + nome, 80, 2, 4);
					v3.x = 7;
					v3.y = 7;
					jogador.add(v3);
					tabuleiro[v3.y][v3.x] = 3;
				}else if((personagem == 'v' || personagem == 'V') && numJogadores == 0) {
					System.out.print("\nDigite o nome do seu pesonagem: ");
					nome = ent.nextLine();
					Viking v4 = new Viking("Viking " + nome, 80, 2, 4);
					v4.x = 7;
					v4.y = 0;
					jogador.add(v4);
					tabuleiro[v4.y][v4.x] = 4;
				}else if((personagem == 'm' || personagem == 'M') && numJogadores == 3) {
					System.out.print("\nDigite o nome do seu pesonagem: ");
					nome = ent.nextLine();
					Monstro m1 = new Monstro("Monstro " + nome, 110, 1, 2);
					m1.x = 0;
					m1.y = 0;
					jogador.add(m1);
					tabuleiro[m1.y][m1.x] = 1;
				}else if((personagem == 'm' || personagem == 'M') && numJogadores == 2) {
					System.out.print("\nDigite o nome do seu pesonagem: ");
					nome = ent.nextLine();
					Monstro m2 = new Monstro("Monstro " + nome, 110, 1, 2);
					m2.x = 0;
					m2.y = 7;
					jogador.add(m2);
					tabuleiro[m2.y][m2.x] = 2;
				}else if((personagem == 'm' || personagem == 'M') && numJogadores == 1) {
					System.out.print("\nDigite o nome do seu pesonagem: ");
					nome = ent.nextLine();
					Monstro m3 = new Monstro("Monstro " + nome, 110, 1, 2);
					m3.x = 7;
					m3.y = 7;
					jogador.add(m3);
					tabuleiro[m3.y][m3.x] = 3;
				}else if((personagem == 'm' || personagem == 'M') && numJogadores == 0) {
					System.out.print("\nDigite o nome do seu pesonagem: ");
					nome = ent.nextLine();
					Monstro m4 = new Monstro("Monstro " + nome, 110, 1, 2);
					m4.x = 7;
					m4.y = 0;
					jogador.add(m4);
					tabuleiro[m4.y][m4.x] = 4;
				}else {
					System.out.println("\nComando inválido.");
					numJogadores++;
				}
				
			}while (numJogadores != 0);
			
	//	Apresentação dos personagens após a escolha.
			for (Jogador jog : jogador) {
				numJogadores++;
				System.out.println("Jogador " + numJogadores);
				jog.apresPers();
			}
			
			for (int[] is : tabuleiro) {
				for (int is2 : is) {
					System.out.print(is2 + "|");
				}
				System.out.println();
			}
			
			
		}
		ent.close();
	}
	
}
