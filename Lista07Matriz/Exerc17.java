package Lista07Matriz;

import java.util.Objects;

public class Exerc17 {
	
	String nome;
	int cds;
	
	Exerc17(String nome, int cds){
		this.nome = nome;
		this.cds = cds;
	}
	
	Exerc17(String nome){
		this.nome = nome;
	}
	
	Exerc17(int cds){
		this.cds = cds;
	}
	
	public int gratis() {
		return cds / 10;
	}
	
	public String toString() {
		return "Cliente: " + this.nome + 
				"\nCDs alugados: " + this.cds + 
				"\nCDs Grátis: " + gratis() + "\n";
	}
	
	public int hashCode() {
		return Objects.hash(cds, nome);
	}

	public boolean equals(Object obj) {
		if(obj instanceof Exerc17) {	
			Exerc17 other = (Exerc17) obj;
			return Objects.equals(this.nome, other.nome) && this.cds == other.cds;
		}else
			return false;
	}
	
	public String equals1(Object ob) {
		Exerc17 other = (Exerc17) ob;
		if(this.nome.equals(other.nome) && this.cds == other.cds)
			return "verdadeiro";
		else
			return "falso";
	}
	
	public String equals2(Object ob) {
		String other = this.nome;
		Integer outro = this.cds;
		if(other.equals(ob) || outro == ob)
			return "verdadeiro";
		else
			return "falso";
	}
	
		
}
