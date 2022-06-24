package ExercOrieObj01.aluno;

import java.util.Scanner;

public class DadosAluno {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		Aluno aluno = new Aluno();
		
		System.out.print("Informe o nome do aluno:");
		aluno.nome = ent.nextLine();
		System.out.print("Informe o número de matrícula:");
		aluno.matricula = ent.nextInt();
		ent.nextLine();
		System.out.print("Informe o curso do aluno:");
		aluno.curso = ent.nextLine();
		
		for (int i = 0; i < aluno.disciplina.length; i++) {
			System.out.print("\nInforme o nome da matéria: ");
			aluno.disciplina[i] = ent.nextLine();
			System.out.print("Informe a nota obtida: ");
			aluno.nota[i] = ent.nextDouble();
			ent.nextLine();
		}
		
		aluno.allCont();

		ent.close();
		
	}

}
