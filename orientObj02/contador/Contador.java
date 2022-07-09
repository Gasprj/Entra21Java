package orientObj02.contador;

public class Contador {
	
	@SuppressWarnings("unused")
	static private int cont;
	
	@SuppressWarnings("static-access")
	public Contador() {
		this.cont++;
	}
	
	@SuppressWarnings("static-access")
	public Contador(int cont) {
		this.cont += cont;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Contador.cont = cont;
	}

	public static void setContMais(int cont) {
		Contador.cont += cont;
	}
	
	public static void zerarCont() {
		Contador.cont = 0;
	}
	
}
