package orientObj02.curso;

public class Curso {
	
	private Aluno[] aluno = new Aluno[5];
	private Professor professor;
	private String nome;
	private String horario;
	private float soma;
	private float media;
	
	public Curso() {
	}

	public Curso(String nome, String horario) {
		this.nome = nome;
		this.horario = horario;
	}

	public void getAlunoSituacao() {
		for (int i = 0; i < aluno.length; i++) {
			System.out.printf("%n%dº ALUNO", (i + 1));
			System.out.println(aluno[i]);
			aluno[i].getNotasMediaSituacao();
		}
	}

	public void setAluno(int i, Aluno aluno) {
		this.aluno[i] = aluno;
	}

	public Professor getProfessor() {
		return this.professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public void mediaTurma() {
		for (int i = 0; i < aluno.length; i++) {
			this.soma += aluno[i].getMedia();
		}
		this.media = this.soma / aluno.length;
		System.out.printf("%nMédia geral da turma: %.2f%n", this.media);
	}
	
	public String toString() {
		return "\n____________________________" + "\n   Curso de " + this.nome + "\n   Horário: " + this.horario + "\n____________________________";
	}

}
