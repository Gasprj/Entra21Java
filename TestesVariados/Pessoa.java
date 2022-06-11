package TestesVariados;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa (String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	 void comer (Comida comida) {
		if (comida.peso != 0) {
			this.peso += comida.peso;
		}
	}
	 
	 String frase() {
		 return "Eu sou " + this.nome + " e peso " + this.peso + " kgs.\n";
	 }

}
