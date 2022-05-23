package ListaExerc03;

import java.util.Scanner;

public class Exercicio16Execussao {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		Exercicio16 ex = new Exercicio16();
		System.out.print("Informe a receita: ");
		ex.receita = ent.nextDouble();
		System.out.print("Informe a despesa: ");
		ex.despesa = ent.nextDouble();
		
		double luc = ex.lucro();
		double per = ex.percent();
		
		System.out.printf("%nSeu lucro foi de %.2f reais.", luc);
		System.out.printf("%nO percentual das despesas em relação a receita é de %.1f por cento.", per);
		
		ent.close();
	}
}
