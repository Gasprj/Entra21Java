package refeicao;

public class Pessoa {

	private double peso;
	private double pesoPrato;

	public Pessoa(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0)
			this.peso = peso;
	}
	
	public void fazerPrato(Comida comida) {
		this.pesoPrato += comida.getPeso();
	}
	
	public double pesoPrato() {
		return this.pesoPrato;
	}

	public void comer() {
		this.peso += this.pesoPrato;
	}

}
