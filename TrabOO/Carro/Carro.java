package OriObj.TrabOO.Carro;

public class Carro {
	
	final Motor motor;
	
	Carro(){
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		if(motor.ligado == true)
			motor.quantInjec += 0.3;
	}
	
	void desacelerar() {
		if(motor.ligado == true && motor.rpm() > 900)
			motor.quantInjec -= 0.3;
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}

}
