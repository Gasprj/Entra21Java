package ListaExerc03;

public class Exercicio14 {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println(b);
		
		b = 5;
		
		System.out.println(a + " " + b);
		String s = "";
		s.formatted("Os valores são %d e %d.", a, b);
		System.out.println(s);
	}
}
