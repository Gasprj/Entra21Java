package ExercOrieObj01.aluno;

public class Aluno {
	
	String[] disciplina = new String[3];
	double[] nota = new double[3];
	String nome;
	String curso;
	int matricula;
	
	void resultado() {
		for (int i = 0; i < this.disciplina.length; i++) {
			System.out.println("\nMatéria: " + this.disciplina[i]);
			System.out.println("Nota: " + this.nota[i]);
			if(this.nota[i] >= 7 && this.nota[i] <= 10)
				System.out.println("Situação: Aprovado\n");
			else if(this.nota[i] >= 0 && this.nota[i] < 7)
				System.out.println("Situação: Reprovado\n");
			else
				System.out.println("Nota inexistente\n");
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
