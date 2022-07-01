package OriObj.TrabOO.Carro;

public class Carro {
	
	final Motor motor;
	private int temperatura = 36;
	private double delta = 0.3;
	private final double deltaFren = 0.3;
	
	Carro(){
		this.motor = new Motor(this);
	}
	
	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public double getDelta() {
		return delta;
	}

	public void setDeltaPos(double delta) {
		this.delta += delta;
	}
	
	public void setDeltaNeg(double delta) {
		this.delta -= delta;
	}
		
	public void acelerar() {
		if(motor.getLigado() == true)
			motor.setQuantInjecPos(delta);;
	}
	
	public void desacelerar() {
		if(motor.getLigado() == true && motor.rpm() > 900)
			motor.setQuantInjecNeg(deltaFren);
	}
	
	public void ligar() {
		motor.setLigado(true);;
	}
	
	public void desligar() {
		motor.setLigado(false);;
	}
	
	public boolean estaLigado() {
		return motor.getLigado();
	}

}
