package ExercOrieObj01.Lampada;

public class LampExec {
	public static void main(String[] args) {
	
	Lampada lamp = new Lampada();
	Lampada lamp2 = new Lampada();
	Lampada lamp3 = new Lampada();
	
	lamp.tipo = "filamento";
	lamp.potencia = 100;
	lamp.preco = 11.99;
	
	lamp2.tipo = "fluorescente";
	lamp2.potencia = 60;
	lamp2.preco = 9.99;
	
	lamp3.tipo = "led";
	lamp3.potencia = 12;
	lamp3.preco = 7.99;
	
	System.out.println("==== Lâmpadas ====");
	System.out.println("__________________");
	System.out.println("\nTipo: " + lamp.tipo);
	System.out.println("Potência: " + lamp.potencia + " watts");
	System.out.println("Preço: R$" + lamp.preco);
	System.out.println("\nTipo: " + lamp2.tipo);
	System.out.println("Potência: " + lamp2.potencia + " watts");
	System.out.println("Preço: R$" + lamp2.preco);
	System.out.println("\nTipo: " + lamp2.tipo);
	System.out.println("Potência: " + lamp2.potencia + " watts");
	System.out.println("Preço: R$" + lamp2.preco);
	
	System.out.println("\n\n");
	
	System.out.println(lamp.estaLigada());
	lamp.interruptor();
	System.out.println(lamp.estaLigada());
	lamp.interruptor();
	System.out.println(lamp.estaLigada());
	
	}
	
}
