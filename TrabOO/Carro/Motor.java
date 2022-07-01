package OriObj.TrabOO.Carro;

public class Motor {

	final Carro carro;
	private boolean ligado = false;
	private double quantInjec = 1;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	
	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public double getQuantInjec() {
		return quantInjec;
	}

	public void setQuantInjecPos(double quantInjec) {
		this.quantInjec += quantInjec;
	}
	
	public void setQuantInjecNeg(double quantInjec) {
		this.quantInjec -= quantInjec;
	}

	public int rpm() {
		if(!ligado)
			return 0;
		else
			return (int) Math.round(quantInjec * 900);
	}
	
}
