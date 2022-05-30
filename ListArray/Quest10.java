package ListArray;

import java.util.Arrays;
import java.util.Scanner;

public class Quest10 {
	public static void main(String[] args) {
Scanner ent = new Scanner(System.in);
		
		
		System.out.print("Informe a quantidade de alunos: ");
		int alunos = ent.nextInt();
		System.out.print("Informe a quantidade de notas por aluno: ");
		int notas = ent.nextInt();
		
		double[] [] notasTurma = new double[alunos][notas];
		double[] result = new double[alunos];
		double soma = 0;
		int cont = 0;
		
		System.out.println();
		
		for (int a = 0; a < notasTurma.length; a++) {
			soma = 0;
			for (int n = 0; n < notasTurma[a].length; n++) {
				System.out.printf("Informe a %dª nota do %dº aluno: ", a + 1, n + 1);
				notasTurma[a][n] = ent.nextDouble();
				soma += notasTurma[a][n];
			}
			
			result[a] = soma / notas;
		}

		System.out.println();
		
		for (double[] notaTot : notasTurma) {
			String situacao = result[cont] >= 7 && result[cont] <= 10 ? " Aprovado!" : "Média inexistente.";
			situacao = result[cont] >= 0 && result[cont] < 7 ? " Reprovado!" : situacao;
			
			System.out.printf("Notas do %dº aluno: ", cont + 1);
			System.out.println(Arrays.toString(notaTot));
			System.out.printf("Média do %dº aluno: ", cont + 1);
			System.out.println(result[cont]);
			System.out.println("Situação: " + situacao + "\n");
			
			cont++;
		}
		
		ent.close();	
	}
}
