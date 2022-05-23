package Lista05;

import java.util.Scanner;

public class Exerc06 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	System.out.print("Informe sua altura: ");
	double altura = ent.nextDouble();
	System.out.print("Informe seu peso: ");
	double peso = ent.nextDouble();
	
	double imc = peso / (altura * altura);
	
	String result = imc < 18.5 ? "abaixo do peso." : "obeso.";
	result = imc >= 18.5 && imc <= 25 ? "normal." : result;
	result = imc > 25 && imc <= 30 ? "acima do peso." : result;
	
	System.out.printf("%nSeu imc é %.1f. Você esta %s", imc,  result);

	ent.close();	
		
	}
}
