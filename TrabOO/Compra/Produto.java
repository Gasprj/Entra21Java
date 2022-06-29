package OriObj.TrabOO.Compra;

public class Produto {
	
	Compra compra;
	String nome;
	int quant;
	double preco;
	
	Produto(){
	}
	
	Produto(String nome, int quant, double preco){
		this.nome = nome;
		this.quant = quant;
		this.preco = preco;
	}
	
	public String toString(String fr) {
		return "Produto: " + this.nome + "\nQuantidade: " 
				+ this.quant + "\nPreço: " + this.preco + fr + "\n_____________________";
	}
	
	public String toString() {
		return "Produto: " + this.nome + "\nQuantidade: " 
				+ this.quant + "\nPreço: " + this.preco + "\n_____________________";
	}
	
}
