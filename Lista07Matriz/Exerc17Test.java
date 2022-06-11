package Lista07Matriz;

public class Exerc17Test {
	public static void main(String[] args) {
		
		Exerc17 ex = new Exerc17("Mari");
		Exerc17 ex1 = new Exerc17("Ana");
		Exerc17 ex2 = new Exerc17(14);
		Exerc17 ex3 = new Exerc17(14);
		
		System.out.println(ex.equals2("Mari"));
		System.out.println(ex1.equals1(ex2));
		System.out.println(ex2.equals2(14));
		
	}
	
}
