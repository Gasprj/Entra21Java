package OriObj.TrabOO.RPG;

public class Item {
	
	final Jogador jogador;
	int aleatorio;
	
	Item(Jogador jogador){
		this.jogador = jogador;
	}
	
//	Gerador de números aleatórios.
	public final int gerarAleat() {
		while(true) {
			this.aleatorio = (int) (Math.random() * 100);
			break;
		}
		return this.aleatorio;
	}
	
//	Aumenta a vida.
	public final String potion() {
		if(this.aleatorio >= 0 && this.aleatorio <= 05){
			this.jogador.life += 30;
			return "Bigger potion.\n";
		}else if(this.aleatorio >= 30 && this.aleatorio <= 40){
			this.jogador.life += 20;
			return "Big potion.\n";
		}else if(this.aleatorio >= 70 && this.aleatorio <= 90){
			this.jogador.life += 10;
			return "Small potion.\n";
		}else
			return "No potion.\n";
	}
	
//	Aumenta a defesa.
	public final String armor() {
		if(this.aleatorio >= 95 && this.aleatorio <= 100){
			this.jogador.armor += 5;
			return "Bigger armor.\n";
		}else if(this.aleatorio >= 60 && this.aleatorio <= 70){
			this.jogador.armor += 3;
			return "Big armor.\n";
		}else if(this.aleatorio >= 10 && this.aleatorio <= 30){
			this.jogador.armor += 2;
			return "Small armor.\n";
		}else
			return "No armor.\n";
	}
	
//	Aumenta o ataque.
	public final String weapon() {
		if(this.aleatorio >= 15 && this.aleatorio <= 20){
			this.jogador.weapon += 5;
			return "Bigger weapon.\n";
		}else if(this.aleatorio >= 85 && this.aleatorio <= 95){
			this.jogador.weapon += 3;
			return "Big weapon.\n";
		}else if(this.aleatorio >= 40 && this.aleatorio <= 60){
			this.jogador.weapon += 2;
			return "Small weapon.\n";
		}else
			return "No weapon.\n";
	}

}
