package Lista06;

public class Exerc06 {
	public static void main(String[] args) {
	
	double chico = 1.50;
	double juca = 1.10;
	int anos = 0;
	
	while(juca <= chico){
		juca += 0.03;
		chico += 0.02;
		anos++;
		
		if(juca > chico)
		System.out.printf("Juca serás maior que Chico após %d anos.", anos);
	}
	
	}
}
