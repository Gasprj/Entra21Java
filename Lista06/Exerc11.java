package Lista06;

import java.util.Scanner;

public class Exerc11 {
	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);

	int num = 0;
	
	do {
		System.out.print("Informe o n�mero:");
		num = ent.nextInt();
		
		if(num >=1 && num <= 10) {
			System.out.println("1 * " + num + " = " + (num * 1));
			System.out.println("2 * " + num + " = " + (num * 2));
			System.out.println("3 * " + num + " = " + (num * 3));
			System.out.println("4 * " + num + " = " + (num * 4));
			System.out.println("5 * " + num + " = " + (num * 5));
			System.out.println("6 * " + num + " = " + (num * 6));
			System.out.println("7 * " + num + " = " + (num * 7));
			System.out.println("8 * " + num + " = " + (num * 8));
			System.out.println("9 * " + num + " = " + (num * 9));
			System.out.println("10 * " + num + " = " + (num * 10) + "\n");
		}else
			System.out.println("\nTente outor n�mero...");
		
	}while(num !=0);

	ent.close();
		
	}
}
