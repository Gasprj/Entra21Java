package OriObj.TrabOO;

public class Produto {
	
	String nome;
	int quant;
	double preco;
	
	Produto(String nome, int quant, double preco){
		this.nome = nome;
		this.quant = quant;
		this.preco = preco;
	}
	
	public String toString(String fr) {
		return "Produto: " + this.nome + "\nQuantidade: " 
				+ this.quant + "\nPreço: " + this.preco + fr + "\n_____________________";
	}
	
}
