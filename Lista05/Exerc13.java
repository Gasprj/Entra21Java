package Lista05;

import java.util.Scanner;

public class Exerc13 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	float l1 = 0f;
	float l2 = 0f;
	float l3 = 0f;
	
	do {
		System.out.print("Digite o valor do primeiro lado ou (0) para encerrar: ");
		l1 = ent.nextFloat();
		
		if(l1 == 0) {
			break;
		}
		
		System.out.print("Digite o valor do segundo lado: ");
		l2 = ent.nextFloat();
		System.out.print("Digite o valor do terceiro lado: ");
		l3 = ent.nextFloat();
		
		float sl = l1 + l2;
		
		if(sl >= l3) {
			if(l1 == l2 && l2 == l3) {
				System.out.println("Esse triangulo � equil�tero.\n");
			}else if (l1 != l2 && l2 != l3 && l3 != l1) {
				System.out.println("Esse triangulo � escaleno.\n");
			}else {
				System.out.println("Esse triangulo � is�sceles.\n");
			}
		}else
			System.out.println("Esse triangulo n�o existe.");
		
	}while (l1 != 0);
	
	System.out.println("At� a pr�xima!");
	
	ent.close();	
		
	}
}
