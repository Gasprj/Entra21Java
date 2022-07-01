package OriObj.TrabOO.Carro;

public class CarroExec {
	public static void main(String[] args) {
		
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		System.out.println(ferrari.estaLigado());
		System.out.println(ferrari.motor.rpm());
		ferrari.ligar();
		System.out.println(ferrari.estaLigado());
		System.out.println(ferrari.motor.rpm());
		System.out.println();
		System.out.println(civic.estaLigado());
		System.out.println(civic.motor.rpm());
		civic.ligar();
		System.out.println(civic.estaLigado());
		System.out.println(civic.motor.rpm());
		System.out.println();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari.motor.rpm());
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println(civic.motor.rpm());
		System.out.println();
		ferrari.desacelerar();
		ferrari.desacelerar();
		ferrari.desacelerar();
		System.out.println(ferrari.motor.rpm());
		civic.desacelerar();
		civic.desacelerar();
		civic.desacelerar();
		System.out.println(civic.motor.rpm());
		System.out.println();
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari.motor.rpm());
		civic.ligarTurbo();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println(civic.motor.rpm());
		System.out.println();
		ferrari.desligarTurbo();
		ferrari.desacelerar();
		ferrari.desacelerar();
		ferrari.desacelerar();
		ferrari.desacelerar();
		ferrari.desacelerar();
		ferrari.desacelerar();
		ferrari.desacelerar();
		System.out.println(ferrari.motor.rpm());
		civic.desligarTurbo();
		civic.desacelerar();
		civic.desacelerar();
		civic.desacelerar();
		civic.desacelerar();
		civic.desacelerar();
		civic.desacelerar();
		civic.desacelerar();
		System.out.println(civic.motor.rpm());
		System.out.println();
		System.out.println(ferrari.getTemperatura());
		System.out.println(civic.getTemperatura());
		System.out.println();
		ferrari.ligarAr(19);
		civic.ligarAr(17);
		System.out.println(ferrari.getTemperatura());
		System.out.println(civic.getTemperatura());
		System.out.println();
		ferrari.desligarAr();
		civic.desligarAr();
		System.out.println(ferrari.getTemperatura());
		System.out.println(civic.getTemperatura());
		
	}

}
