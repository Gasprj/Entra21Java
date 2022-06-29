package OriObj.TrabOO.tioSob;

import java.util.ArrayList;
import java.util.List;

public class Tio {
	
	final String nome;
	final List<Sobrinho> sobrinhos = new ArrayList<Sobrinho>();
	
	Tio(String nome){
		this.nome = nome;
	}
	
	void addSobrinho(Sobrinho sobrin){
		this.sobrinhos.add(sobrin);
		sobrin.tios.add(this);
	}
	
	public String toString() {
		return this.nome;
	}
	
}
