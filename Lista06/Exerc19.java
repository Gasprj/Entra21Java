package Lista06;

import java.util.Scanner;

public class Exerc19 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		while(true) {
			System.out.print("Informe o primeiro número: ");
			long n1 = ent.nextLong();
			System.out.print("Informe o segundo número: ");
			long n2 = ent.nextLong();
			
			if(n1 > n2) {
				n1--;
				while(n2 < n1) {
					n2++;
					System.out.println(n2);
				}
				System.out.println();
			}else if(n1 < n2) {
				n2--;
				while(n2 > n1) {
					n1++;
					System.out.println(n1);
				}
				System.out.println();
			}
		}

//		ent.close();	
	}

}
