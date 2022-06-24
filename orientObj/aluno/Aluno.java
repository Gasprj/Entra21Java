package orientObj.aluno;

public class Aluno {
	
	String[] disciplina = new String[3];
	double[][] nota = new double[3][3];
	double media;
	double soma;
	String nome;
	String curso;
	int matricula;
	
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
				System.out.println("\nMédia inexistente\n");
		}
	}
	
	void allCont() {
		System.out.println("\n\n-------------------------------------------");
		System.out.println(" === DADOS E SITUAÇÃO ESCOLAR DO ALUNO === ");
		System.out.println("___________________________________________");
		System.out.println("Nome: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Curso: " + this.curso);
		resultado();
	}
	

}
