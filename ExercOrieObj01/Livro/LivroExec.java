package ExercOrieObj01.Livro;

public class LivroExec {
	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		Livro l2 = new Livro();
		
		l1.titulo = "Homem que � homem...";
		l1.autor = "Edwin Louis Cole";
		l1.genero = "Crist�o";
		l1.capitulos = 12;
		l1.numPaginas = 483;
		
		l2.titulo = "O contador de hist�rias";
		l2.autor = "Harold Robbins";
		l2.genero = "Romance";
		l2.capitulos = 24;
		l2.numPaginas = 376;
		
		System.out.println("---LIVROS---");
		System.out.println("____________");
		System.out.println("\nT�tulo: " + l1.titulo);
		System.out.println("Autor: " + l1.autor);
		System.out.println("G�nero: " + l1.genero);
		System.out.println("Capitulos: " + l1.capitulos);
		System.out.println("N�mero de p�ginas: " + l1.numPaginas);
		System.out.println("\nT�tulo: " + l2.titulo);
		System.out.println("Autor: " + l2.autor);
		System.out.println("G�nero: " + l2.genero);
		System.out.println("Capitulos: " + l2.capitulos);
		System.out.println("N�mero de p�ginas: " + l2.numPaginas);
	}

}
