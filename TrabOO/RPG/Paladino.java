package OriObj.TrabOO.RPG;

public class Paladino extends Jogador {

	Paladino(String nome, int vida, int armor, int weapon) {
		super(nome, vida, armor, weapon);
	}

	public void atack(Jogador Advers) {
		super.atack(Advers);
		super.atack(Advers);
		super.atack(Advers);
	}
	
}
