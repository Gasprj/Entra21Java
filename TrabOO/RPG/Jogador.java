package OriObj.TrabOO.RPG;

public class Jogador {
	
	final Item item;
	String nome;
	int life;
	int armor;
	int weapon;
	int x;
	int y;
	
	Jogador(String nome, int vida, int armor, int weapon){
		this.nome  = nome;
		this.life = vida;
		this.armor = armor;
		this.weapon = weapon;
		this.item = new Item(this);
	}
	
	public String toString() {
		return this.nome;
	}
	
//	Apresentação dos personagens
	void apresPers() {
		System.out.println(this.nome);
		System.out.println("Vida: " + this.life);
		System.out.println("Defesa: " + this.armor);
		System.out.println("Ataque: " + (this.weapon + 7));
		System.out.println();
	}
	
//	Movimentação dos personagens.
	@SuppressWarnings("static-access")
	protected final boolean move(Direcao direcao) {
		if(y <= 6 && direcao.equals(direcao.Sul)) {
			y++;
			return true;
		}else if(y >= 1  && direcao.equals(direcao.Norte)) {
			y--;
			return true;
		}else if(x <= 6 && direcao.equals(direcao.Leste)) { 
			x++;
			return true;
		}else if(x >= 1 && direcao.equals(direcao.Oeste)) {
			x--;
			return true;
		}else
			return false;
	}
	
//	Ataque dos personagens.
	protected void atack(Jogador Advers) {
		int deltaX = Math.abs(x - Advers.x);
		int deltaY = Math.abs(y - Advers.y);
		
		if((deltaX == 0 && deltaY == 1) || (deltaX == 1 && deltaY == 0) || (deltaX == 0 && deltaY == 0)) {
			if(Advers.armor < (this.weapon + 7)) {
				Advers.life -= (this.weapon + 7) - Advers.armor;
				System.out.println("Ataque Efetuado\n");
			}else if(Advers.armor >= (this.weapon + 7)){
				System.out.println("Ataque Bloqueado\n");
			}
		}else {
			System.out.println("Ataque Inválido\n");
		}
	}
	
}
