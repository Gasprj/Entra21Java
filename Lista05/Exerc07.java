package Lista05;

import java.util.Scanner;

public class Exerc07 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	System.out.print("Informe a forma de pagamento: ");
	String formPag =ent.nextLine();
	System.out.print("Informe o valor a ser pago: ");
	float valor = ent.nextFloat();
	
	float valorPago = 0;
	
	if(formPag.equalsIgnoreCase("dinheiro") && valor >= 100) {
		valorPago = valor * 0.9f;
	}else
		valorPago = valor;
	
	System.out.println("\nTotal a ser pago: " + valorPago);
	
	ent.close();	
		
	}
}
