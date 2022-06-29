package OriObj.TrabOO.Carro;

public class CarroExec {
	public static void main(String[] args) {
		
		Carro civic = new Civic();
		Carro ferrari = new Ferrari();
		
		System.out.println(ferrari.estaLigado());
		ferrari.ligar();
		System.out.println(ferrari.estaLigado());
		System.out.println(ferrari.motor.rpm());
		System.out.println();
		System.out.println(civic.estaLigado());
		civic.ligar();
		System.out.println(civic.estaLigado());
		System.out.println(civic.motor.rpm());
		System.out.println();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari.motor.rpm());
		System.out.println();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println(civic.motor.rpm());
		
	}

}
