package orientObj.lampada;

public class LampadaExec {
	public static void main(String[] args) {
		
		Lampada lamp = new Lampada();
		Lampada lamp2 = new Lampada();
		Lampada lamp3 = new Lampada("led", 12, 7.99);
		
		lamp2.setTipo("filamento");
		lamp2.setPotencia(100);
		lamp2.setPreco(11.99);
		
		lamp.setTipo("fluorescente");
		lamp.setPotencia(60);
		lamp.setPreco(9.99);
		
		System.out.println("==== L�mpadas ====");
		System.out.println("__________________");
		System.out.println("\nTipo: " + lamp.getTipo());
		System.out.println("Pot�ncia: " + lamp.getPotencia() + " watts");
		System.out.println("Pre�o: R$" + lamp.getPreco());
		System.out.println("\nTipo: " + lamp2.getTipo());
		System.out.println("Pot�ncia: " + lamp2.getPotencia() + " watts");
		System.out.println("Pre�o: R$" + lamp2.getPreco());
		System.out.println("\nTipo: " + lamp3.getTipo());
		System.out.println("Pot�ncia: " + lamp3.getPotencia() + " watts");
		System.out.println("Pre�o: R$" + lamp3.getPreco());
		
		System.out.println("\n\n");
		
		System.out.println("A l�mpada est� ligada: " + lamp.isLigada());
		lamp.interruptor();
		System.out.println("A l�mpada est� ligada: " + lamp.isLigada());
		lamp.interruptor();
		System.out.println("A l�mpada est� ligada: " + lamp.isLigada());
		
	}

}
