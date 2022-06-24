package orientObj.lampada;

public class Lampada {
	
	String tipo;
	int potencia;
	double preco;
	boolean ligada = false;

	void interruptor() {
		if(this.ligada == true)
			this.ligada = false;
		else
			this.ligada = true;
	}
	
	boolean estaLigada() {
		return this.ligada;
	}

}
