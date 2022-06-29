package OriObj.TrabOO.Carro;

public class Motor {

	final Carro carro;
	boolean ligado = false;
	double quantInjec = 1;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	
	int rpm() {
		if(!ligado)
			return 0;
		else
			return (int) Math.round(quantInjec * 900);
	}

}
