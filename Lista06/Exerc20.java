package Lista06;

import java.util.Scanner;

public class Exerc20 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		for(;;) {
			System.out.print("Informe o primeiro número: ");
			long n1 = ent.nextLong();
			System.out.print("Informe o segundo número: ");
			long n2 = ent.nextLong();
			
			long soma = 0;
			
			if(n1 > n2) {
				n1--;
				while(n2 < n1) {
					n2++;
					soma += n2;
					System.out.println(n2 + " - " + soma);
				}
			}else if(n1 < n2) {
				n2--;
				while(n2 > n1) {
					n1++;
					soma += n1;
					System.out.println(n1 + " - " + soma);
				}
			}
			System.out.println("Soma dos números do intervalo informado = " + soma + "\n");
		}
			
//		ent.close();	
			
	}

}
