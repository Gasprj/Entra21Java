package orientObj.universidade;

import java.util.Objects;

public class AlunoUniver {
	
	CursosUniver curso;
	private String nomeAluno;
	private String matriculaAluno;
	private int cpfAluno;
	private String cursoAluno;
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getMatriculaAluno() {
		return matriculaAluno;
	}
	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}
	public int getCpfAluno() {
		return cpfAluno;
	}
	public void setCpfAluno(int cpfAluno) {
		this.cpfAluno = cpfAluno;
	}
	public String getCursoAluno() {
		return cursoAluno;
	}
	public void setCursoAluno(String cursoAluno) {
		this.cursoAluno = cursoAluno;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpfAluno, curso, cursoAluno, matriculaAluno, nomeAluno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoUniver other = (AlunoUniver) obj;
		return cpfAluno == other.cpfAluno && Objects.equals(curso, other.curso)
				&& Objects.equals(cursoAluno, other.cursoAluno) && Objects.equals(matriculaAluno, other.matriculaAluno)
				&& Objects.equals(nomeAluno, other.nomeAluno);
	}
	
}
