package orientObj02.curso;

import java.util.Scanner;

public class InformacaoCurso {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		Curso curso = new Curso();
		System.out.print("Informe o nome do curso: ");
		curso.setNome(ent.nextLine());
		System.out.print("Informe o hor�rio do curso: ");
		curso.setHorario(ent.nextLine());
		
		Aluno a1 = new Aluno();
		System.out.print("\nInforme o nome do 1� aluno: ");
		a1.setNome(ent.nextLine());
		System.out.print("Informe a matr�cula: ");
		a1.setMatricula(ent.next());
		for (int i = 0; i < 4; i++) {
			System.out.printf("Informe a %d� nota: ", (i+1));
			a1.setNotas(i, ent.nextFloat());
		}
		Aluno a2 = new Aluno();
		ent.nextLine();
		System.out.print("\nInforme o nome do 2� aluno: ");
		a2.setNome(ent.nextLine());
		System.out.print("Informe a matr�cula: ");
		a2.setMatricula(ent.next());
		for (int i = 0; i < 4; i++) {
			System.out.printf("Informe a %d� nota: ", (i+1));
			a2.setNotas(i, ent.nextFloat());
		}
		Aluno a3 = new Aluno();
		ent.nextLine();
		System.out.print("\nInforme o nome do 3� aluno: ");
		a3.setNome(ent.nextLine());
		System.out.print("Informe a matr�cula: ");
		a3.setMatricula(ent.next());
		for (int i = 0; i < 4; i++) {
			System.out.printf("Informe a %d� nota: ", (i+1));
			a3.setNotas(i, ent.nextFloat());
		}
		Aluno a4 = new Aluno();
		ent.nextLine();
		System.out.print("\nInforme o nome do 4� aluno: ");
		a4.setNome(ent.nextLine());
		System.out.print("Informe a matr�cula: ");
		a4.setMatricula(ent.next());
		for (int i = 0; i < 4; i++) {
			System.out.printf("Informe a %d� nota: ", (i+1));
			a4.setNotas(i, ent.nextFloat());
		}
		Aluno a5 = new Aluno();
		ent.nextLine();
		System.out.print("\nInforme o nome do 5� aluno: ");
		a5.setNome(ent.nextLine());
		System.out.print("Informe a matr�cula: ");
		a5.setMatricula(ent.next());
		for (int i = 0; i < 4; i++) {
			System.out.printf("Informe a %d� nota: ", (i+1));
			a5.setNotas(i, ent.nextFloat());
		}
		
		curso.setAluno(0, a1);
		curso.setAluno(1, a2);
		curso.setAluno(2, a3);
		curso.setAluno(3, a4);
		curso.setAluno(4, a5);
		
		System.out.println(curso);
		curso.getAlunoSituacao();
		curso.mediaTurma();
		
		ent.close();
	}

}
