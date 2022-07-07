package orientObj02.agenda;

public class Agenda {
	
	private final Contato[] contato;
	private static String nome;
	
	public Agenda() {
		this.contato = new Contato[3];
	}
	
	@SuppressWarnings("static-access")
	public Agenda(String nome) {
		this.contato = new Contato[3];
		this.nome = nome;
	}

	public Contato getContato(int i) {
		return this.contato[i];
	}

	public void setContato(int i, Contato contato) {
		this.contato[i] = contato;
	}

	@SuppressWarnings("static-access")
	public String getNome() {
		return this.nome;
	}

	@SuppressWarnings("static-access")
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@SuppressWarnings("static-access")
	public String toString() {
		return "Nome da Agenda: " + this.getNome();
	}
	
	@SuppressWarnings("static-access")
	public void exibirContatos() {
		System.out.println("\n_________________________");
		System.out.println("    ==  AGENDA  ==");   
		System.out.println("NOME... " + this.nome);
		System.out.println("_________________________");
		System.out.println("   ==  CONTATOS  ==");
		System.out.println("-------------------------");
		for (Contato cont : this.contato) {
			System.out.println(cont);
			System.out.println("-------------------------");
		}
	}
	
}
