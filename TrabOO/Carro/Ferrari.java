package OriObj.TrabOO.Carro;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	public void acelerar() {
		super.acelerar();
		super.acelerar();
	}

	public void desacelerar() {
		super.desacelerar();
		super.desacelerar();
	}

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
