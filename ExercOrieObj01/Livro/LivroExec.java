package ExercOrieObj01.Livro;

public class LivroExec {
	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		Livro l2 = new Livro();
		
		l1.titulo = "Homem que é homem...";
		l1.autor = "Edwin Louis Cole";
		l1.genero = "Cristâo";
		l1.capitulos = 12;
		l1.numPaginas = 483;
		
		l2.titulo = "O contador de histórias";
		l2.autor = "Harold Robbins";
		l2.genero = "Romance";
		l2.capitulos = 24;
		l2.numPaginas = 376;
		
		System.out.println("---LIVROS---");
		System.out.println("____________");
		System.out.println("\nTítulo: " + l1.titulo);
		System.out.println("Autor: " + l1.autor);
		System.out.println("Gênero: " + l1.genero);
		System.out.println("Capitulos: " + l1.capitulos);
		System.out.println("Número de páginas: " + l1.numPaginas);
		System.out.println("\nTítulo: " + l2.titulo);
		System.out.println("Autor: " + l2.autor);
		System.out.println("Gênero: " + l2.genero);
		System.out.println("Capitulos: " + l2.capitulos);
		System.out.println("Número de páginas: " + l2.numPaginas);
	}

}
