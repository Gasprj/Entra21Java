package TestesVariados;

public class Jantar {
	public static void main(String[] args) {
		
	Pessoa p = new Pessoa("Carlos", 84.2);	
	
	Comida c1 = new Comida("frango", 0.520);
	Comida c2 = new Comida("batata", 0.430);
	
	System.out.println(p.frase());
	
	p.comer(c1);
	String apres = String.format(p.frase() + "Eu comi uma porção de %s.%n", c1.nome);
	System.out.println(apres);

	p.comer(c2);
	String apres2 = String.format(p.frase() + "Eu comi uma porção de %s e outra de %s.", c1.nome, c2.nome);
	System.out.println(apres2);
		
	}
}
