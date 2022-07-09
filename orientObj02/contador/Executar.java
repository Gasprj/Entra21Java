package orientObj02.contador;

public class Executar {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Contador cont = new Contador();
		System.out.println(Contador.getCont());
		
		Contador cont2 = new Contador();
		System.out.println(Contador.getCont());
		
		Contador cont3 = new Contador(3);
		System.out.println(Contador.getCont());
		
		Contador.zerarCont();
		System.out.println("\n" + Contador.getCont());
		
		Contador.setCont(3);
		System.out.println("\n" + Contador.getCont());
		
		Contador.setContMais(6);
		System.out.println(Contador.getCont());
		
	}

}
