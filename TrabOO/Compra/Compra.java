package OriObj.TrabOO.Compra;

import java.util.ArrayList;
import java.util.Objects;

public class Compra {
	
	Cliente cliente;
	int codComp = 0;
	final ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	Compra(){
	}
	
	Compra(int cod){
		this.codComp = cod;
	}
	
	void addProduto(String nome, int quant, double preco) {
		this.addProduto(new Produto(nome, quant, preco));
	}
	
	void addProduto(Produto produto) {
		this.produtos.add(produto);
		produto.compra = this;
	}
	
	public String toString() {
		return "\n==> Código da compra: " + this.codComp + " <==" + "\n-------------------------------";
	}
	
	double valTot() {
		double total = 0;
		for (Produto produto : produtos) {
			total += produto.preco * produto.quant;
		}
		return total;
	}
	
	double valTotInd(int i) {
		return produtos.get(i).preco * produtos.get(i).quant;
	}

	public int hashCode() {
		return Objects.hash(codComp, produtos);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compra other = (Compra) obj;
		return codComp == other.codComp && Objects.equals(produtos, other.produtos);
	}
	
}
