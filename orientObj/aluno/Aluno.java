package orientObj.aluno;

import java.util.Scanner;

public class Aluno {
	
	private Scanner ent = new Scanner(System.in);
	private String[] disciplina = new String[3];
	private double[][] nota = new double[3][3];
	private double media;
	private double soma;
	private String nome;
	private String curso;
	private int matricula;
	
	public Aluno() {
	}
	
	public Aluno(String nome, String curso, double soma, double media, int matricula){
		this.nome = nome;
		this.curso = curso;
		this.soma = soma;
		this.media = media;
		this.matricula = matricula;
	}
	
	public String getDisciplina(int i) {
		return disciplina[i];
	}

	public void setDisciplina(int i, String disciplina) {
		this.disciplina[i] = disciplina;
	}

	public double getNota(int i, int j) {
		return nota[i][j];
	}

	public void setNota(int i, int j, double nota) {
		this.nota[i][j] = nota;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void entradaDeDados() {
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
	
	public void resultado() {
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
	
	public void exibirCont() {
		System.out.println("\n\n-------------------------------------------");
		System.out.println(" === DADOS E SITUAÇÃO ESCOLAR DO ALUNO === ");
		System.out.println("___________________________________________");
		System.out.println("Nome: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Curso: " + this.curso);
		resultado();
	}
	
}
