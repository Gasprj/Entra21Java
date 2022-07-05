package orientObj.lampada;

public class Lampada {
	
	private String tipo;
	private int potencia;
	private double preco;
	private boolean ligada = false;
	
	public Lampada(){
	}
	
	public Lampada(String tipo, int potencia, double preco){
		this.tipo = tipo;
		this.potencia = potencia;
		this.preco = preco;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public boolean ligar() {
		return this.ligada = true;
	}
	
	public boolean desligar() {
		return this.ligada = false;
	}

	public void interruptor() {
		if(this.ligada == true)
			this.ligada = false;
		else
			this.ligada = true;
	}
	
}
