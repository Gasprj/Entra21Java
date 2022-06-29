package OriObj.TrabOO.tioSob;

import java.util.ArrayList;
import java.util.List;

public class Sobrinho {

	final String nome;
	final List<Tio> tios = new ArrayList<>();
	
	Sobrinho(String nome){
		this.nome = nome;
	}
	
	void addTio(Tio tio) {
		this.tios.add(tio);
		tio.sobrinhos.add(this);
	}
	
	public String toString() {
		return this.nome;
	}
	
}
