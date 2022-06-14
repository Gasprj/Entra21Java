package OriObj.TrabOO;

import java.util.ArrayList;
import java.util.Objects;

public class Compra {
	
	int codComp = 0;
	
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	Compra(int cod){
		this.codComp = cod;
	}
	
	public String toString() {
		return "==> Código da compra: " + this.codComp + " <==" + "\n-------------------------------";
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
