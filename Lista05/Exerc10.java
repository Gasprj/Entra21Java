package Lista05;

import java.util.Scanner;

public class Exerc10 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	System.out.print("Informe o valor da compra:");
	int comp = ent.nextInt();
	System.out.print("Informe o valor pago:");
	int pag = ent.nextInt();
	
	int troco = pag - comp;
	
	int unid = 0;
	int dez = 0;
	int cent = 0;
	
	if(troco < 10 && troco > 0) {
		unid = troco;
	}else if (troco > 9 && troco <100) {
		unid = troco % 10;
		dez = troco / 10;
	}else {
		unid = (troco % 100) % 10;
		dez = (troco % 100) / 10;
		cent = troco / 100;
	}
	
	String result = String.format("Troco: %d notas de R$ 100,00 %n- "
			+ "%d notas de R$ 10,00 - %d notas de R$ 1,00.", cent, dez, unid);

	System.out.println(result);
	
	ent.close();	
		
	}
}
