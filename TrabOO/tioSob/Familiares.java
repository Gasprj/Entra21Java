package OriObj.TrabOO.tioSob;

public class Familiares {
	public static void main(String[] args) {
		
		Tio t1 = new Tio("Carlos");
		Tio t2 = new Tio("Manoel");
		Tio t3 = new Tio("Gaspar");

		var s1 = new Sobrinho("Pedro");
		var s2 = new Sobrinho("Paulo");
		var s3 = new Sobrinho("Ana");
		
		s1.addTio(t1);
		s1.addTio(t2);
		s2.addTio(t2);
		s2.addTio(t3);
		
		t3.addSobrinho(s1);
		t3.addSobrinho(s3);
		
		System.out.println(s1.tios.get(0) + "\n");
		
		for (Tio t : s1.tios) {
			System.out.println("O tio " + t + " possui os sobrinhos: ");
			for (int i = 0; i < t.sobrinhos.size() ; i++) {
				System.out.println(t.sobrinhos.get(i));
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (Tio t : s1.tios) {
			System.out.print("O tio " + t + " possui os sobrinhos: ");
			System.out.println(t.sobrinhos);
			System.out.println();
		}
		
	}

}
