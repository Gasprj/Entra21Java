package Lista05.ListaExt;

import java.util.Scanner;

public class Exerc01 {
	public static void main(String[] args) {
	
	Scanner ent = new Scanner(System.in);

	System.out.print("Informe o indice de polui��o: ");
	float indice = ent.nextFloat();
	
	String notif = indice >= 0 && indice <= 0.25 ? "Indice aceit�vel." : "Indice acima da toler�ncia.";
	notif =  indice >= 0.3 ? "Ind�strias do grupo 1 devem encerrar suas atividades." : notif;
	notif =  indice >= 0.4 ? "Ind�strias do grupo 1 e 2 devem encerrar suas atividades." : notif;
	notif =  indice >= 0.5 ? "Ind�strias do grupo 1, 2 e 3 devem encerrar suas atividades." : notif;

	System.out.println(notif);
	
	ent.close();
		
	}
}
