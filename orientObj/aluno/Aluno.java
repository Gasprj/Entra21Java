package orientObj.aluno;

import java.util.Scanner;

public class Aluno {
	
	Scanner ent = new Scanner(System.in);
	String[] disciplina = new String[3];
	double[][] nota = new double[3][3];
	double media;
	double soma;
	String nome;
	String curso;
	int matricula;
	
	void entradaDeDados() {
		System.out.print("Informe o nome do aluno:");
		this.nome = ent.nextLine();
		System.out.print("Informe o número de matrícula:");
		this.matricula = ent.nextInt();
		ent.nextLine();
		System.out.print("Informe o curso do aluno:");
		this.curso = ent.nextLine();
		
		for (int i = 0; i < this.disciplina.length; i++) {
			
			System.out.print("\nInforme o nome da matéria: ");
			this.disciplina[i] = ent.nextLine();
			for (int j = 0; j < this.nota[i].length; j++) {
				System.out.print("Informe a " + (j+1) + "ª nota obtida: ");
				this.nota[i][j] = ent.nextDouble();
			}
			ent.nextLine();
		}
		ent.close();
	}
	
	void resultado() {
		for (int i = 0; i < this.disciplina.length; i++) {
			this.media = 0;
			this.soma = 0;
			System.out.println("\nMatéria: " + this.disciplina[i]);
			for (int j = 0; j < this.nota[i].length; j++) {
				System.out.println("Nota "  + (j+1) + ": " + this.nota[i][j]);
				soma += this.nota[i][j];
		}
			this.media = this.soma / this.nota[0].length;
			System.out.printf("Média: %.2f", this.media);
			if(this.media >= 7 && this.media <= 10)
				System.out.println("\nSituação: Aprovado\n");
			else if(this.media >= 0 && this.media < 7)
				System.out.println("\nSituação: Reprovado\n");
			else
				System.out.println("\nMédia inexistente");
		}
	}
	
	void exibirCont() {
		System.out.println("\n\n-------------------------------------------");
		System.out.println(" === DADOS E SITUAÇÃO ESCOLAR DO ALUNO === ");
		System.out.println("___________________________________________");
		System.out.println("Nome: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Curso: " + this.curso);
		resultado();
	}
	

}
