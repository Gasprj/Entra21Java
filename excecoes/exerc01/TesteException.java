package excecoes.exerc01;

public class TesteException {
	public static void main(String[] args) {
		System.out.println("Início do main");
		try {
			metodo01();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro no tamanho do Array.");
		}
		System.out.println("Fim do main");
		
	}
	
	static void metodo01() {
		System.out.println("Início do método01");
		metodo02();
		System.out.println("Fim do método01");
	}
	
	static void metodo02() {
		System.out.println("Início do método02");
		int[] array = new int[10];
		for (int i = 0; i < 15; i++) {
			array [i] = i;
			System.out.println(i);
		}
		System.out.println("Fim do método02");
	}

}
