package OriObj.TrabOO.Carro;

public class Civic extends Carro implements Esportivo, Luxo{
	
	public void ligarTurbo() {
		super.setDeltaPos(0.4);
	}

	public void desligarTurbo() {
		super.setDeltaNeg(0.4);
	}

	public void ligarAr(int temperatura) {
		super.setTemperatura(temperatura);
	}

	public void desligarAr() {
		super.setTemperatura(36);
	}

}
