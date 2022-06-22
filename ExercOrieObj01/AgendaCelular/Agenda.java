package ExercOrieObj01.AgendaCelular;

public class Agenda {
	public static void main(String[] args) {
		
		Contato c1 = new Contato();
		Contato c2 = new Contato();
		Contato c3 = new Contato();
		
		c1.nome = "Cláudia";
		c1.numeroResid = 23659874;
		c1.numeroCel = 985641238;
		c1.email = "claudia_dias@gmail.com";
		
		c2.nome = "Marcos";
		c2.numeroResid = 22658479;
		c2.numeroCel = 986329547;
		c2.email = "marc_silva@gmail.com";

		c3.nome = "Roberto";
		c3.numeroResid = 25478928;
		c3.numeroCel = 986589479;
		c3.email = "beto_22@gmail.com";
		
		System.out.println("   == Agenda Telefônica ==   ");
		System.out.println("_____________________________");
		System.out.println("     ---- Contatos ----     ");
		System.out.println("\nNome: " + c1.nome);
		System.out.println("Telefone residencial: " + c1.numeroResid);
		System.out.println("Telefone celular: " + c1.numeroCel);
		System.out.println("E-mail: " + c1.email);
		System.out.println("\nNome: " + c2.nome);
		System.out.println("Telefone residencial: " + c2.numeroResid);
		System.out.println("Telefone celular: " + c2.numeroCel);
		System.out.println("E-mail: " + c2.email);
		System.out.println("\nNome: " + c3.nome);
		System.out.println("Telefone residencial: " + c3.numeroResid);
		System.out.println("Telefone celular: " + c3.numeroCel);
		System.out.println("E-mail: " + c3.email);
		
	}

}
