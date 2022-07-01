package refeicao;

public class Almoco {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa(89.150);
		Comida arroz = new Arroz(0.327);
		Feijao feijao = new Feijao(0.183);
		Sorvete sorvete = new Sorvete(0.450);
		
		System.out.println(pessoa.getPeso());
		System.out.println();
		System.out.println(arroz.getPeso());
		System.out.println(feijao.getPeso());
		System.out.println(sorvete.getPeso());
		System.out.println(pessoa.pesoPrato());
		System.out.println();
		pessoa.fazerPrato(arroz);
		System.out.println(pessoa.pesoPrato());
		System.out.println();
		pessoa.fazerPrato(feijao);
		System.out.println(pessoa.pesoPrato());
		System.out.println();
		pessoa.fazerPrato(sorvete);
		System.out.println(pessoa.pesoPrato());
		System.out.println();
		System.out.println(pessoa.getPeso());
		System.out.println();
		pessoa.comer();
		System.out.println(pessoa.getPeso());
	}

}
