package Lista05;

import java.util.Scanner;

public class Exerc14 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	System.out.print("Informe seu saldo médio: ");
	double salMed = ent.nextDouble();
	
	double cred = salMed >= 201 && salMed <= 400 ? salMed * 0.2 : 0;
	cred = salMed >= 401 && salMed <= 600 ? salMed * 0.3 : cred;
	cred = salMed > 600 ? salMed * 0.4 : cred;
	
	System.out.printf("Com um saldo médio anual de %.2f %nvocê conseguiu %.2f de crédito.", salMed, cred);
	
	ent.close();	
		
	}
}
