package OriObj.TrabOO.Compra;

import java.util.ArrayList;
import java.util.Objects;

public class Cliente {
	
	final ArrayList<Compra> compra = new ArrayList<Compra>();
	
	String nome;
	int id;
	String endereco;
	
	
	Cliente(){
	}
	
	Cliente(String nome, int id, String endereco){
		this.nome = nome;
		this.id = id;
		this.endereco = endereco;
	}
	
	void addCompra(int cod) {
		this.addCompra(new Compra(cod));
	}
	
	void addCompra(Compra compra) {
		this.compra.add(compra);
		compra.cliente = this;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nIdentificação: " + this.id + "\nEndereço: " + this.endereco;
	}

	public int hashCode() {
		return Objects.hash(compra, endereco, id, nome);
	}

	public boolean equals(Object obj) {
		if (obj instanceof Cliente) {
			Cliente other = (Cliente) obj;
			return Objects.equals(compra, other.compra) && Objects.equals(endereco, other.endereco) 
					&& id == other.id && Objects.equals(nome, other.nome);
		}else
			return false;
	}
	
	
	
}
